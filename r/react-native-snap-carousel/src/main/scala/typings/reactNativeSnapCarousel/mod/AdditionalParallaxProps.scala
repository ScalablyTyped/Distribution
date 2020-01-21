package typings.reactNativeSnapCarousel.mod

import typings.react.mod.Component
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.FlatListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalParallaxProps extends js.Object {
  var carouselRef: js.UndefOr[Component[FlatListProps[_], js.Object, _]] = js.undefined
  var itemHeight: js.UndefOr[Double] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var scrollPosition: js.UndefOr[Value] = js.undefined
  var sliderHeight: js.UndefOr[Double] = js.undefined
  var sliderWidth: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object AdditionalParallaxProps {
  @scala.inline
  def apply(
    carouselRef: Component[FlatListProps[_], js.Object, _] = null,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    scrollPosition: Value = null,
    sliderHeight: Int | Double = null,
    sliderWidth: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): AdditionalParallaxProps = {
    val __obj = js.Dynamic.literal()
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (sliderHeight != null) __obj.updateDynamic("sliderHeight")(sliderHeight.asInstanceOf[js.Any])
    if (sliderWidth != null) __obj.updateDynamic("sliderWidth")(sliderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalParallaxProps]
  }
}

