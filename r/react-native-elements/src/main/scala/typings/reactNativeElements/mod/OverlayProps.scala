package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ModalBaseProps
import typings.reactNative.mod.ModalPropsAndroid
import typings.reactNative.mod.ModalPropsIOS
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`landscape-left`
import typings.reactNative.reactNativeStrings.`landscape-right`
import typings.reactNative.reactNativeStrings.`portrait-upside-down`
import typings.reactNative.reactNativeStrings.fade
import typings.reactNative.reactNativeStrings.formSheet
import typings.reactNative.reactNativeStrings.fullScreen
import typings.reactNative.reactNativeStrings.landscape
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.overFullScreen
import typings.reactNative.reactNativeStrings.pageSheet
import typings.reactNative.reactNativeStrings.portrait
import typings.reactNative.reactNativeStrings.slide
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
    borderRadius: js.UndefOr[Double] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    onBackdropPress: () => Unit = null,
    onDismiss: () => Unit = null,
    onOrientationChange: /* event */ NativeSyntheticEvent[_] => Unit = null,
    onRequestClose: () => Unit = null,
    onShow: /* event */ NativeSyntheticEvent[_] => Unit = null,
    overlayBackgroundColor: String = null,
    overlayStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    windowBackgroundColor: String = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction0(onRequestClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayStyle)) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowBackgroundColor != null) __obj.updateDynamic("windowBackgroundColor")(windowBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

