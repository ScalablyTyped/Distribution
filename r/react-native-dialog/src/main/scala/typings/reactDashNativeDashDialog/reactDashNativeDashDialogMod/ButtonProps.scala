package typings.reactDashNativeDashDialog.reactDashNativeDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    * default:
    *      ios     #007ff9
    *      android #169689
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * default: false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: String
  def onPress(): Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    label: String,
    onPress: () => Unit,
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

