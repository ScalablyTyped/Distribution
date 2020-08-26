package typings.stompit.connectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal class, which is not exported
@js.native
trait ConnectState extends js.Object {
  var failedConnects: Double = js.native
  var serverProperties: Server = js.native
}

object ConnectState {
  @scala.inline
  def apply(failedConnects: Double, serverProperties: Server): ConnectState = {
    val __obj = js.Dynamic.literal(failedConnects = failedConnects.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectState]
  }
  @scala.inline
  implicit class ConnectStateOps[Self <: ConnectState] (val x: Self) extends AnyVal {
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
    def setFailedConnects(value: Double): Self = this.set("failedConnects", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerProperties(value: Server): Self = this.set("serverProperties", value.asInstanceOf[js.Any])
  }
  
}

