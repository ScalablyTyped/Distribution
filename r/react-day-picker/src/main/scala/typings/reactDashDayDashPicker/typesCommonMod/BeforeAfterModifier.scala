package typings.reactDashDayDashPicker.typesCommonMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterModifier extends _Modifier {
  var after: Date
  var before: Date
}

object BeforeAfterModifier {
  @scala.inline
  def apply(after: Date, before: Date): BeforeAfterModifier = {
    val __obj = js.Dynamic.literal(after = after, before = before)
  
    __obj.asInstanceOf[BeforeAfterModifier]
  }
}

