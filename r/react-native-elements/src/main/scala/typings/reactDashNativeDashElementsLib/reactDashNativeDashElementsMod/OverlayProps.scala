package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends reactDashNativeLib.reactDashNativeMod.ModalBaseProps
     with reactDashNativeLib.reactDashNativeMod.ModalPropsIOS
     with reactDashNativeLib.reactDashNativeMod.ModalPropsAndroid {
  /**
    * Border radius for the overlay
    *
    * @default 3
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Content of the overlay
    */
  var children: reactLib.reactMod.ReactElement
  /**
    * Style for the overlay container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * If to take up full screen width and height
    *
    * @default false
    */
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height of the overlay
    *
    * @default 'Screen height - 180'
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * If true, the overlay is visible
    */
  var isVisible: scala.Boolean
  /**
    * Callback when user touches the backdrop
    */
  var onBackdropPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Background color for the overlay background
    *
    * @default rgba(0, 0, 0, .5)
    */
  var overlayBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style of the actual overlay
    */
  var overlayStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Width of the overlay
    *
    * @default 'Screen width -80'
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Background color of the actual overlay
    *
    * @default white
    */
  var windowBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement,
    isVisible: scala.Boolean,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.slide | reactDashNativeLib.reactDashNativeLibStrings.fade = null,
    borderRadius: scala.Int | scala.Double = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    fullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    onBackdropPress: () => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    onOrientationChange: /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[_] => scala.Unit = null,
    onRequestClose: () => scala.Unit = null,
    onShow: /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[_] => scala.Unit = null,
    overlayBackgroundColor: java.lang.String = null,
    overlayStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    presentationStyle: reactDashNativeLib.reactDashNativeLibStrings.fullScreen | reactDashNativeLib.reactDashNativeLibStrings.pageSheet | reactDashNativeLib.reactDashNativeLibStrings.formSheet | reactDashNativeLib.reactDashNativeLibStrings.overFullScreen = null,
    supportedOrientations: js.Array[
      reactDashNativeLib.reactDashNativeLibStrings.portrait | reactDashNativeLib.reactDashNativeLibStrings.`portrait-upside-down` | reactDashNativeLib.reactDashNativeLibStrings.landscape | reactDashNativeLib.reactDashNativeLibStrings.`landscape-left` | reactDashNativeLib.reactDashNativeLibStrings.`landscape-right`
    ] = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null,
    windowBackgroundColor: java.lang.String = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(children = children, isVisible = isVisible)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction0(onRequestClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowBackgroundColor != null) __obj.updateDynamic("windowBackgroundColor")(windowBackgroundColor)
    __obj.asInstanceOf[OverlayProps]
  }
}

