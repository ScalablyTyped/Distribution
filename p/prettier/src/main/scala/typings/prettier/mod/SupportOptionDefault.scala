package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportOptionDefault extends js.Object {
  var since: String = js.native
  var value: SupportOptionValue = js.native
}

object SupportOptionDefault {
  @scala.inline
  def apply(since: String, value: SupportOptionValue): SupportOptionDefault = {
    val __obj = js.Dynamic.literal(since = since.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOptionDefault]
  }
  @scala.inline
  implicit class SupportOptionDefaultOps[Self <: SupportOptionDefault] (val x: Self) extends AnyVal {
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
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: SupportOptionValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

