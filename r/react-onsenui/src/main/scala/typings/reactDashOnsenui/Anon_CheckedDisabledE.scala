package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.SwitchChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedDisabledE extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.undefined
}

object Anon_CheckedDisabledE {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputId: String = null,
    modifier: String = null,
    name: String = null,
    onChange: /* e */ SwitchChangeEvent => Unit = null
  ): Anon_CheckedDisabledE = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Anon_CheckedDisabledE]
  }
}

