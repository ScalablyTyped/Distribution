package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotIndicatorOptions extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DotIndicatorOptions {
  @scala.inline
  def apply(
    color: Color = null,
    size: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DotIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotIndicatorOptions]
  }
}

