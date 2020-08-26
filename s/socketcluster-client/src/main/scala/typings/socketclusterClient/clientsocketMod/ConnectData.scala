package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.transportMod.OnOpenValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectData extends OnOpenValue {
  def processPendingSubscriptions(): Unit = js.native
}

object ConnectData {
  @scala.inline
  def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double, processPendingSubscriptions: () => Unit): ConnectData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], processPendingSubscriptions = js.Any.fromFunction0(processPendingSubscriptions))
    __obj.asInstanceOf[ConnectData]
  }
  @scala.inline
  implicit class ConnectDataOps[Self <: ConnectData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProcessPendingSubscriptions(value: () => Unit): Self = this.set("processPendingSubscriptions", js.Any.fromFunction0(value))
  }
  
}

