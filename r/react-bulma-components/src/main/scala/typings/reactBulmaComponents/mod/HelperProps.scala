package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/modifiers/helpers.js
trait HelperProps extends js.Object {
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var marginless: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[right | left] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  // https://github.com/couds/react-bulma-components/issues/112
  // unselectable?: "on" | "off";
  var unselectable: js.UndefOr[Boolean] = js.undefined
}

object HelperProps {
  @scala.inline
  def apply(
    clearfix: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    marginless: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    pull: right | left = null,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    unselectable: js.UndefOr[Boolean] = js.undefined
  ): HelperProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperProps]
  }
}

