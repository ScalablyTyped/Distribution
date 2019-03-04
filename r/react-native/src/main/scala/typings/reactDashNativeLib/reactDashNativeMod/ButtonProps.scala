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

object ButtonProps {
  @scala.inline
  def apply(
    onPress: js.Function1[NativeSyntheticEvent[NativeTouchEvent], scala.Unit],
    title: java.lang.String,
    accessibilityLabel: java.lang.String = null,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    testID: java.lang.String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(onPress = onPress, title = title)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    __obj.asInstanceOf[ButtonProps]
  }
}

