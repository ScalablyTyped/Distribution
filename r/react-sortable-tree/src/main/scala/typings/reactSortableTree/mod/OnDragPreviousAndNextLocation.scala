package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDragPreviousAndNextLocation
  extends StObject
     with PreviousAndNextLocation {
  
  var nextParent: TreeItem | Null
  
  var prevParent: TreeItem | Null
}
object OnDragPreviousAndNextLocation {
  
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): OnDragPreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any], nextParent = null, prevParent = null)
    __obj.asInstanceOf[OnDragPreviousAndNextLocation]
  }
  
  @scala.inline
  implicit class OnDragPreviousAndNextLocationMutableBuilder[Self <: OnDragPreviousAndNextLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextParent(value: TreeItem): Self = StObject.set(x, "nextParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextParentNull: Self = StObject.set(x, "nextParent", null)
    
    @scala.inline
    def setPrevParent(value: TreeItem): Self = StObject.set(x, "prevParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevParentNull: Self = StObject.set(x, "prevParent", null)
  }
}
