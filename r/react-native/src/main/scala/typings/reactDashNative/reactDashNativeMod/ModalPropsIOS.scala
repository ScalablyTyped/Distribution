package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.`landscape-left`
import typings.reactDashNative.reactDashNativeStrings.`landscape-right`
import typings.reactDashNative.reactDashNativeStrings.`portrait-upside-down`
import typings.reactDashNative.reactDashNativeStrings.formSheet
import typings.reactDashNative.reactDashNativeStrings.fullScreen
import typings.reactDashNative.reactDashNativeStrings.landscape
import typings.reactDashNative.reactDashNativeStrings.overFullScreen
import typings.reactDashNative.reactDashNativeStrings.pageSheet
import typings.reactDashNative.reactDashNativeStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPropsIOS extends js.Object {
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
}

object ModalPropsIOS {
  @scala.inline
  def apply(
    onDismiss: () => Unit = null,
    onOrientationChange: /* event */ NativeSyntheticEvent[_] => Unit = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null
  ): ModalPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations)
    __obj.asInstanceOf[ModalPropsIOS]
  }
}

