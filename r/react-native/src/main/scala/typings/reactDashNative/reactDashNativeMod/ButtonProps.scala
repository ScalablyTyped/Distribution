package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to locate this button in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  var title: String
  def onPress(ev: NativeSyntheticEvent[NativeTouchEvent]): Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    onPress: NativeSyntheticEvent[NativeTouchEvent] => Unit,
    title: String,
    accessibilityLabel: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    testID: String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), title = title)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    __obj.asInstanceOf[ButtonProps]
  }
}

