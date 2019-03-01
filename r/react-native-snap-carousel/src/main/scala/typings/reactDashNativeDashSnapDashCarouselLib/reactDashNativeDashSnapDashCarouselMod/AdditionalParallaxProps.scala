package typings
package reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalParallaxProps extends js.Object {
  var carouselRef: js.UndefOr[
    reactLib.reactMod.Component[reactDashNativeLib.reactDashNativeMod.FlatListProps[_], js.Object, _]
  ] = js.undefined
  var itemHeight: js.UndefOr[scala.Double] = js.undefined
  var itemWidth: js.UndefOr[scala.Double] = js.undefined
  var scrollPosition: js.UndefOr[reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value] = js.undefined
  var sliderHeight: js.UndefOr[scala.Double] = js.undefined
  var sliderWidth: js.UndefOr[scala.Double] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object AdditionalParallaxProps {
  @scala.inline
  def apply(
    carouselRef: reactLib.reactMod.Component[reactDashNativeLib.reactDashNativeMod.FlatListProps[_], js.Object, _] = null,
    itemHeight: scala.Int | scala.Double = null,
    itemWidth: scala.Int | scala.Double = null,
    scrollPosition: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value = null,
    sliderHeight: scala.Int | scala.Double = null,
    sliderWidth: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): AdditionalParallaxProps = {
    val __obj = js.Dynamic.literal()
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef)
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition)
    if (sliderHeight != null) __obj.updateDynamic("sliderHeight")(sliderHeight.asInstanceOf[js.Any])
    if (sliderWidth != null) __obj.updateDynamic("sliderWidth")(sliderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[AdditionalParallaxProps]
  }
}

