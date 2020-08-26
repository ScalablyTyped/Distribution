package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportOptionRedirect extends js.Object {
  var options: String = js.native
  var value: SupportOptionValue = js.native
}

object SupportOptionRedirect {
  @scala.inline
  def apply(options: String, value: SupportOptionValue): SupportOptionRedirect = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOptionRedirect]
  }
  @scala.inline
  implicit class SupportOptionRedirectOps[Self <: SupportOptionRedirect] (val x: Self) extends AnyVal {
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
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: SupportOptionValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

