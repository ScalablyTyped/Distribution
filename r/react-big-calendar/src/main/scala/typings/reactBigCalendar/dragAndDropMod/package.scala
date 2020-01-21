package typings.reactBigCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dragAndDropMod {
  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = typings.react.mod.Component[
    (typings.reactBigCalendar.mod.CalendarProps[TEvent, TResource]) with typings.reactBigCalendar.dragAndDropMod.withDragAndDropProps[TEvent], 
    js.Object, 
    js.Any
  ]
}
