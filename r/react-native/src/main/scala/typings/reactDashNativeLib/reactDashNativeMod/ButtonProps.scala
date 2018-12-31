package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to locate this button in end-to-end tests.
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  def onPress(ev: NativeSyntheticEvent[NativeTouchEvent]): scala.Unit
}

