package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOption extends js.Object {
  var array: js.UndefOr[scala.Boolean] = js.undefined
  var choices: js.UndefOr[js.Array[SupportOptionChoice]] = js.undefined
  var default: SupportOptionValue
  var deprecated: js.UndefOr[java.lang.String] = js.undefined
  var description: java.lang.String
  var oppositeDescription: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[SupportOptionRange] = js.undefined
  var redirect: js.UndefOr[SupportOptionRedirect] = js.undefined
  var since: js.UndefOr[java.lang.String] = js.undefined
  var `type`: prettierLib.prettierLibStrings.int | prettierLib.prettierLibStrings.boolean | prettierLib.prettierLibStrings.choice | prettierLib.prettierLibStrings.path
}

object SupportOption {
  @scala.inline
  def apply(
    default: SupportOptionValue,
    description: java.lang.String,
    `type`: prettierLib.prettierLibStrings.int | prettierLib.prettierLibStrings.boolean | prettierLib.prettierLibStrings.choice | prettierLib.prettierLibStrings.path,
    array: js.UndefOr[scala.Boolean] = js.undefined,
    choices: js.Array[SupportOptionChoice] = null,
    deprecated: java.lang.String = null,
    oppositeDescription: java.lang.String = null,
    range: SupportOptionRange = null,
    redirect: SupportOptionRedirect = null,
    since: java.lang.String = null
  ): SupportOption = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (oppositeDescription != null) __obj.updateDynamic("oppositeDescription")(oppositeDescription)
    if (range != null) __obj.updateDynamic("range")(range)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[SupportOption]
  }
}

