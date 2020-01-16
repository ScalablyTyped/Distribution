package typings.reactDashNative.reactDashNativeMod

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

/* Inlined react-native.react-native.ModalProps */
trait ModalProperties extends js.Object {
  /**
    * @deprecated Use animationType instead
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * The `animationType` prop controls how the modal animates.
    *
    * - `slide` slides in from the bottom
    * - `fade` fades into view
    * - `none` appears without an animation
    */
  var animationType: js.UndefOr[none | slide | fade] = js.undefined
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  /**
    * The `onDismiss` prop allows passing a function that will be called once the modal has been dismissed.
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The `onOrientationChange` callback is called when the orientation changes while the modal is being displayed.
    * The orientation provided is only 'portrait' or 'landscape'. This callback is also called on initial render, regardless of the current orientation.
    */
  var onOrientationChange: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]] = js.undefined
  /**
    * The `onRequestClose` prop allows passing a function that will be called once the modal has been dismissed.
    * _On the Android platform, this is a required function._
    */
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]] = js.undefined
  /**
    * The `presentationStyle` determines the style of modal to show
    */
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  /**
    * The `supportedOrientations` prop allows the modal to be rotated to any of the specified orientations.
    * On iOS, the modal is still restricted by what's specified in your app's Info.plist's UISupportedInterfaceOrientations field.
    */
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.undefined
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /**
    * The `visible` prop determines whether your modal is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ModalProperties {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: none | slide | fade = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null,
    onOrientationChange: /* event */ NativeSyntheticEvent[_] => Unit = null,
    onRequestClose: () => Unit = null,
    onShow: /* event */ NativeSyntheticEvent[_] => Unit = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ModalProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction0(onRequestClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProperties]
  }
}

