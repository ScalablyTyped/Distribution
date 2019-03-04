package typings
package reactDashNativeDashDialogLib.reactDashNativeDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default:
    *      ios     #007ff9
    *      android #169689
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default: false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  def onPress(): scala.Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    label: java.lang.String,
    onPress: js.Function0[scala.Unit],
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(label = label, onPress = onPress)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[ButtonProps]
  }
}

