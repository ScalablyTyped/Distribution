package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDragPreviousAndNextLocation extends PreviousAndNextLocation {
  
  var nextParent: TreeItem | Null = js.native
  
  var prevParent: TreeItem | Null = js.native
}
object OnDragPreviousAndNextLocation {
  
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): OnDragPreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragPreviousAndNextLocation]
  }
  
  @scala.inline
  implicit class OnDragPreviousAndNextLocationOps[Self <: OnDragPreviousAndNextLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextParent(value: TreeItem): Self = this.set("nextParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextParentNull: Self = this.set("nextParent", null)
    
    @scala.inline
    def setPrevParent(value: TreeItem): Self = this.set("prevParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevParentNull: Self = this.set("prevParent", null)
  }
}
