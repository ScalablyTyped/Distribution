package typings.reactDashOnsenui

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckedDisabled extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_CheckedDisabled {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputId: String = null,
    modifier: String = null,
    name: String = null,
    onChange: /* e */ Event => Unit = null,
    value: String = null
  ): Anon_CheckedDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CheckedDisabled]
  }
}

