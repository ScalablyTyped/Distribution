package typings
package reactDashBootstrapLib.libToggleButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonProps
  extends reactLib.reactMod.HTMLProps[ToggleButton] {
  @JSName("value")
  var value_ToggleButtonProps: scala.Double | java.lang.String
}

object ToggleButtonProps {
  @scala.inline
  def apply(
    value: scala.Double | java.lang.String,
    HTMLProps: reactLib.reactMod.HTMLProps[ToggleButton] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): ToggleButtonProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ToggleButtonProps]
  }
}

