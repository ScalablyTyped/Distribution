package typings.reactIntl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl.Props, 'unit' | 'value'> */
trait PickPropsunitvalue extends js.Object {
  var unit: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PickPropsunitvalue {
  @scala.inline
  def apply(unit: js.Any = null, value: js.Any = null): PickPropsunitvalue = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsunitvalue]
  }
}

