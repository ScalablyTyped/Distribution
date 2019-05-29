package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterModifier extends _Modifier {
  var after: stdLib.Date
}

object AfterModifier {
  @scala.inline
  def apply(after: stdLib.Date): AfterModifier = {
    val __obj = js.Dynamic.literal(after = after)
  
    __obj.asInstanceOf[AfterModifier]
  }
}

