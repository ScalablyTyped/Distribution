package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedDisabledE extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ reactDashOnsenuiLib.reactDashOnsenuiMod.SwitchChangeEvent, scala.Unit]
  ] = js.undefined
}

object Anon_CheckedDisabledE {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputId: java.lang.String = null,
    modifier: java.lang.String = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* e */ reactDashOnsenuiLib.reactDashOnsenuiMod.SwitchChangeEvent, scala.Unit] = null
  ): Anon_CheckedDisabledE = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[Anon_CheckedDisabledE]
  }
}

