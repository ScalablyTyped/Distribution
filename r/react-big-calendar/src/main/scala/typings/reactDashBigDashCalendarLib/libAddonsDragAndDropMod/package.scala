package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAddonsDragAndDropMod {
  type DragAndDropCalendar[TEvent /* <: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.Event */, TResource /* <: js.Object */] = reactLib.reactMod.Component[
    (reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.CalendarProps[TEvent, TResource]) with withDragAndDropProps[TEvent], 
    js.Object, 
    js.Any
  ]
}
