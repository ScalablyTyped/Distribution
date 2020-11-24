package typings.reactNativeSnapCarousel.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationProps extends js.Object {
  
  /**
    * Currently focused dot
    */
  var activeDotIndex: Double = js.native
  
  /**
    * Opacity of the dot when tapped. The prop has no effect if tappableDots hasn't been set to true
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Length of dot animation (milliseconds)
    */
  var animatedDuration: js.UndefOr[Double] = js.native
  
  /**
    * Controls "bounciness"/overshoot on dot animation
    */
  var animatedFriction: js.UndefOr[Double] = js.native
  
  /**
    * Controls speed dot animation
    */
  var animatedTension: js.UndefOr[Double] = js.native
  
  /**
    * Reference to the Carousel component to which pagination is linked.
    * Needed only when setting tappableDots to true
    */
  var carouselRef: js.UndefOr[Component[FlatListProps[_], js.Object, _]] = js.native
  
  /**
    * Style for dots' container that will be merged with the default one
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called on dot
    */
  var delayPressInDot: js.UndefOr[Double] = js.native
  
  /**
    * Background color of the active dot.
    * Use this if you want to animate the change between active and inactive colors,
    * and always in conjunction with inactiveDotColor
    */
  var dotColor: js.UndefOr[String] = js.native
  
  /**
    * Style of each dot's container.
    * Use this if you need to specify styles that wouldn't have any effect when defined with dotStyle (such as flex)
    */
  var dotContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Optional custom active dot element that will replace the default one.
    * The element will receive a prop active set to true as well as a prop index
    */
  var dotElement: js.UndefOr[ReactNode] = js.native
  
  /**
    * Dots' style that will be merged with the default one
    */
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Number of dots to display
    */
  var dotsLength: Double = js.native
  
  /**
    * Background color of the inactive dots.
    * Use this if you want to animate the change between active and inactive colors, and always in conjunction with dotColor
    */
  var inactiveDotColor: js.UndefOr[String] = js.native
  
  /**
    * Optional custom inactive dot element that will replace the default one.
    * The element will receive a prop active set to false as well as a prop index
    */
  var inactiveDotElement: js.UndefOr[ReactNode] = js.native
  
  /**
    * Value of the opacity effect applied to inactive dots
    */
  var inactiveDotOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Value of the 'scale' transform applied to inactive dots
    */
  var inactiveDotScale: js.UndefOr[Double] = js.native
  
  /**
    * Dots' style that will be applied to inactive elements
    */
  var inactiveDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Function that gives you complete control over pagination's rendering.
    * It will receive three parameters : (activeIndex, total, context).
    * This can be especially useful in order to replace dots with numbers
    */
  var renderDots: js.UndefOr[
    js.Function3[/* activeIndex */ Double, /* total */ Double, /* context */ js.Any, ReactNode]
  ] = js.native
  
  /**
    * Make default dots tappable, e.g. your carousel will slide to the corresponding item.
    * Note that carouselRef must be specified for this to work
    */
  var tappableDots: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to layout dots vertically or horizontally
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object PaginationProps {
  
  @scala.inline
  def apply(activeDotIndex: Double, dotsLength: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    
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
    def setActiveDotIndex(value: Double): Self = this.set("activeDotIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsLength(value: Double): Self = this.set("dotsLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setAnimatedDuration(value: Double): Self = this.set("animatedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatedDuration: Self = this.set("animatedDuration", js.undefined)
    
    @scala.inline
    def setAnimatedFriction(value: Double): Self = this.set("animatedFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatedFriction: Self = this.set("animatedFriction", js.undefined)
    
    @scala.inline
    def setAnimatedTension(value: Double): Self = this.set("animatedTension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatedTension: Self = this.set("animatedTension", js.undefined)
    
    @scala.inline
    def setCarouselRef(value: Component[FlatListProps[_], js.Object, _]): Self = this.set("carouselRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarouselRef: Self = this.set("carouselRef", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setDelayPressInDot(value: Double): Self = this.set("delayPressInDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressInDot: Self = this.set("delayPressInDot", js.undefined)
    
    @scala.inline
    def setDotColor(value: String): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotColor: Self = this.set("dotColor", js.undefined)
    
    @scala.inline
    def setDotContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("dotContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotContainerStyle: Self = this.set("dotContainerStyle", js.undefined)
    
    @scala.inline
    def setDotContainerStyleNull: Self = this.set("dotContainerStyle", null)
    
    @scala.inline
    def setDotElement(value: ReactNode): Self = this.set("dotElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotElement: Self = this.set("dotElement", js.undefined)
    
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setDotStyleNull: Self = this.set("dotStyle", null)
    
    @scala.inline
    def setInactiveDotColor(value: String): Self = this.set("inactiveDotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveDotColor: Self = this.set("inactiveDotColor", js.undefined)
    
    @scala.inline
    def setInactiveDotElement(value: ReactNode): Self = this.set("inactiveDotElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveDotElement: Self = this.set("inactiveDotElement", js.undefined)
    
    @scala.inline
    def setInactiveDotOpacity(value: Double): Self = this.set("inactiveDotOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveDotOpacity: Self = this.set("inactiveDotOpacity", js.undefined)
    
    @scala.inline
    def setInactiveDotScale(value: Double): Self = this.set("inactiveDotScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveDotScale: Self = this.set("inactiveDotScale", js.undefined)
    
    @scala.inline
    def setInactiveDotStyle(value: StyleProp[ViewStyle]): Self = this.set("inactiveDotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveDotStyle: Self = this.set("inactiveDotStyle", js.undefined)
    
    @scala.inline
    def setInactiveDotStyleNull: Self = this.set("inactiveDotStyle", null)
    
    @scala.inline
    def setRenderDots(value: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => ReactNode): Self = this.set("renderDots", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderDots: Self = this.set("renderDots", js.undefined)
    
    @scala.inline
    def setTappableDots(value: Boolean): Self = this.set("tappableDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTappableDots: Self = this.set("tappableDots", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
