package typings.requireHacker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogOptions extends js.Object {
  /* Log debug messages to the console. */
  var debug: js.UndefOr[Boolean] = js.native
}

object LogOptions {
  @scala.inline
  def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  @scala.inline
  implicit class LogOptionsOps[Self <: LogOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
  
}

