package typings.reactIntl

import typings.formatjsIntlRelativetimeformat.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl.Props, 'unit' | 'value'> */
trait PickPropsunitvalue extends js.Object {
  var unit: js.UndefOr[Unit] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PickPropsunitvalue {
  @scala.inline
  def apply(unit: Unit = null, value: Int | Double = null): PickPropsunitvalue = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsunitvalue]
  }
}

