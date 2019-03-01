package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedDefaultChecked extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ reactLib.Event, scala.Unit]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CheckedDefaultChecked {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputId: java.lang.String = null,
    modifier: java.lang.String = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* e */ reactLib.Event, scala.Unit] = null,
    value: java.lang.String = null
  ): Anon_CheckedDefaultChecked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CheckedDefaultChecked]
  }
}

