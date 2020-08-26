package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Warning extends js.Object {
  var warning: typings.std.Error = js.native
}

object Warning {
  @scala.inline
  def apply(warning: typings.std.Error): Warning = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  @scala.inline
  implicit class WarningOps[Self <: Warning] (val x: Self) extends AnyVal {
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
    def setWarning(value: typings.std.Error): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

