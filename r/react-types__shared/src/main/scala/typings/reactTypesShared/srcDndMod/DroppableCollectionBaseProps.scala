package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionBaseProps extends StObject {
  
  /**
    * A function returning the drop operation to be performed when items matching the given types are dropped
    * on the drop target.
    */
  var getDropOperation: js.UndefOr[
    js.Function3[
      /* target */ DropTarget, 
      /* types */ DragTypes, 
      /* allowedOperations */ js.Array[DropOperation], 
      DropOperation
    ]
  ] = js.undefined
  
  /**
    * Handler that is called when a valid drag is dropped on a drop target. When defined, this overrides other
    * drop handlers such as `onInsert`, and `onItemDrop`.
    */
  var onDrop: js.UndefOr[js.Function1[/* e */ DroppableCollectionDropEvent, Unit]] = js.undefined
  
  /**
    * Handler that is called after a valid drag is held over a drop target for a period of time.
    * @private
    */
  var onDropActivate: js.UndefOr[js.Function1[/* e */ DroppableCollectionActivateEvent, Unit]] = js.undefined
  
  /** Handler that is called when a valid drag enters a drop target. */
  var onDropEnter: js.UndefOr[js.Function1[/* e */ DroppableCollectionEnterEvent, Unit]] = js.undefined
  
  /** Handler that is called when a valid drag exits a drop target. */
  var onDropExit: js.UndefOr[js.Function1[/* e */ DroppableCollectionExitEvent, Unit]] = js.undefined
}
object DroppableCollectionBaseProps {
  
  inline def apply(): DroppableCollectionBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableCollectionBaseProps]
  }
  
  extension [Self <: DroppableCollectionBaseProps](x: Self) {
    
    inline def setGetDropOperation(
      value: (/* target */ DropTarget, /* types */ DragTypes, /* allowedOperations */ js.Array[DropOperation]) => DropOperation
    ): Self = StObject.set(x, "getDropOperation", js.Any.fromFunction3(value))
    
    inline def setGetDropOperationUndefined: Self = StObject.set(x, "getDropOperation", js.undefined)
    
    inline def setOnDrop(value: /* e */ DroppableCollectionDropEvent => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropActivate(value: /* e */ DroppableCollectionActivateEvent => Unit): Self = StObject.set(x, "onDropActivate", js.Any.fromFunction1(value))
    
    inline def setOnDropActivateUndefined: Self = StObject.set(x, "onDropActivate", js.undefined)
    
    inline def setOnDropEnter(value: /* e */ DroppableCollectionEnterEvent => Unit): Self = StObject.set(x, "onDropEnter", js.Any.fromFunction1(value))
    
    inline def setOnDropEnterUndefined: Self = StObject.set(x, "onDropEnter", js.undefined)
    
    inline def setOnDropExit(value: /* e */ DroppableCollectionExitEvent => Unit): Self = StObject.set(x, "onDropExit", js.Any.fromFunction1(value))
    
    inline def setOnDropExitUndefined: Self = StObject.set(x, "onDropExit", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
  }
}
