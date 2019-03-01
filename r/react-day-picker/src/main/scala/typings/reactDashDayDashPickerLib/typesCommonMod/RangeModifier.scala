package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeModifier extends js.Object {
  var from: stdLib.Date
  var to: stdLib.Date
}

object RangeModifier {
  @scala.inline
  def apply(from: stdLib.Date, to: stdLib.Date): RangeModifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RangeModifier]
  }
}

