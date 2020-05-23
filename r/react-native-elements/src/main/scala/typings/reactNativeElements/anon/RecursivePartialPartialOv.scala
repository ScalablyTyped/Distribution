package typings.reactNativeElements.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.`landscape-left`
import typings.reactNativeElements.reactNativeElementsStrings.`landscape-right`
import typings.reactNativeElements.reactNativeElementsStrings.`portrait-upside-down`
import typings.reactNativeElements.reactNativeElementsStrings.fade
import typings.reactNativeElements.reactNativeElementsStrings.formSheet
import typings.reactNativeElements.reactNativeElementsStrings.fullScreen
import typings.reactNativeElements.reactNativeElementsStrings.landscape
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.overFullScreen
import typings.reactNativeElements.reactNativeElementsStrings.pageSheet
import typings.reactNativeElements.reactNativeElementsStrings.portrait
import typings.reactNativeElements.reactNativeElementsStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.OverlayProps>> */
trait RecursivePartialPartialOv extends js.Object {
  var animated: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[none | slide | fade]]] = js.undefined
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var children: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var fullScreen: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var hardwareAccelerated: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double | String]]] = js.undefined
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var onBackdropPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onDismiss: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onOrientationChange: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]]
  ] = js.undefined
  var onRequestClose: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onShow: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]]
  ] = js.undefined
  var overlayBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var overlayStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var presentationStyle: js.UndefOr[
    RecursivePartial[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen]]
  ] = js.undefined
  var supportedOrientations: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
      ]
    ]
  ] = js.undefined
  var transparent: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var visible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double | String]]] = js.undefined
  var windowBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
}

object RecursivePartialPartialOv {
  @scala.inline
  def apply(
    animated: RecursivePartial[js.UndefOr[Boolean]] = null,
    animationType: RecursivePartial[js.UndefOr[none | slide | fade]] = null,
    borderRadius: RecursivePartial[js.UndefOr[Double]] = null,
    children: RecursivePartial[js.UndefOr[ReactElement]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    fullScreen: RecursivePartial[js.UndefOr[Boolean]] = null,
    hardwareAccelerated: RecursivePartial[js.UndefOr[Boolean]] = null,
    height: RecursivePartial[js.UndefOr[Double | String]] = null,
    isVisible: RecursivePartial[js.UndefOr[Boolean]] = null,
    onBackdropPress: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onDismiss: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onOrientationChange: RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]] = null,
    onRequestClose: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onShow: RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]] = null,
    overlayBackgroundColor: RecursivePartial[js.UndefOr[String]] = null,
    overlayStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    presentationStyle: RecursivePartial[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen]] = null,
    supportedOrientations: RecursivePartial[
      js.UndefOr[
        js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
      ]
    ] = null,
    transparent: RecursivePartial[js.UndefOr[Boolean]] = null,
    visible: RecursivePartial[js.UndefOr[Boolean]] = null,
    width: RecursivePartial[js.UndefOr[Double | String]] = null,
    windowBackgroundColor: RecursivePartial[js.UndefOr[String]] = null
  ): RecursivePartialPartialOv = {
    val __obj = js.Dynamic.literal()
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (fullScreen != null) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (hardwareAccelerated != null) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (isVisible != null) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(onBackdropPress.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(onOrientationChange.asInstanceOf[js.Any])
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(onRequestClose.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (transparent != null) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowBackgroundColor != null) __obj.updateDynamic("windowBackgroundColor")(windowBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialOv]
  }
}

