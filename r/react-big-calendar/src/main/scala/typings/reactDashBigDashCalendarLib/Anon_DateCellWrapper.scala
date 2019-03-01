package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateCellWrapper extends js.Object {
  var dateCellWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var dayWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var eventWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object]
}

object Anon_DateCellWrapper {
  @scala.inline
  def apply(
    dateCellWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object],
    dayWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object],
    eventWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  ): Anon_DateCellWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dateCellWrapper")(dateCellWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("dayWrapper")(dayWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("eventWrapper")(eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateCellWrapper]
  }
}

