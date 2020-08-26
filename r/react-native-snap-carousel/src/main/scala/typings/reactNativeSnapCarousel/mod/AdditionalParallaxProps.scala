package typings.reactNativeSnapCarousel.mod

import typings.react.mod.Component
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.FlatListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalParallaxProps extends js.Object {
  var carouselRef: js.UndefOr[Component[FlatListProps[_], js.Object, _]] = js.native
  var itemHeight: js.UndefOr[Double] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var scrollPosition: js.UndefOr[Value] = js.native
  var sliderHeight: js.UndefOr[Double] = js.native
  var sliderWidth: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object AdditionalParallaxProps {
  @scala.inline
  def apply(): AdditionalParallaxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalParallaxProps]
  }
  @scala.inline
  implicit class AdditionalParallaxPropsOps[Self <: AdditionalParallaxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCarouselRef(value: Component[FlatListProps[_], js.Object, _]): Self = this.set("carouselRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarouselRef: Self = this.set("carouselRef", js.undefined)
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setScrollPosition(value: Value): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    @scala.inline
    def setSliderHeight(value: Double): Self = this.set("sliderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderHeight: Self = this.set("sliderHeight", js.undefined)
    @scala.inline
    def setSliderWidth(value: Double): Self = this.set("sliderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderWidth: Self = this.set("sliderWidth", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

