package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterModifier extends js.Object {
  var after: stdLib.Date
  var before: stdLib.Date
}

object BeforeAfterModifier {
  @scala.inline
  def apply(after: stdLib.Date, before: stdLib.Date): BeforeAfterModifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[BeforeAfterModifier]
  }
}

