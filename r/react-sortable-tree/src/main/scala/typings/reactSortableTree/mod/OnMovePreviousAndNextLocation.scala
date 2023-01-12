package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMovePreviousAndNextLocation[T]
  extends StObject
     with PreviousAndNextLocation {
  
  var nextParentNode: TreeItem[T] | Null
}
object OnMovePreviousAndNextLocation {
  
  inline def apply[T](
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): OnMovePreviousAndNextLocation[T] = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any], nextParentNode = null)
    __obj.asInstanceOf[OnMovePreviousAndNextLocation[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnMovePreviousAndNextLocation[?], T] (val x: Self & OnMovePreviousAndNextLocation[T]) extends AnyVal {
    
    inline def setNextParentNode(value: TreeItem[T]): Self = StObject.set(x, "nextParentNode", value.asInstanceOf[js.Any])
    
    inline def setNextParentNodeNull: Self = StObject.set(x, "nextParentNode", null)
  }
}
