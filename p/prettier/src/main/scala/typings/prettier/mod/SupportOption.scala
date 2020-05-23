package typings.prettier.mod

import typings.prettier.prettierStrings.boolean
import typings.prettier.prettierStrings.choice
import typings.prettier.prettierStrings.int
import typings.prettier.prettierStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOption extends js.Object {
  var array: js.UndefOr[Boolean] = js.undefined
  var category: String
  var choices: js.UndefOr[js.Array[SupportOptionChoice]] = js.undefined
  var default: SupportOptionValue | js.Array[SupportOptionDefault]
  var deprecated: js.UndefOr[String] = js.undefined
  var description: String
  var name: String
  var oppositeDescription: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[SupportOptionRange] = js.undefined
  var redirect: js.UndefOr[SupportOptionRedirect] = js.undefined
  var since: js.UndefOr[String] = js.undefined
  var `type`: int | boolean | choice | path
}

object SupportOption {
  @scala.inline
  def apply(
    category: String,
    default: SupportOptionValue | js.Array[SupportOptionDefault],
    description: String,
    name: String,
    `type`: int | boolean | choice | path,
    array: js.UndefOr[Boolean] = js.undefined,
    choices: js.Array[SupportOptionChoice] = null,
    deprecated: String = null,
    oppositeDescription: String = null,
    range: SupportOptionRange = null,
    redirect: SupportOptionRedirect = null,
    since: String = null
  ): SupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.get.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (oppositeDescription != null) __obj.updateDynamic("oppositeDescription")(oppositeDescription.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOption]
  }
}

