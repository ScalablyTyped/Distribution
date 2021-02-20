package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMovePreviousAndNextLocation extends PreviousAndNextLocation {
  
  var nextParentNode: TreeItem | Null = js.native
}
object OnMovePreviousAndNextLocation {
  
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): OnMovePreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMovePreviousAndNextLocation]
  }
  
  @scala.inline
  implicit class OnMovePreviousAndNextLocationMutableBuilder[Self <: OnMovePreviousAndNextLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextParentNode(value: TreeItem): Self = StObject.set(x, "nextParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextParentNodeNull: Self = StObject.set(x, "nextParentNode", null)
  }
}
