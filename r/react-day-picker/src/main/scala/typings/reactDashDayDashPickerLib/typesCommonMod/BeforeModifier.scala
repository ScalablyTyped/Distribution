package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeModifier extends _Modifier {
  var before: stdLib.Date
}

object BeforeModifier {
  @scala.inline
  def apply(before: stdLib.Date): BeforeModifier = {
    val __obj = js.Dynamic.literal(before = before)
  
    __obj.asInstanceOf[BeforeModifier]
  }
}

