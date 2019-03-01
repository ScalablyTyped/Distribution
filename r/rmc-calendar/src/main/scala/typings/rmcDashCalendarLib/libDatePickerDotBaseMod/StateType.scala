package typings
package rmcDashCalendarLib.libDatePickerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var months: js.Array[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData]
}

object StateType {
  @scala.inline
  def apply(months: js.Array[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData]): StateType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("months")(months)
    __obj.asInstanceOf[StateType]
  }
}

