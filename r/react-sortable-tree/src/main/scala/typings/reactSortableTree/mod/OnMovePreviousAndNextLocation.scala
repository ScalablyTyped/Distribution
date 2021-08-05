package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMovePreviousAndNextLocation
  extends StObject
     with PreviousAndNextLocation {
  
  var nextParentNode: TreeItem | Null
}
object OnMovePreviousAndNextLocation {
  
  inline def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): OnMovePreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any], nextParentNode = null)
    __obj.asInstanceOf[OnMovePreviousAndNextLocation]
  }
  
  extension [Self <: OnMovePreviousAndNextLocation](x: Self) {
    
    inline def setNextParentNode(value: TreeItem): Self = StObject.set(x, "nextParentNode", value.asInstanceOf[js.Any])
    
    inline def setNextParentNodeNull: Self = StObject.set(x, "nextParentNode", null)
  }
}
