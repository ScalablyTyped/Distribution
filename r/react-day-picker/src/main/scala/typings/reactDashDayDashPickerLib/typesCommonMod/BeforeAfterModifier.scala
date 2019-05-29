package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterModifier extends _Modifier {
  var after: stdLib.Date
  var before: stdLib.Date
}

object BeforeAfterModifier {
  @scala.inline
  def apply(after: stdLib.Date, before: stdLib.Date): BeforeAfterModifier = {
    val __obj = js.Dynamic.literal(after = after, before = before)
  
    __obj.asInstanceOf[BeforeAfterModifier]
  }
}

