package typings.reactDashDayDashPicker.typesCommonMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeModifier extends _Modifier {
  var from: Date
  var to: Date
}

object RangeModifier {
  @scala.inline
  def apply(from: Date, to: Date): RangeModifier = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[RangeModifier]
  }
}

