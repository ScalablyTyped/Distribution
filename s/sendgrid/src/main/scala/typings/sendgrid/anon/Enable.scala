package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enable extends js.Object {
  var enable: Boolean = js.native
  var enable_text: Boolean = js.native
}

object Enable {
  @scala.inline
  def apply(enable: Boolean, enable_text: Boolean): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enable_text = enable_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
  @scala.inline
  implicit class EnableOps[Self <: Enable] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable_text(value: Boolean): Self = this.set("enable_text", value.asInstanceOf[js.Any])
  }
  
}

