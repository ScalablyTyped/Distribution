package typings
package reactDashFoundationLib.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderCommonProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isVertical: js.UndefOr[scala.Boolean] = js.undefined
}

object SliderCommonProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isVertical: js.UndefOr[scala.Boolean] = js.undefined
  ): SliderCommonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isVertical)) __obj.updateDynamic("isVertical")(isVertical)
    __obj.asInstanceOf[SliderCommonProps]
  }
}

