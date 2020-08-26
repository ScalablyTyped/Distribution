package typings.prettier.mod

import typings.prettier.prettierStrings.boolean
import typings.prettier.prettierStrings.choice
import typings.prettier.prettierStrings.int
import typings.prettier.prettierStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportOption extends js.Object {
  var array: js.UndefOr[Boolean] = js.native
  var category: String = js.native
  var choices: js.UndefOr[js.Array[SupportOptionChoice]] = js.native
  var default: SupportOptionValue | js.Array[SupportOptionDefault] = js.native
  var deprecated: js.UndefOr[String] = js.native
  var description: String = js.native
  var name: String = js.native
  var oppositeDescription: js.UndefOr[String] = js.native
  var range: js.UndefOr[SupportOptionRange] = js.native
  var redirect: js.UndefOr[SupportOptionRedirect] = js.native
  var since: js.UndefOr[String] = js.native
  var `type`: int | boolean | choice | path = js.native
}

object SupportOption {
  @scala.inline
  def apply(
    category: String,
    default: SupportOptionValue | js.Array[SupportOptionDefault],
    description: String,
    name: String,
    `type`: int | boolean | choice | path
  ): SupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOption]
  }
  @scala.inline
  implicit class SupportOptionOps[Self <: SupportOption] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultVarargs(value: SupportOptionDefault*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: SupportOptionValue | js.Array[SupportOptionDefault]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: int | boolean | choice | path): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setChoicesVarargs(value: SupportOptionChoice*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[SupportOptionChoice]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    @scala.inline
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setOppositeDescription(value: String): Self = this.set("oppositeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOppositeDescription: Self = this.set("oppositeDescription", js.undefined)
    @scala.inline
    def setRange(value: SupportOptionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRedirect(value: SupportOptionRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
  
}

