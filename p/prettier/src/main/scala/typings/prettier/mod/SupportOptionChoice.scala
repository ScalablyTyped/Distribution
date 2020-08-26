package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportOptionChoice extends js.Object {
  var deprecated: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var redirect: js.UndefOr[SupportOptionValue] = js.native
  var since: js.UndefOr[String] = js.native
  var value: Boolean | String = js.native
}

object SupportOptionChoice {
  @scala.inline
  def apply(value: Boolean | String): SupportOptionChoice = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOptionChoice]
  }
  @scala.inline
  implicit class SupportOptionChoiceOps[Self <: SupportOptionChoice] (val x: Self) extends AnyVal {
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
    def setValue(value: Boolean | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setRedirect(value: SupportOptionValue): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
  
}

