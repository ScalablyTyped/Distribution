package typings.reactDnd

import typings.dndCore.distInterfacesMod.Identifier
import typings.dndCore.distInterfacesMod.Unsubscribe
import typings.reactDnd.anon.HandlerIds
import typings.reactDnd.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMonitorsMod {
  
  trait DragLayerMonitor[DragObject] extends StObject {
    
    /**
      * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
      * Returns null if no item is being dragged.
      */
    def getClientOffset(): XYCoord | Null
    
    /**
      * Returns the { x, y } difference between the last recorded client offset of the pointer and the client
      * offset when current the drag operation has started. Returns null if no item is being dragged.
      */
    def getDifferenceFromInitialOffset(): XYCoord | Null
    
    /**
      * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
      * Returns null if no item is being dragged.
      */
    def getInitialClientOffset(): XYCoord | Null
    
    /**
      * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current
      * drag operation has started. Returns null if no item is being dragged.
      */
    def getInitialSourceClientOffset(): XYCoord | Null
    
    /**
      * Returns a plain object representing the currently dragged item.
      * Every drag source must specify it by returning an object from its beginDrag() method.
      * Returns null if no item is being dragged.
      */
    def getItem[T](): T
    
    /**
      * Returns a string or a symbol identifying the type of the current dragged item.
      * Returns null if no item is being dragged.
      */
    def getItemType(): Identifier | Null
    
    /**
      * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its
      * position at the time when the current drag operation has started, and the movement difference.
      * Returns null if no item is being dragged.
      */
    def getSourceClientOffset(): XYCoord | Null
    
    /**
      * Returns true if a drag operation is in progress. Returns false otherwise.
      */
    def isDragging(): Boolean
  }
  object DragLayerMonitor {
    
    inline def apply[DragObject](
      getClientOffset: () => XYCoord | Null,
      getDifferenceFromInitialOffset: () => XYCoord | Null,
      getInitialClientOffset: () => XYCoord | Null,
      getInitialSourceClientOffset: () => XYCoord | Null,
      getItem: () => Any,
      getItemType: () => Identifier | Null,
      getSourceClientOffset: () => XYCoord | Null,
      isDragging: () => Boolean
    ): DragLayerMonitor[DragObject] = {
      val __obj = js.Dynamic.literal(getClientOffset = js.Any.fromFunction0(getClientOffset), getDifferenceFromInitialOffset = js.Any.fromFunction0(getDifferenceFromInitialOffset), getInitialClientOffset = js.Any.fromFunction0(getInitialClientOffset), getInitialSourceClientOffset = js.Any.fromFunction0(getInitialSourceClientOffset), getItem = js.Any.fromFunction0(getItem), getItemType = js.Any.fromFunction0(getItemType), getSourceClientOffset = js.Any.fromFunction0(getSourceClientOffset), isDragging = js.Any.fromFunction0(isDragging))
      __obj.asInstanceOf[DragLayerMonitor[DragObject]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragLayerMonitor[?], DragObject] (val x: Self & DragLayerMonitor[DragObject]) extends AnyVal {
      
      inline def setGetClientOffset(value: () => XYCoord | Null): Self = StObject.set(x, "getClientOffset", js.Any.fromFunction0(value))
      
      inline def setGetDifferenceFromInitialOffset(value: () => XYCoord | Null): Self = StObject.set(x, "getDifferenceFromInitialOffset", js.Any.fromFunction0(value))
      
      inline def setGetInitialClientOffset(value: () => XYCoord | Null): Self = StObject.set(x, "getInitialClientOffset", js.Any.fromFunction0(value))
      
      inline def setGetInitialSourceClientOffset(value: () => XYCoord | Null): Self = StObject.set(x, "getInitialSourceClientOffset", js.Any.fromFunction0(value))
      
      inline def setGetItem(value: () => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
      
      inline def setGetItemType(value: () => Identifier | Null): Self = StObject.set(x, "getItemType", js.Any.fromFunction0(value))
      
      inline def setGetSourceClientOffset(value: () => XYCoord | Null): Self = StObject.set(x, "getSourceClientOffset", js.Any.fromFunction0(value))
      
      inline def setIsDragging(value: () => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DragSourceMonitor[DragObject, DropResult]
    extends StObject
       with HandlerManager
       with MonitorEventEmitter {
    
    /**
      * Returns true if no drag operation is in progress, and the owner's canDrag() returns true or is not defined.
      */
    def canDrag(): Boolean = js.native
    
    /**
      *  Returns true if some drop target has handled the drop event, false otherwise. Even if a target did not return a drop result, didDrop() returns true.
      * Use it inside endDrag() to test whether any drop target has handled the drop. Returns false if called outside endDrag().
      */
    def didDrop(): Boolean = js.native
    
    /**
      * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress. Returns null if no item is being dragged.
      */
    def getClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns the { x, y } difference between the last recorded client offset of the pointer and the client offset when the current drag operation has started.
      * Returns null if no item is being dragged.
      */
    def getDifferenceFromInitialOffset(): XYCoord | Null = js.native
    
    /**
      * Returns a plain object representing the last recorded drop result. The drop targets may optionally specify it by returning an object from their
      * drop() methods. When a chain of drop() is dispatched for the nested targets, bottom up, any parent that explicitly returns its own result from drop()
      * overrides the child drop result previously set by the child. Returns null if called outside endDrag().
      */
    def getDropResult[T](): T | Null = js.native
    
    /**
      * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started. Returns null if no item is being dragged.
      */
    def getInitialClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current drag operation has started.
      * Returns null if no item is being dragged.
      */
    def getInitialSourceClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns a plain object representing the currently dragged item. Every drag source must specify it by returning an object from its beginDrag() method.
      * Returns null if no item is being dragged.
      */
    def getItem[T](): T = js.native
    
    /**
      * Returns a string or a symbol identifying the type of the current dragged item. Returns null if no item is being dragged.
      */
    def getItemType(): Identifier | Null = js.native
    
    /**
      * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its position at the time when the current drag operation has
      * started, and the movement difference. Returns null if no item is being dragged.
      */
    def getSourceClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns the ids of the potential drop targets.
      */
    def getTargetIds(): js.Array[Identifier] = js.native
    
    /**
      *  Returns true if a drag operation is in progress, and either the owner initiated the drag, or its isDragging() is defined and returns true.
      */
    def isDragging(): Boolean = js.native
  }
  
  @js.native
  trait DropTargetMonitor[DragObject, DropResult]
    extends StObject
       with HandlerManager
       with MonitorEventEmitter {
    
    /**
      * Returns true if there is a drag operation in progress, and the owner's canDrop() returns true or is not defined.
      */
    def canDrop(): Boolean = js.native
    
    /**
      *  Returns true if some drop target has handled the drop event, false otherwise. Even if a target did not return a drop result,
      * didDrop() returns true. Use it inside drop() to test whether any nested drop target has already handled the drop. Returns false
      * if called outside drop().
      */
    def didDrop(): Boolean = js.native
    
    /**
      * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress. Returns null if no item is being dragged.
      */
    def getClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns the { x, y } difference between the last recorded client offset of the pointer and the client offset when current the drag operation has
      * started. Returns null if no item is being dragged.
      */
    def getDifferenceFromInitialOffset(): XYCoord | Null = js.native
    
    /**
      * Returns a plain object representing the last recorded drop result. The drop targets may optionally specify it by returning an
      * object from their drop() methods. When a chain of drop() is dispatched for the nested targets, bottom up, any parent that explicitly
      * returns its own result from drop() overrides the drop result previously set by the child. Returns null if called outside drop().
      */
    def getDropResult[T](): T | Null = js.native
    
    /**
      * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started. Returns null if no item
      * is being dragged.
      */
    def getInitialClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current drag operation has started.
      * Returns null if no item is being dragged.
      */
    def getInitialSourceClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns a plain object representing the currently dragged item. Every drag source must specify it by returning an object from
      * its beginDrag() method. Returns null if no item is being dragged.
      */
    def getItem[T](): T = js.native
    
    /**
      * Returns a string or a symbol identifying the type of the current dragged item. Returns null if no item is being dragged.
      */
    def getItemType(): Identifier | Null = js.native
    
    /**
      * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its position at the time when the current
      * drag operation has started, and the movement difference. Returns null if no item is being dragged.
      */
    def getSourceClientOffset(): XYCoord | Null = js.native
    
    /**
      * Returns true if there is a drag operation in progress, and the pointer is currently hovering over the owner.
      * You may optionally pass { shallow: true } to strictly check whether only the owner is being hovered, as opposed
      * to a nested target.
      */
    def isOver(): Boolean = js.native
    def isOver(options: `0`): Boolean = js.native
  }
  
  @js.native
  trait HandlerManager extends StObject {
    
    def getHandlerId(): Identifier | Null = js.native
    
    def receiveHandlerId(): Unit = js.native
    def receiveHandlerId(handlerId: Identifier): Unit = js.native
  }
  
  @js.native
  trait MonitorEventEmitter extends StObject {
    
    def subscribeToStateChange(fn: js.Function0[Unit]): Unsubscribe = js.native
    def subscribeToStateChange(fn: js.Function0[Unit], options: HandlerIds): Unsubscribe = js.native
  }
  
  trait XYCoord extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object XYCoord {
    
    inline def apply(x: Double, y: Double): XYCoord = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[XYCoord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XYCoord] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
