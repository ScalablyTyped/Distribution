package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateCellWrapper[TEvent /* <: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.Event */] extends js.Object {
  var dateCellWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var dayWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var eventWrapper: reactLib.reactMod.ReactNs.ComponentType[TEvent]
}

object Anon_DateCellWrapper {
  @scala.inline
  def apply[TEvent /* <: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.Event */](
    dateCellWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object],
    dayWrapper: reactLib.reactMod.ReactNs.ComponentType[js.Object],
    eventWrapper: reactLib.reactMod.ReactNs.ComponentType[TEvent]
  ): Anon_DateCellWrapper[TEvent] = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], dayWrapper = dayWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateCellWrapper[TEvent]]
  }
}

