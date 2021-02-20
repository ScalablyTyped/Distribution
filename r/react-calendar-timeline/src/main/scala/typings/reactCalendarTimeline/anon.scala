package typings.reactCalendarTimeline

import typings.moment.mod.Moment
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactCalendarTimeline.mod.Interval
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClassName extends StObject {
    
    var className: String = js.native
    
    var ref: Ref[_] = js.native
    
    var style: CSSProperties = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String, style: CSSProperties): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollisionLeft extends StObject {
    
    var collisionLeft: Double = js.native
    
    var collisionWidth: Double = js.native
    
    var height: Double = js.native
    
    var isDragging: Boolean = js.native
    
    var left: Double = js.native
    
    var order: Group = js.native
    
    var originalLeft: Double = js.native
    
    var stack: Boolean = js.native
    
    var top: Double | Null = js.native
    
    var width: Double = js.native
  }
  object CollisionLeft {
    
    @scala.inline
    def apply(
      collisionLeft: Double,
      collisionWidth: Double,
      height: Double,
      isDragging: Boolean,
      left: Double,
      order: Group,
      originalLeft: Double,
      stack: Boolean,
      width: Double
    ): CollisionLeft = {
      val __obj = js.Dynamic.literal(collisionLeft = collisionLeft.asInstanceOf[js.Any], collisionWidth = collisionWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], originalLeft = originalLeft.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollisionLeft]
    }
    
    @scala.inline
    implicit class CollisionLeftMutableBuilder[Self <: CollisionLeft] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollisionLeft(value: Double): Self = StObject.set(x, "collisionLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionWidth(value: Double): Self = StObject.set(x, "collisionWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Group): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalLeft(value: Double): Self = StObject.set(x, "originalLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopNull: Self = StObject.set(x, "top", null)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EndTime extends StObject {
    
    var endTime: Double = js.native
    
    var labelWidth: Double = js.native
    
    var left: Double = js.native
    
    var startTime: Double = js.native
  }
  object EndTime {
    
    @scala.inline
    def apply(endTime: Double, labelWidth: Double, left: Double, startTime: Double): EndTime = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndTime]
    }
    
    @scala.inline
    implicit class EndTimeMutableBuilder[Self <: EndTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Group extends StObject {
    
    var group: Id = js.native
    
    var index: Double = js.native
  }
  object Group {
    
    @scala.inline
    def apply(group: Id, index: Double): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: Id): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var className: String = js.native
    
    var key: typings.reactCalendarTimeline.mod.Id = js.native
    
    var onContextMenu: ReactEventHandler[Element] = js.native
    
    var onDoubleClick: MouseEventHandler[Element] = js.native
    
    var onMouseDown: MouseEventHandler[Element] = js.native
    
    var onMouseUp: MouseEventHandler[Element] = js.native
    
    var onTouchEnd: TouchEventHandler[Element] = js.native
    
    var onTouchStart: TouchEventHandler[Element] = js.native
    
    var ref: Ref[_] = js.native
    
    var style: CSSProperties = js.native
  }
  object Key {
    
    @scala.inline
    def apply(
      className: String,
      key: typings.reactCalendarTimeline.mod.Id,
      onContextMenu: SyntheticEvent[Element, Event] => Unit,
      onDoubleClick: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseUp: MouseEvent[Element, NativeMouseEvent] => Unit,
      onTouchEnd: TouchEvent[Element] => Unit,
      onTouchStart: TouchEvent[Element] => Unit,
      style: CSSProperties
    ): Key = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: typings.reactCalendarTimeline.mod.Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextMenu(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<react-calendar-timeline.react-calendar-timeline.GetIntervalProps> & {  key :string | number} */
  @js.native
  trait RequiredGetIntervalPropsk extends StObject {
    
    var interval: Interval = js.native
    
    var key: String | Double = js.native
    
    var onClick: MouseEventHandler[Element] = js.native
    
    var style: CSSProperties = js.native
  }
  object RequiredGetIntervalPropsk {
    
    @scala.inline
    def apply(
      interval: Interval,
      key: String | Double,
      onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
      style: CSSProperties
    ): RequiredGetIntervalPropsk = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredGetIntervalPropsk]
    }
    
    @scala.inline
    implicit class RequiredGetIntervalPropskMutableBuilder[Self <: RequiredGetIntervalPropsk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartTime extends StObject {
    
    var endTime: Moment = js.native
    
    var startTime: Moment = js.native
  }
  object StartTime {
    
    @scala.inline
    def apply(endTime: Moment, startTime: Moment): StartTime = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTime]
    }
    
    @scala.inline
    implicit class StartTimeMutableBuilder[Self <: StartTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Moment): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Moment): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: CSSProperties = js.native
  }
  object Style {
    
    @scala.inline
    def apply(style: CSSProperties): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
