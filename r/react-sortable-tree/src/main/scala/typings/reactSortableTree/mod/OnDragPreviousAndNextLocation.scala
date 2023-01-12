package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDragPreviousAndNextLocation[T]
  extends StObject
     with PreviousAndNextLocation {
  
  var nextParent: TreeItem[T] | Null
  
  var prevParent: TreeItem[T] | Null
}
object OnDragPreviousAndNextLocation {
  
  inline def apply[T](
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): OnDragPreviousAndNextLocation[T] = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any], nextParent = null, prevParent = null)
    __obj.asInstanceOf[OnDragPreviousAndNextLocation[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDragPreviousAndNextLocation[?], T] (val x: Self & OnDragPreviousAndNextLocation[T]) extends AnyVal {
    
    inline def setNextParent(value: TreeItem[T]): Self = StObject.set(x, "nextParent", value.asInstanceOf[js.Any])
    
    inline def setNextParentNull: Self = StObject.set(x, "nextParent", null)
    
    inline def setPrevParent(value: TreeItem[T]): Self = StObject.set(x, "prevParent", value.asInstanceOf[js.Any])
    
    inline def setPrevParentNull: Self = StObject.set(x, "prevParent", null)
  }
}
