package typings.reactDnd

import typings.dndCore.distInterfacesMod.Identifier
import typings.dndCore.distInterfacesMod.SourceType
import typings.dndCore.distInterfacesMod.TargetType
import typings.reactDnd.distTypesMonitorsMod.DragSourceMonitor
import typings.reactDnd.distTypesMonitorsMod.DropTargetMonitor
import typings.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typings.reactDnd.distTypesOptionsMod.DragSourceOptions
import typings.reactDnd.distTypesOptionsMod.DropTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksTypesMod {
  
  type DragObjectFactory[T] = js.Function1[/* monitor */ DragSourceMonitor[T, Any], T | Null]
  
  trait DragSourceHookSpec[DragObject, DropResult, CollectedProps] extends StObject {
    
    /**
      * Optional.
      * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
      * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
      * monitor.canDrag() inside this method.
      */
    var canDrag: js.UndefOr[
        Boolean | (js.Function1[/* monitor */ DragSourceMonitor[DragObject, DropResult], Boolean])
      ] = js.undefined
    
    /**
      * A function to collect rendering properties
      */
    var collect: js.UndefOr[
        js.Function1[/* monitor */ DragSourceMonitor[DragObject, DropResult], CollectedProps]
      ] = js.undefined
    
    /**
      * Optional.
      * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
      * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
      * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
      * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
      * component parameter is set to be null.
      */
    var end: js.UndefOr[
        js.Function2[
          /* draggedItem */ DragObject, 
          /* monitor */ DragSourceMonitor[DragObject, DropResult], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Optional.
      * By default, only the drag source that initiated the drag operation is considered to be dragging. You can
      * override this behavior by defining a custom isDragging method. It might return something like props.id === monitor.getItem().id.
      * Do this if the original component may be unmounted during the dragging and later “resurrected” with a different parent.
      * For example, when moving a card across the lists in a Kanban board, you want it to retain the dragged appearance—even though
      * technically, the component gets unmounted and a different one gets mounted every time you move it to another list.
      *
      * Note: You may not call monitor.isDragging() inside this method.
      */
    var isDragging: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor[DragObject, DropResult], Boolean]] = js.undefined
    
    /**
      * This property generates or defines a plain javascript item describing
      * the data being dragged. This is the only information available to the
      * drop targets about the drag source so it's important to pick the minimal
      * data they need to know.
      *
      * You may be tempted to put a reference to the component or complex object here,
      * but you should try very hard to avoid doing this because it couples the
      * drag sources and drop targets. It's a good idea to use something like
      * { id: props.id }
      *
      * If a function-form is used, it is invoked when the drag begins and returns a draggable item.
      * If the function returns null, the drag is canceled
      *
      */
    var item: js.UndefOr[DragObject | DragObjectFactory[DragObject]] = js.undefined
    
    /**
      * The drag source options
      */
    var options: js.UndefOr[DragSourceOptions] = js.undefined
    
    /**
      * DragPreview options
      */
    var previewOptions: js.UndefOr[DragPreviewOptions] = js.undefined
    
    /**
      * The type of item being dragged. This is required when using the function form of spec.item.
      * If spec.item is a static object, the type may either be defined on that object as `item.type`, or it may
      * be defined here.
      */
    var `type`: SourceType
  }
  object DragSourceHookSpec {
    
    inline def apply[DragObject, DropResult, CollectedProps](`type`: SourceType): DragSourceHookSpec[DragObject, DropResult, CollectedProps] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragSourceHookSpec[?, ?, ?], DragObject, DropResult, CollectedProps] (val x: Self & (DragSourceHookSpec[DragObject, DropResult, CollectedProps])) extends AnyVal {
      
      inline def setCanDrag(value: Boolean | (js.Function1[/* monitor */ DragSourceMonitor[DragObject, DropResult], Boolean])): Self = StObject.set(x, "canDrag", value.asInstanceOf[js.Any])
      
      inline def setCanDragFunction1(value: /* monitor */ DragSourceMonitor[DragObject, DropResult] => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction1(value))
      
      inline def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      inline def setCollect(value: /* monitor */ DragSourceMonitor[DragObject, DropResult] => CollectedProps): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
      
      inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      inline def setEnd(
        value: (/* draggedItem */ DragObject, /* monitor */ DragSourceMonitor[DragObject, DropResult]) => Unit
      ): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setIsDragging(value: /* monitor */ DragSourceMonitor[DragObject, DropResult] => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction1(value))
      
      inline def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
      
      inline def setItem(value: DragObject | DragObjectFactory[DragObject]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemFunction1(value: /* monitor */ DragSourceMonitor[DragObject, Any] => DragObject | Null): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOptions(value: DragSourceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPreviewOptions(value: DragPreviewOptions): Self = StObject.set(x, "previewOptions", value.asInstanceOf[js.Any])
      
      inline def setPreviewOptionsUndefined: Self = StObject.set(x, "previewOptions", js.undefined)
      
      inline def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropTargetHookSpec[DragObject, DropResult, CollectedProps] extends StObject {
    
    /**
      * The kinds of dragItems this dropTarget accepts
      */
    var accept: TargetType
    
    /**
      * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
      * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
      * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
      */
    var canDrop: js.UndefOr[
        js.Function2[
          /* item */ DragObject, 
          /* monitor */ DropTargetMonitor[DragObject, DropResult], 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * A function to collect rendering properties
      */
    var collect: js.UndefOr[
        js.Function1[/* monitor */ DropTargetMonitor[DragObject, DropResult], CollectedProps]
      ] = js.undefined
    
    /**
      * Optional.
      * Called when a compatible item is dropped on the target. You may either return undefined, or a plain object.
      * If you return an object, it is going to become the drop result and will be available to the drag source in its
      * endDrag method as monitor.getDropResult(). This is useful in case you want to perform different actions
      * depending on which target received the drop. If you have nested drop targets, you can test whether a nested
      * target has already handled drop by checking monitor.didDrop() and monitor.getDropResult(). Both this method and
      * the source's endDrag method are good places to fire Flux actions. This method will not be called if canDrop()
      * is defined and returns false.
      */
    var drop: js.UndefOr[
        js.Function2[
          /* item */ DragObject, 
          /* monitor */ DropTargetMonitor[DragObject, DropResult], 
          js.UndefOr[DropResult]
        ]
      ] = js.undefined
    
    /**
      * Optional.
      * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
      * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
      * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
      */
    var hover: js.UndefOr[
        js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor[DragObject, DropResult], Unit]
      ] = js.undefined
    
    /**
      * The drop target options
      */
    var options: js.UndefOr[DropTargetOptions] = js.undefined
  }
  object DropTargetHookSpec {
    
    inline def apply[DragObject, DropResult, CollectedProps](accept: TargetType): DropTargetHookSpec[DragObject, DropResult, CollectedProps] = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropTargetHookSpec[?, ?, ?], DragObject, DropResult, CollectedProps] (val x: Self & (DropTargetHookSpec[DragObject, DropResult, CollectedProps])) extends AnyVal {
      
      inline def setAccept(value: TargetType): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptVarargs(value: Identifier*): Self = StObject.set(x, "accept", js.Array(value*))
      
      inline def setCanDrop(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor[DragObject, DropResult]) => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
      
      inline def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      inline def setCollect(value: /* monitor */ DropTargetMonitor[DragObject, DropResult] => CollectedProps): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
      
      inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      inline def setDrop(
        value: (/* item */ DragObject, /* monitor */ DropTargetMonitor[DragObject, DropResult]) => js.UndefOr[DropResult]
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setHover(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor[DragObject, DropResult]) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction2(value))
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setOptions(value: DropTargetOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type FactoryOrInstance[T] = T | js.Function0[T]
}
