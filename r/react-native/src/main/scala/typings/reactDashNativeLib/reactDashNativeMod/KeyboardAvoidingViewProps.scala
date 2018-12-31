package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardAvoidingViewProps extends ViewProps {
  var behavior: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.height | reactDashNativeLib.reactDashNativeLibStrings.position | reactDashNativeLib.reactDashNativeLibStrings.padding
  ] = js.undefined
  /**
    * The style of the content container(View) when behavior is 'position'.
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Enables or disables the KeyboardAvoidingView.
    *
    * Default is true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is the distance between the top of the user screen and the react native view,
    * may be non-zero in some use cases.
    */
  var keyboardVerticalOffset: js.UndefOr[scala.Double] = js.undefined
}

