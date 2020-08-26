package typings.reactSwipeableViews.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableViewsProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var animateHeight: js.UndefOr[Boolean] = js.native
  var animateTransitions: js.UndefOr[Boolean] = js.native
  var axis: js.UndefOr[AxisType] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /*
    * This is the config used to disable lazy loading, if true it will render all the views in first rendering.
    */
  var disableLazyLoading: js.UndefOr[Boolean] = js.native
  var enableMouseEvents: js.UndefOr[Boolean] = js.native
  var hysteresis: js.UndefOr[Double] = js.native
  var ignoreNativeScroll: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.native
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.native
  @JSName("onTransitionEnd")
  var onTransitionEnd_SwipeableViewsProps: js.UndefOr[OnTransitionEndCallback] = js.native
  var resistance: js.UndefOr[Boolean] = js.native
  var slideClassName: js.UndefOr[String] = js.native
  var slideStyle: js.UndefOr[CSSProperties] = js.native
  var springConfig: js.UndefOr[SpringConfig] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object SwipeableViewsProps {
  @scala.inline
  def apply(): SwipeableViewsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableViewsProps]
  }
  @scala.inline
  implicit class SwipeableViewsPropsOps[Self <: SwipeableViewsProps] (val x: Self) extends AnyVal {
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
    def setAnimateHeight(value: Boolean): Self = this.set("animateHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateHeight: Self = this.set("animateHeight", js.undefined)
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = this.set("animateTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateTransitions: Self = this.set("animateTransitions", js.undefined)
    @scala.inline
    def setAxis(value: AxisType): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setDisableLazyLoading(value: Boolean): Self = this.set("disableLazyLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLazyLoading: Self = this.set("disableLazyLoading", js.undefined)
    @scala.inline
    def setEnableMouseEvents(value: Boolean): Self = this.set("enableMouseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMouseEvents: Self = this.set("enableMouseEvents", js.undefined)
    @scala.inline
    def setHysteresis(value: Double): Self = this.set("hysteresis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHysteresis: Self = this.set("hysteresis", js.undefined)
    @scala.inline
    def setIgnoreNativeScroll(value: Boolean): Self = this.set("ignoreNativeScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreNativeScroll: Self = this.set("ignoreNativeScroll", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = this.set("onChangeIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChangeIndex: Self = this.set("onChangeIndex", js.undefined)
    @scala.inline
    def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = this.set("onSwitching", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSwitching: Self = this.set("onSwitching", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: () => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setResistance(value: Boolean): Self = this.set("resistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResistance: Self = this.set("resistance", js.undefined)
    @scala.inline
    def setSlideClassName(value: String): Self = this.set("slideClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideClassName: Self = this.set("slideClassName", js.undefined)
    @scala.inline
    def setSlideStyle(value: CSSProperties): Self = this.set("slideStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideStyle: Self = this.set("slideStyle", js.undefined)
    @scala.inline
    def setSpringConfig(value: SpringConfig): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringConfig: Self = this.set("springConfig", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

