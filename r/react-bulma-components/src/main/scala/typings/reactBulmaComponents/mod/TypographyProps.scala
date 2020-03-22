package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`1`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`2`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`3`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`4`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`5`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`6`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.capitalized
import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.justified
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.light
import typings.reactBulmaComponents.reactBulmaComponentsStrings.lowercase
import typings.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.semibold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/modifiers/typography.js
trait TypographyProps extends js.Object {
  var italic: js.UndefOr[Boolean] = js.undefined
  var textAlignment: js.UndefOr[centered | justified | left | right] = js.undefined
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
  var textWeight: js.UndefOr[light | normal | semibold | bold] = js.undefined
}

object TypographyProps {
  @scala.inline
  def apply(
    italic: js.UndefOr[Boolean] = js.undefined,
    textAlignment: centered | justified | left | right = null,
    textSize: `1` | `2` | `3` | `4` | `5` | `6` = null,
    textTransform: capitalized | lowercase | uppercase = null,
    textWeight: light | normal | semibold | bold = null
  ): TypographyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (textWeight != null) __obj.updateDynamic("textWeight")(textWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps]
  }
}

