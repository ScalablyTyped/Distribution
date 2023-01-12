package typings.reactTypesShared.srcDndMod

import typings.react.mod.Key
import typings.react.mod.RefObject
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableCollectionProps extends StObject {
  
  /** Function that returns the drop operations that are allowed for the dragged items. If not provided, all drop operations are allowed. */
  var getAllowedDropOperations: js.UndefOr[js.Function0[js.Array[DropOperation]]] = js.undefined
  
  /** A function that returns the items being dragged. */
  def getItems(keys: Set[Key]): js.Array[DragItem]
  
  /** Handler that is called when the drag operation is ended, either as a result of a drop or a cancellation. */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ DraggableCollectionEndEvent, Unit]] = js.undefined
  
  /** Handler that is called when the drag is moved. */
  var onDragMove: js.UndefOr[js.Function1[/* e */ DraggableCollectionMoveEvent, Unit]] = js.undefined
  
  /** Handler that is called when a drag operation is started. */
  var onDragStart: js.UndefOr[js.Function1[/* e */ DraggableCollectionStartEvent, Unit]] = js.undefined
  
  /** The ref of the element that will be rendered as the drag preview while dragging. */
  var preview: js.UndefOr[RefObject[DragPreviewRenderer]] = js.undefined
}
object DraggableCollectionProps {
  
  inline def apply(getItems: Set[Key] => js.Array[DragItem]): DraggableCollectionProps = {
    val __obj = js.Dynamic.literal(getItems = js.Any.fromFunction1(getItems))
    __obj.asInstanceOf[DraggableCollectionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableCollectionProps] (val x: Self) extends AnyVal {
    
    inline def setGetAllowedDropOperations(value: () => js.Array[DropOperation]): Self = StObject.set(x, "getAllowedDropOperations", js.Any.fromFunction0(value))
    
    inline def setGetAllowedDropOperationsUndefined: Self = StObject.set(x, "getAllowedDropOperations", js.undefined)
    
    inline def setGetItems(value: Set[Key] => js.Array[DragItem]): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
    
    inline def setOnDragEnd(value: /* e */ DraggableCollectionEndEvent => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: /* e */ DraggableCollectionMoveEvent => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: /* e */ DraggableCollectionStartEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setPreview(value: RefObject[DragPreviewRenderer]): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
  }
}
