package typings.reactBigCalendar.dragAndDropMod

import typings.react.mod.DragEvent
import typings.reactBigCalendar.anon.AllDay
import typings.reactBigCalendar.anon.AllDayEnd
import typings.reactBigCalendar.anon.Direction
import typings.reactBigCalendar.mod.CalendarProps
import typings.reactBigCalendar.mod.DateLocalizer
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactBigCalendar.dragAndDropMod.withDragAndDropProps because var conflicts: components, elementProps, selectable, step. Inlined onEventDrop, onEventResize, onDragStart, onDragOver, onDropFromOutside, dragFromOutsideItem, draggableAccessor, resizableAccessor, resizable */ @js.native
trait DragAndDropCalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends CalendarProps[TEvent, TResource] {
  
  var dragFromOutsideItem: js.UndefOr[js.Function0[(/* keyof TEvent */ String) | (js.Function1[TEvent, Date])]] = js.native
  
  var draggableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])] = js.native
  
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* args */ Direction[TEvent], Unit]] = js.native
  
  var onDropFromOutside: js.UndefOr[js.Function1[/* args */ AllDayEnd, Unit]] = js.native
  
  var onEventDrop: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.native
  
  var onEventResize: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var resizableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])] = js.native
}
object DragAndDropCalendarProps {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](localizer: DateLocalizer): DragAndDropCalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAndDropCalendarProps[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class DragAndDropCalendarPropsOps[Self <: DragAndDropCalendarProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (DragAndDropCalendarProps[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[TEvent, Date])): Self = this.set("dragFromOutsideItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDragFromOutsideItem: Self = this.set("dragFromOutsideItem", js.undefined)
    
    @scala.inline
    def setDraggableAccessorFunction1(value: TEvent => Boolean): Self = this.set("draggableAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): Self = this.set("draggableAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableAccessor: Self = this.set("draggableAccessor", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* args */ Direction[TEvent] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDropFromOutside(value: /* args */ AllDayEnd => Unit): Self = this.set("onDropFromOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropFromOutside: Self = this.set("onDropFromOutside", js.undefined)
    
    @scala.inline
    def setOnEventDrop(value: /* args */ AllDay[TEvent] => Unit): Self = this.set("onEventDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEventDrop: Self = this.set("onEventDrop", js.undefined)
    
    @scala.inline
    def setOnEventResize(value: /* args */ AllDay[TEvent] => Unit): Self = this.set("onEventResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEventResize: Self = this.set("onEventResize", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setResizableAccessorFunction1(value: TEvent => Boolean): Self = this.set("resizableAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): Self = this.set("resizableAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizableAccessor: Self = this.set("resizableAccessor", js.undefined)
  }
}
