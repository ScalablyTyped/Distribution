package typings.reactNativeSnapCarousel.mod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  /**
    * Currently focused dot
    */
  var activeDotIndex: Double
  /**
    * Opacity of the dot when tapped. The prop has no effect if tappableDots hasn't been set to true
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Length of dot animation (milliseconds)
    */
  var animatedDuration: js.UndefOr[Double] = js.undefined
  /**
    * Controls "bounciness"/overshoot on dot animation
    */
  var animatedFriction: js.UndefOr[Double] = js.undefined
  /**
    * Controls speed dot animation
    */
  var animatedTension: js.UndefOr[Double] = js.undefined
  /**
    * Reference to the Carousel component to which pagination is linked.
    * Needed only when setting tappableDots to true
    */
  var carouselRef: js.UndefOr[Component[FlatListProps[_], js.Object, _]] = js.undefined
  /**
    * Style for dots' container that will be merged with the default one
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called on dot
    */
  var delayPressInDot: js.UndefOr[Double] = js.undefined
  /**
    * Background color of the active dot.
    * Use this if you want to animate the change between active and inactive colors,
    * and always in conjunction with inactiveDotColor
    */
  var dotColor: js.UndefOr[String] = js.undefined
  /**
    * Style of each dot's container.
    * Use this if you need to specify styles that wouldn't have any effect when defined with dotStyle (such as flex)
    */
  var dotContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Optional custom active dot element that will replace the default one.
    * The element will receive a prop active set to true as well as a prop index
    */
  var dotElement: js.UndefOr[ReactNode] = js.undefined
  /**
    * Dots' style that will be merged with the default one
    */
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Number of dots to display
    */
  var dotsLength: Double
  /**
    * Background color of the inactive dots.
    * Use this if you want to animate the change between active and inactive colors, and always in conjunction with dotColor
    */
  var inactiveDotColor: js.UndefOr[String] = js.undefined
  /**
    * Optional custom inactive dot element that will replace the default one.
    * The element will receive a prop active set to false as well as a prop index
    */
  var inactiveDotElement: js.UndefOr[ReactNode] = js.undefined
  /**
    * Value of the opacity effect applied to inactive dots
    */
  var inactiveDotOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Value of the 'scale' transform applied to inactive dots
    */
  var inactiveDotScale: js.UndefOr[Double] = js.undefined
  /**
    * Dots' style that will be applied to inactive elements
    */
  var inactiveDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Function that gives you complete control over pagination's rendering.
    * It will receive three parameters : (activeIndex, total, context).
    * This can be especially useful in order to replace dots with numbers
    */
  var renderDots: js.UndefOr[
    js.Function3[/* activeIndex */ Double, /* total */ Double, /* context */ js.Any, ReactNode]
  ] = js.undefined
  /**
    * Make default dots tappable, e.g. your carousel will slide to the corresponding item.
    * Note that carouselRef must be specified for this to work
    */
  var tappableDots: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to layout dots vertically or horizontally
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    activeDotIndex: Double,
    dotsLength: Double,
    activeOpacity: js.UndefOr[Double] = js.undefined,
    animatedDuration: js.UndefOr[Double] = js.undefined,
    animatedFriction: js.UndefOr[Double] = js.undefined,
    animatedTension: js.UndefOr[Double] = js.undefined,
    carouselRef: Component[FlatListProps[_], js.Object, _] = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    delayPressInDot: js.UndefOr[Double] = js.undefined,
    dotColor: String = null,
    dotContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dotElement: ReactNode = null,
    dotStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    inactiveDotColor: String = null,
    inactiveDotElement: ReactNode = null,
    inactiveDotOpacity: js.UndefOr[Double] = js.undefined,
    inactiveDotScale: js.UndefOr[Double] = js.undefined,
    inactiveDotStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    renderDots: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => ReactNode = null,
    tappableDots: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animatedDuration)) __obj.updateDynamic("animatedDuration")(animatedDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animatedFriction)) __obj.updateDynamic("animatedFriction")(animatedFriction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animatedTension)) __obj.updateDynamic("animatedTension")(animatedTension.get.asInstanceOf[js.Any])
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressInDot)) __obj.updateDynamic("delayPressInDot")(delayPressInDot.get.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (!js.isUndefined(dotContainerStyle)) __obj.updateDynamic("dotContainerStyle")(dotContainerStyle.asInstanceOf[js.Any])
    if (dotElement != null) __obj.updateDynamic("dotElement")(dotElement.asInstanceOf[js.Any])
    if (!js.isUndefined(dotStyle)) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (inactiveDotColor != null) __obj.updateDynamic("inactiveDotColor")(inactiveDotColor.asInstanceOf[js.Any])
    if (inactiveDotElement != null) __obj.updateDynamic("inactiveDotElement")(inactiveDotElement.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveDotOpacity)) __obj.updateDynamic("inactiveDotOpacity")(inactiveDotOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveDotScale)) __obj.updateDynamic("inactiveDotScale")(inactiveDotScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveDotStyle)) __obj.updateDynamic("inactiveDotStyle")(inactiveDotStyle.asInstanceOf[js.Any])
    if (renderDots != null) __obj.updateDynamic("renderDots")(js.Any.fromFunction3(renderDots))
    if (!js.isUndefined(tappableDots)) __obj.updateDynamic("tappableDots")(tappableDots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

