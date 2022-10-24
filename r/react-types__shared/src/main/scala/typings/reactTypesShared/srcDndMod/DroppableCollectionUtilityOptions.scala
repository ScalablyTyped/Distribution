package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionUtilityOptions extends StObject {
  
  /**
    * The drag types that the droppable collection accepts. If the collection accepts directories, include `DIRECTORY_DRAG_TYPE` in your array of allowed types.
    * @default 'all'
    */
  var acceptedDragTypes: js.UndefOr[all | (js.Array[String | js.Symbol])] = js.undefined
  
  /**
    * Handler that is called when external items are dropped "between" items.
    */
  var onInsert: js.UndefOr[js.Function1[/* e */ DroppableCollectionInsertDropEvent, Unit]] = js.undefined
  
  /**
    * Handler that is called when items are dropped "on" an item.
    */
  var onItemDrop: js.UndefOr[js.Function1[/* e */ DroppableCollectionOnItemDropEvent, Unit]] = js.undefined
  
  /**
    * Handler that is called when items are reordered via drag in the source collection.
    */
  var onReorder: js.UndefOr[js.Function1[/* e */ DroppableCollectionReorderEvent, Unit]] = js.undefined
  
  /**
    * Handler that is called when external items are dropped on the droppable collection's root.
    */
  var onRootDrop: js.UndefOr[js.Function1[/* e */ DroppableCollectionRootDropEvent, Unit]] = js.undefined
  
  /**
    * A function returning whether a given target in the droppable collection is a valid "on" drop target for the current drag types.
    */
  var shouldAcceptItemDrop: js.UndefOr[js.Function2[/* target */ ItemDropTarget, /* types */ DragTypes, Boolean]] = js.undefined
}
object DroppableCollectionUtilityOptions {
  
  inline def apply(): DroppableCollectionUtilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableCollectionUtilityOptions]
  }
  
  extension [Self <: DroppableCollectionUtilityOptions](x: Self) {
    
    inline def setAcceptedDragTypes(value: all | (js.Array[String | js.Symbol])): Self = StObject.set(x, "acceptedDragTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedDragTypesUndefined: Self = StObject.set(x, "acceptedDragTypes", js.undefined)
    
    inline def setAcceptedDragTypesVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "acceptedDragTypes", js.Array(value*))
    
    inline def setOnInsert(value: /* e */ DroppableCollectionInsertDropEvent => Unit): Self = StObject.set(x, "onInsert", js.Any.fromFunction1(value))
    
    inline def setOnInsertUndefined: Self = StObject.set(x, "onInsert", js.undefined)
    
    inline def setOnItemDrop(value: /* e */ DroppableCollectionOnItemDropEvent => Unit): Self = StObject.set(x, "onItemDrop", js.Any.fromFunction1(value))
    
    inline def setOnItemDropUndefined: Self = StObject.set(x, "onItemDrop", js.undefined)
    
    inline def setOnReorder(value: /* e */ DroppableCollectionReorderEvent => Unit): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
    
    inline def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
    
    inline def setOnRootDrop(value: /* e */ DroppableCollectionRootDropEvent => Unit): Self = StObject.set(x, "onRootDrop", js.Any.fromFunction1(value))
    
    inline def setOnRootDropUndefined: Self = StObject.set(x, "onRootDrop", js.undefined)
    
    inline def setShouldAcceptItemDrop(value: (/* target */ ItemDropTarget, /* types */ DragTypes) => Boolean): Self = StObject.set(x, "shouldAcceptItemDrop", js.Any.fromFunction2(value))
    
    inline def setShouldAcceptItemDropUndefined: Self = StObject.set(x, "shouldAcceptItemDrop", js.undefined)
  }
}
