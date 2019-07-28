package typings.reactDashBigDashCalendar

import typings.react.reactMod.Component
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.CalendarProps
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAddonsDragAndDropMod {
  type DragAndDropCalendar[TEvent /* <: Event */, TResource /* <: js.Object */] = Component[
    (CalendarProps[TEvent, TResource]) with withDragAndDropProps[TEvent], 
    js.Object, 
    js.Any
  ]
}
