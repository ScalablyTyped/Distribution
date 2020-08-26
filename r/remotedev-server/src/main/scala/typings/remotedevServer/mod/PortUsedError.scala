package typings.remotedevServer.mod

import typings.remotedevServer.remotedevServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortUsedError extends js.Object {
  var portAlreadyUsed: `true` = js.native
  def on(status: String, cb: js.Function0[Unit]): Unit = js.native
}

object PortUsedError {
  @scala.inline
  def apply(on: (String, js.Function0[Unit]) => Unit, portAlreadyUsed: `true`): PortUsedError = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), portAlreadyUsed = portAlreadyUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortUsedError]
  }
  @scala.inline
  implicit class PortUsedErrorOps[Self <: PortUsedError] (val x: Self) extends AnyVal {
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
    def setOn(value: (String, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setPortAlreadyUsed(value: `true`): Self = this.set("portAlreadyUsed", value.asInstanceOf[js.Any])
  }
  
}

