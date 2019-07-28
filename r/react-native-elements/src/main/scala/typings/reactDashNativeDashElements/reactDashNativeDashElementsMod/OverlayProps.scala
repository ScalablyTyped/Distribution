package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.ModalBaseProps
import typings.reactDashNative.reactDashNativeMod.ModalPropsAndroid
import typings.reactDashNative.reactDashNativeMod.ModalPropsIOS
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.`landscape-left`
import typings.reactDashNative.reactDashNativeStrings.`landscape-right`
import typings.reactDashNative.reactDashNativeStrings.`portrait-upside-down`
import typings.reactDashNative.reactDashNativeStrings.fade
import typings.reactDashNative.reactDashNativeStrings.formSheet
import typings.reactDashNative.reactDashNativeStrings.fullScreen
import typings.reactDashNative.reactDashNativeStrings.landscape
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.overFullScreen
import typings.reactDashNative.reactDashNativeStrings.pageSheet
import typings.reactDashNative.reactDashNativeStrings.portrait
import typings.reactDashNative.reactDashNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends ModalBaseProps
     with ModalPropsIOS
     with ModalPropsAndroid {
  /**
    * Border radius for the overlay
    *
    * @default 3
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * Content of the overlay
    */
  var children: ReactElement
  /**
    * Style for the overlay container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * If to take up full screen width and height
    *
    * @default false
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the overlay
    *
    * @default 'Screen height - 180'
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * If true, the overlay is visible
    */
  var isVisible: Boolean
  /**
    * Callback when user touches the backdrop
    */
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Background color for the overlay background
    *
    * @default rgba(0, 0, 0, .5)
    */
  var overlayBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Style of the actual overlay
    */
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Width of the overlay
    *
    * @default 'Screen width -80'
    */
  var width: js.UndefOr[Double | String] = js.undefined
  /**
    * Background color of the actual overlay
    *
    * @default white
    */
  var windowBackgroundColor: js.UndefOr[String] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    children: ReactElement,
    isVisible: Boolean,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: none | slide | fade = null,
    borderRadius: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    onBackdropPress: () => Unit = null,
    onDismiss: () => Unit = null,
    onOrientationChange: /* event */ NativeSyntheticEvent[_] => Unit = null,
    onRequestClose: () => Unit = null,
    onShow: /* event */ NativeSyntheticEvent[_] => Unit = null,
    overlayBackgroundColor: String = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    windowBackgroundColor: String = null
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

