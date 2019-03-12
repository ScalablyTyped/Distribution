package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledEInputId extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DisabledEInputId {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputId: java.lang.String = null,
    modifier: java.lang.String = null,
    onChange: /* e */ stdLib.Event => scala.Unit = null,
    value: java.lang.String = null
  ): Anon_DisabledEInputId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_DisabledEInputId]
  }
}

