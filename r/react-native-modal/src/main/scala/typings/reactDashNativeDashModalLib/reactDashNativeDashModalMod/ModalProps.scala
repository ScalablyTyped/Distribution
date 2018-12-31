package typings
package reactDashNativeDashModalLib.reactDashNativeDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animationIn: js.UndefOr[AnimationConfig] = js.undefined
  var animationInTiming: js.UndefOr[scala.Double] = js.undefined
  var animationOut: js.UndefOr[AnimationConfig] = js.undefined
  var animationOutTiming: js.UndefOr[scala.Double] = js.undefined
  var avoidKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var backdropColor: js.UndefOr[java.lang.String] = js.undefined
  var backdropOpacity: js.UndefOr[scala.Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[scala.Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[scala.Double] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var deviceHeight: js.UndefOr[scala.Double] = js.undefined
  var deviceWidth: js.UndefOr[scala.Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var isVisible: scala.Boolean
  var onBackButtonPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[
    js.Function1[
      /* orientation */ reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.portrait | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.landscape, 
      scala.Unit
    ]
  ] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipe: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var presentationStyle: js.UndefOr[
    reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.fullScreen | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.pageSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.formSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.overFullScreen
  ] = js.undefined
  var scrollOffset: js.UndefOr[scala.Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[scala.Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[
    reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.up | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.down | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.left | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.right
  ] = js.undefined
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

