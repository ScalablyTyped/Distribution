package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Tag ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/tag/tag.js
trait TagModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[medium | large] = js.undefined
}

object TagModifierProps {
  @scala.inline
  def apply(
    color: Color = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    rounded: js.UndefOr[Boolean] = js.undefined,
    size: medium | large = null
  ): TagModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagModifierProps]
  }
}

