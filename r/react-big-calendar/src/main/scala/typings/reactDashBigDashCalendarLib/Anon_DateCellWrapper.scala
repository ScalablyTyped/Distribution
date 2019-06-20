package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateCellWrapper[TEvent /* <: js.Object */] extends js.Object {
  var dateCellWrapper: reactLib.reactMod.ComponentType[js.Object]
  var dayWrapper: reactLib.reactMod.ComponentType[js.Object]
  var eventWrapper: reactLib.reactMod.ComponentType[TEvent]
}

object Anon_DateCellWrapper {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dateCellWrapper: reactLib.reactMod.ComponentType[js.Object],
    dayWrapper: reactLib.reactMod.ComponentType[js.Object],
    eventWrapper: reactLib.reactMod.ComponentType[TEvent]
  ): Anon_DateCellWrapper[TEvent] = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], dayWrapper = dayWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DateCellWrapper[TEvent]]
  }
}

