package typings.reactDashBigDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAddonsDragAndDropMod {
  import typings.react.reactMod.Component
  import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.CalendarProps

  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = Component[
    (CalendarProps[TEvent, TResource]) with withDragAndDropProps[TEvent], 
    js.Object, 
    js.Any
  ]
}
