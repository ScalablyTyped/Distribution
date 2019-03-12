package typings
package reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  /**
    * Currently focused dot
    */
  var activeDotIndex: scala.Double
  /**
    * Opacity of the dot when tapped. The prop has no effect if tappableDots hasn't been set to true
    */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Reference to the Carousel component to which pagination is linked.
    * Needed only when setting tappableDots to true
    */
  var carouselRef: js.UndefOr[
    reactLib.reactMod.Component[reactDashNativeLib.reactDashNativeMod.FlatListProps[_], js.Object, _]
  ] = js.undefined
  /**
    * Style for dots' container that will be merged with the default one
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Background color of the active dot.
    * Use this if you want to animate the change between active and inactive colors,
    * and always in conjunction with inactiveDotColor
    */
  var dotColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style of each dot's container.
    * Use this if you need to specify styles that wouldn't have any effect when defined with dotStyle (such as flex)
    */
  var dotContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Optional custom active dot element that will replace the default one.
    * The element will receive a prop active set to true as well as a prop index
    */
  var dotElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Dots' style that will be merged with the default one
    */
  var dotStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Number of dots to display
    */
  var dotsLength: scala.Double
  /**
    * Background color of the inactive dots.
    * Use this if you want to animate the change between active and inactive colors, and always in conjunction with dotColor
    */
  var inactiveDotColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional custom inactive dot element that will replace the default one.
    * The element will receive a prop active set to false as well as a prop index
    */
  var inactiveDotElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Value of the opacity effect applied to inactive dots
    */
  var inactiveDotOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Value of the 'scale' transform applied to inactive dots
    */
  var inactiveDotScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Dots' style that will be applied to inactive elements
    */
  var inactiveDotStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Function that gives you complete control over pagination's rendering.
    * It will receive three parameters : (activeIndex, total, context).
    * This can be especially useful in order to replace dots with numbers
    */
  var renderDots: js.UndefOr[
    js.Function3[
      /* activeIndex */ scala.Double, 
      /* total */ scala.Double, 
      /* context */ js.Any, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
    * Make default dots tappable, e.g. your carousel will slide to the corresponding item.
    * Note that carouselRef must be specified for this to work
    */
  var tappableDots: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to layout dots vertically or horizontally
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    activeDotIndex: scala.Double,
    dotsLength: scala.Double,
    activeOpacity: scala.Int | scala.Double = null,
    carouselRef: reactLib.reactMod.Component[reactDashNativeLib.reactDashNativeMod.FlatListProps[_], js.Object, _] = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    dotColor: java.lang.String = null,
    dotContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    dotElement: reactLib.reactMod.ReactNs.ReactNode = null,
    dotStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    inactiveDotColor: java.lang.String = null,
    inactiveDotElement: reactLib.reactMod.ReactNs.ReactNode = null,
    inactiveDotOpacity: scala.Int | scala.Double = null,
    inactiveDotScale: scala.Int | scala.Double = null,
    inactiveDotStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    renderDots: (/* activeIndex */ scala.Double, /* total */ scala.Double, /* context */ js.Any) => reactLib.reactMod.ReactNs.ReactNode = null,
    tappableDots: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex, dotsLength = dotsLength)
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor)
    if (dotContainerStyle != null) __obj.updateDynamic("dotContainerStyle")(dotContainerStyle.asInstanceOf[js.Any])
    if (dotElement != null) __obj.updateDynamic("dotElement")(dotElement.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (inactiveDotColor != null) __obj.updateDynamic("inactiveDotColor")(inactiveDotColor)
    if (inactiveDotElement != null) __obj.updateDynamic("inactiveDotElement")(inactiveDotElement.asInstanceOf[js.Any])
    if (inactiveDotOpacity != null) __obj.updateDynamic("inactiveDotOpacity")(inactiveDotOpacity.asInstanceOf[js.Any])
    if (inactiveDotScale != null) __obj.updateDynamic("inactiveDotScale")(inactiveDotScale.asInstanceOf[js.Any])
    if (inactiveDotStyle != null) __obj.updateDynamic("inactiveDotStyle")(inactiveDotStyle.asInstanceOf[js.Any])
    if (renderDots != null) __obj.updateDynamic("renderDots")(js.Any.fromFunction3(renderDots))
    if (!js.isUndefined(tappableDots)) __obj.updateDynamic("tappableDots")(tappableDots)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PaginationProps]
  }
}

