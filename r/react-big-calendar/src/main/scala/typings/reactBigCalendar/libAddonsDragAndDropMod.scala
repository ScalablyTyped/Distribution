package typings.reactBigCalendar

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.DragEvent
import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.mod.CalendarProps
import typings.reactBigCalendar.mod.Components_
import typings.reactBigCalendar.mod.DateLocalizer
import typings.reactBigCalendar.mod.stringOrDate
import typings.reactBigCalendar.reactBigCalendarBooleans.`false`
import typings.reactBigCalendar.reactBigCalendarBooleans.`true`
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAddonsDragAndDropMod {
  
  @JSImport("react-big-calendar/lib/addons/dragAndDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TEvent /* <: js.Object */, TResource /* <: js.Object */](calendar: ComponentType[CalendarProps[TEvent, TResource]]): ComponentType[DragAndDropCalendarProps[TEvent, TResource]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(calendar.asInstanceOf[js.Any]).asInstanceOf[ComponentType[DragAndDropCalendarProps[TEvent, TResource]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactBigCalendar.reactBigCalendarStrings.resize
    - typings.reactBigCalendar.reactBigCalendarStrings.move
  */
  trait DragAction extends StObject
  object DragAction {
    
    inline def move: typings.reactBigCalendar.reactBigCalendarStrings.move = "move".asInstanceOf[typings.reactBigCalendar.reactBigCalendarStrings.move]
    
    inline def resize: typings.reactBigCalendar.reactBigCalendarStrings.resize = "resize".asInstanceOf[typings.reactBigCalendar.reactBigCalendarStrings.resize]
  }
  
  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = Component[DragAndDropCalendarProps[TEvent, TResource], js.Object, Any]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactBigCalendar.libAddonsDragAndDropMod.withDragAndDropProps because var conflicts: components, elementProps, selectable, step. Inlined onEventDrop, onEventResize, onDragStart, onDragOver, onDropFromOutside, dragFromOutsideItem, draggableAccessor, resizableAccessor, resizable */ trait DragAndDropCalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */]
    extends StObject
       with CalendarProps[TEvent, TResource] {
    
    var dragFromOutsideItem: js.UndefOr[js.Function0[(/* keyof TEvent */ String) | (js.Function1[TEvent, js.Date])]] = js.undefined
    
    var draggableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* args */ OnDragStartArgs[TEvent], Unit]] = js.undefined
    
    var onDropFromOutside: js.UndefOr[js.Function1[/* args */ DragFromOutsideItemArgs, Unit]] = js.undefined
    
    var onEventDrop: js.UndefOr[js.Function1[/* args */ EventInteractionArgs[TEvent], Unit]] = js.undefined
    
    var onEventResize: js.UndefOr[js.Function1[/* args */ EventInteractionArgs[TEvent], Unit]] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var resizableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])] = js.undefined
  }
  object DragAndDropCalendarProps {
    
    inline def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](localizer: DateLocalizer): DragAndDropCalendarProps[TEvent, TResource] = {
      val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragAndDropCalendarProps[TEvent, TResource]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropCalendarProps[?, ?], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self & (DragAndDropCalendarProps[TEvent, TResource])) extends AnyVal {
      
      inline def setDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[TEvent, js.Date])): Self = StObject.set(x, "dragFromOutsideItem", js.Any.fromFunction0(value))
      
      inline def setDragFromOutsideItemUndefined: Self = StObject.set(x, "dragFromOutsideItem", js.undefined)
      
      inline def setDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): Self = StObject.set(x, "draggableAccessor", value.asInstanceOf[js.Any])
      
      inline def setDraggableAccessorFunction1(value: TEvent => Boolean): Self = StObject.set(x, "draggableAccessor", js.Any.fromFunction1(value))
      
      inline def setDraggableAccessorUndefined: Self = StObject.set(x, "draggableAccessor", js.undefined)
      
      inline def setOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* args */ OnDragStartArgs[TEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDropFromOutside(value: /* args */ DragFromOutsideItemArgs => Unit): Self = StObject.set(x, "onDropFromOutside", js.Any.fromFunction1(value))
      
      inline def setOnDropFromOutsideUndefined: Self = StObject.set(x, "onDropFromOutside", js.undefined)
      
      inline def setOnEventDrop(value: /* args */ EventInteractionArgs[TEvent] => Unit): Self = StObject.set(x, "onEventDrop", js.Any.fromFunction1(value))
      
      inline def setOnEventDropUndefined: Self = StObject.set(x, "onEventDrop", js.undefined)
      
      inline def setOnEventResize(value: /* args */ EventInteractionArgs[TEvent] => Unit): Self = StObject.set(x, "onEventResize", js.Any.fromFunction1(value))
      
      inline def setOnEventResizeUndefined: Self = StObject.set(x, "onEventResize", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): Self = StObject.set(x, "resizableAccessor", value.asInstanceOf[js.Any])
      
      inline def setResizableAccessorFunction1(value: TEvent => Boolean): Self = StObject.set(x, "resizableAccessor", js.Any.fromFunction1(value))
      
      inline def setResizableAccessorUndefined: Self = StObject.set(x, "resizableAccessor", js.undefined)
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactBigCalendar.reactBigCalendarStrings.UP
    - typings.reactBigCalendar.reactBigCalendarStrings.DOWN
    - typings.reactBigCalendar.reactBigCalendarStrings.LEFT
    - typings.reactBigCalendar.reactBigCalendarStrings.RIGHT
  */
  trait DragDirection extends StObject
  object DragDirection {
    
    inline def DOWN: typings.reactBigCalendar.reactBigCalendarStrings.DOWN = "DOWN".asInstanceOf[typings.reactBigCalendar.reactBigCalendarStrings.DOWN]
    
    inline def LEFT: typings.reactBigCalendar.reactBigCalendarStrings.LEFT = "LEFT".asInstanceOf[typings.reactBigCalendar.reactBigCalendarStrings.LEFT]
    
    inline def RIGHT: typings.reactBigCalendar.reactBigCalendarStrings.RIGHT = "RIGHT".asInstanceOf[typings.reactBigCalendar.reactBigCalendarStrings.RIGHT]
    
    inline def UP: typings.reactBigCalendar.reactBigCalendarStrings.UP = "UP".asInstanceOf[typings.reactBigCalendar.reactBigCalendarStrings.UP]
  }
  
  trait DragFromOutsideItemArgs extends StObject {
    
    var allDay: Boolean
    
    var end: stringOrDate
    
    var start: stringOrDate
  }
  object DragFromOutsideItemArgs {
    
    inline def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): DragFromOutsideItemArgs = {
      val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragFromOutsideItemArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragFromOutsideItemArgs] (val x: Self) extends AnyVal {
      
      inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventInteractionArgs[TEvent] extends StObject {
    
    var end: stringOrDate
    
    var event: TEvent
    
    var isAllDay: Boolean
    
    var start: stringOrDate
  }
  object EventInteractionArgs {
    
    inline def apply[TEvent](end: stringOrDate, event: TEvent, isAllDay: Boolean, start: stringOrDate): EventInteractionArgs[TEvent] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isAllDay = isAllDay.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventInteractionArgs[TEvent]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventInteractionArgs[?], TEvent] (val x: Self & EventInteractionArgs[TEvent]) extends AnyVal {
      
      inline def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setIsAllDay(value: Boolean): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
      
      inline def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnDragStartArgs[TEvent] extends StObject {
    
    var action: DragAction
    
    var direction: DragDirection
    
    var event: TEvent
  }
  object OnDragStartArgs {
    
    inline def apply[TEvent](action: DragAction, direction: DragDirection, event: TEvent): OnDragStartArgs[TEvent] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnDragStartArgs[TEvent]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnDragStartArgs[?], TEvent] (val x: Self & OnDragStartArgs[TEvent]) extends AnyVal {
      
      inline def setAction(value: DragAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: DragDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait withDragAndDropProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
    
    var components: js.UndefOr[Components_[TEvent, TResource]] = js.undefined
    
    var dragFromOutsideItem: js.UndefOr[
        js.Function0[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])]
      ] = js.undefined
    
    var draggableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
    
    var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* args */ OnDragStartArgs[TEvent], Unit]] = js.undefined
    
    var onDropFromOutside: js.UndefOr[js.Function1[/* args */ DragFromOutsideItemArgs, Unit]] = js.undefined
    
    var onEventDrop: js.UndefOr[js.Function1[/* args */ EventInteractionArgs[TEvent], Unit]] = js.undefined
    
    var onEventResize: js.UndefOr[js.Function1[/* args */ EventInteractionArgs[TEvent], Unit]] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var resizableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
    
    var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object withDragAndDropProps {
    
    inline def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](): withDragAndDropProps[TEvent, TResource] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[withDragAndDropProps[TEvent, TResource]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: withDragAndDropProps[?, ?], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self & (withDragAndDropProps[TEvent, TResource])) extends AnyVal {
      
      inline def setComponents(value: Components_[TEvent, TResource]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDragFromOutsideItem(value: () => (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self = StObject.set(x, "dragFromOutsideItem", js.Any.fromFunction0(value))
      
      inline def setDragFromOutsideItemUndefined: Self = StObject.set(x, "dragFromOutsideItem", js.undefined)
      
      inline def setDraggableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "draggableAccessor", value.asInstanceOf[js.Any])
      
      inline def setDraggableAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "draggableAccessor", js.Any.fromFunction1(value))
      
      inline def setDraggableAccessorUndefined: Self = StObject.set(x, "draggableAccessor", js.undefined)
      
      inline def setElementProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
      
      inline def setElementPropsUndefined: Self = StObject.set(x, "elementProps", js.undefined)
      
      inline def setOnDragOver(value: /* event */ DragEvent[Element] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* args */ OnDragStartArgs[TEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDropFromOutside(value: /* args */ DragFromOutsideItemArgs => Unit): Self = StObject.set(x, "onDropFromOutside", js.Any.fromFunction1(value))
      
      inline def setOnDropFromOutsideUndefined: Self = StObject.set(x, "onDropFromOutside", js.undefined)
      
      inline def setOnEventDrop(value: /* args */ EventInteractionArgs[TEvent] => Unit): Self = StObject.set(x, "onEventDrop", js.Any.fromFunction1(value))
      
      inline def setOnEventDropUndefined: Self = StObject.set(x, "onEventDrop", js.undefined)
      
      inline def setOnEventResize(value: /* args */ EventInteractionArgs[TEvent] => Unit): Self = StObject.set(x, "onEventResize", js.Any.fromFunction1(value))
      
      inline def setOnEventResizeUndefined: Self = StObject.set(x, "onEventResize", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "resizableAccessor", value.asInstanceOf[js.Any])
      
      inline def setResizableAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "resizableAccessor", js.Any.fromFunction1(value))
      
      inline def setResizableAccessorUndefined: Self = StObject.set(x, "resizableAccessor", js.undefined)
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSelectable(value: `true` | `false` | ignoreEvents): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
