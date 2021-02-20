package typings.reactBigCalendar

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.DragEvent
import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.anon.AllDay
import typings.reactBigCalendar.anon.AllDayEnd
import typings.reactBigCalendar.anon.Direction
import typings.reactBigCalendar.mod.CalendarProps
import typings.reactBigCalendar.mod.Components_
import typings.reactBigCalendar.mod.DateLocalizer
import typings.reactBigCalendar.reactBigCalendarBooleans.`false`
import typings.reactBigCalendar.reactBigCalendarBooleans.`true`
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropMod {
  
  @JSImport("react-big-calendar/lib/addons/dragAndDrop", JSImport.Default)
  @js.native
  def default[TEvent /* <: js.Object */, TResource /* <: js.Object */](calendar: ComponentType[CalendarProps[TEvent, TResource]]): ComponentType[DragAndDropCalendarProps[TEvent, TResource]] = js.native
  
  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = Component[DragAndDropCalendarProps[TEvent, TResource], js.Object, js.Any]
  
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
    implicit class DragAndDropCalendarPropsMutableBuilder[Self <: DragAndDropCalendarProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (DragAndDropCalendarProps[TEvent, TResource])) extends AnyVal {
      
      @scala.inline
      def setDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[TEvent, Date])): Self = StObject.set(x, "dragFromOutsideItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDragFromOutsideItemUndefined: Self = StObject.set(x, "dragFromOutsideItem", js.undefined)
      
      @scala.inline
      def setDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): Self = StObject.set(x, "draggableAccessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableAccessorFunction1(value: TEvent => Boolean): Self = StObject.set(x, "draggableAccessor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDraggableAccessorUndefined: Self = StObject.set(x, "draggableAccessor", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* args */ Direction[TEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDropFromOutside(value: /* args */ AllDayEnd => Unit): Self = StObject.set(x, "onDropFromOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropFromOutsideUndefined: Self = StObject.set(x, "onDropFromOutside", js.undefined)
      
      @scala.inline
      def setOnEventDrop(value: /* args */ AllDay[TEvent] => Unit): Self = StObject.set(x, "onEventDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEventDropUndefined: Self = StObject.set(x, "onEventDrop", js.undefined)
      
      @scala.inline
      def setOnEventResize(value: /* args */ AllDay[TEvent] => Unit): Self = StObject.set(x, "onEventResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEventResizeUndefined: Self = StObject.set(x, "onEventResize", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): Self = StObject.set(x, "resizableAccessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableAccessorFunction1(value: TEvent => Boolean): Self = StObject.set(x, "resizableAccessor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizableAccessorUndefined: Self = StObject.set(x, "resizableAccessor", js.undefined)
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    }
  }
  
  @js.native
  trait withDragAndDropProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
    
    var components: js.UndefOr[Components_[TEvent, TResource]] = js.native
    
    var dragFromOutsideItem: js.UndefOr[
        js.Function0[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])]
      ] = js.native
    
    var draggableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
    
    var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
    
    var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* args */ Direction[TEvent], Unit]] = js.native
    
    var onDropFromOutside: js.UndefOr[js.Function1[/* args */ AllDayEnd, Unit]] = js.native
    
    var onEventDrop: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.native
    
    var onEventResize: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.native
    
    var resizable: js.UndefOr[Boolean] = js.native
    
    var resizableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
    
    var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object withDragAndDropProps {
    
    @scala.inline
    def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](): withDragAndDropProps[TEvent, TResource] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[withDragAndDropProps[TEvent, TResource]]
    }
    
    @scala.inline
    implicit class withDragAndDropPropsMutableBuilder[Self <: withDragAndDropProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (withDragAndDropProps[TEvent, TResource])) extends AnyVal {
      
      @scala.inline
      def setComponents(value: Components_[TEvent, TResource]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])): Self = StObject.set(x, "dragFromOutsideItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDragFromOutsideItemUndefined: Self = StObject.set(x, "dragFromOutsideItem", js.undefined)
      
      @scala.inline
      def setDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "draggableAccessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "draggableAccessor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDraggableAccessorUndefined: Self = StObject.set(x, "draggableAccessor", js.undefined)
      
      @scala.inline
      def setElementProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementPropsUndefined: Self = StObject.set(x, "elementProps", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* args */ Direction[TEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDropFromOutside(value: /* args */ AllDayEnd => Unit): Self = StObject.set(x, "onDropFromOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropFromOutsideUndefined: Self = StObject.set(x, "onDropFromOutside", js.undefined)
      
      @scala.inline
      def setOnEventDrop(value: /* args */ AllDay[TEvent] => Unit): Self = StObject.set(x, "onEventDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEventDropUndefined: Self = StObject.set(x, "onEventDrop", js.undefined)
      
      @scala.inline
      def setOnEventResize(value: /* args */ AllDay[TEvent] => Unit): Self = StObject.set(x, "onEventResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEventResizeUndefined: Self = StObject.set(x, "onEventResize", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "resizableAccessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "resizableAccessor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizableAccessorUndefined: Self = StObject.set(x, "resizableAccessor", js.undefined)
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setSelectable(value: `true` | `false` | ignoreEvents): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
