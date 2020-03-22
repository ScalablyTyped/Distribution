package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/control.js
trait ControlModifierProps extends js.Object {
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var iconLeft: js.UndefOr[Boolean] = js.undefined
  var iconRight: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object ControlModifierProps {
  @scala.inline
  def apply(
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    iconLeft: js.UndefOr[Boolean] = js.undefined,
    iconRight: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): ControlModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(iconLeft)) __obj.updateDynamic("iconLeft")(iconLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlModifierProps]
  }
}

