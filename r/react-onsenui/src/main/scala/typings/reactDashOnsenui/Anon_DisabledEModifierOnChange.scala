package typings.reactDashOnsenui

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledEModifierOnChange extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_DisabledEModifierOnChange {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    onChange: /* e */ Event => Unit = null,
    value: Int | Double = null
  ): Anon_DisabledEModifierOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisabledEModifierOnChange]
  }
}

