package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`1`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`2`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`3`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`4`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`5`
import typings.reactBulmaComponents.reactBulmaComponentsNumbers.`6`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bold
import typings.reactBulmaComponents.reactBulmaComponentsStrings.light
import typings.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typings.reactBulmaComponents.reactBulmaComponentsStrings.semibold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Heading ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/heading/heading.js
trait HeadingModifierProps extends js.Object {
  var heading: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var spaced: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[Boolean] = js.undefined
  var weight: js.UndefOr[light | normal | semibold | bold] = js.undefined
}

object HeadingModifierProps {
  @scala.inline
  def apply(
    heading: js.UndefOr[Boolean] = js.undefined,
    size: `1` | `2` | `3` | `4` | `5` | `6` = null,
    spaced: js.UndefOr[Boolean] = js.undefined,
    subtitle: js.UndefOr[Boolean] = js.undefined,
    weight: light | normal | semibold | bold = null
  ): HeadingModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spaced)) __obj.updateDynamic("spaced")(spaced.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitle)) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingModifierProps]
  }
}

