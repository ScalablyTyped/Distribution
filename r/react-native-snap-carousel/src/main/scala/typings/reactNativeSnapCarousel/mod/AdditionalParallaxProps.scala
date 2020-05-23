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
    itemHeight: js.UndefOr[Double] = js.undefined,
    itemWidth: js.UndefOr[Double] = js.undefined,
    scrollPosition: Value = null,
    sliderHeight: js.UndefOr[Double] = js.undefined,
    sliderWidth: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): AdditionalParallaxProps = {
    val __obj = js.Dynamic.literal()
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemHeight)) __obj.updateDynamic("itemHeight")(itemHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(sliderHeight)) __obj.updateDynamic("sliderHeight")(sliderHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliderWidth)) __obj.updateDynamic("sliderWidth")(sliderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalParallaxProps]
  }
}

