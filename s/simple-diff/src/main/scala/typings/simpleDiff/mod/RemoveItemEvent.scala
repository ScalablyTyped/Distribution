package typings.simpleDiff.mod

import typings.simpleDiff.simpleDiffNumbers.`-1`
import typings.simpleDiff.simpleDiffStrings.`remove-item`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveItemEvent extends Event {
  
  var curIndex: Double = js.native
  
  var newIndex: `-1` = js.native
  
  var newPath: Path = js.native
  
  var oldIndex: Double = js.native
  
  var oldPath: Path = js.native
  
  var oldValue: js.Any = js.native
  
  var `type`: `remove-item` = js.native
}
object RemoveItemEvent {
  
  @scala.inline
  def apply(
    curIndex: Double,
    newIndex: `-1`,
    newPath: Path,
    oldIndex: Double,
    oldPath: Path,
    oldValue: js.Any,
    `type`: `remove-item`
  ): RemoveItemEvent = {
    val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveItemEvent]
  }
  
  @scala.inline
  implicit class RemoveItemEventOps[Self <: RemoveItemEvent] (val x: Self) extends AnyVal {
    
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
    def setCurIndex(value: Double): Self = this.set("curIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: `-1`): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPathVarargs(value: (String | Double)*): Self = this.set("newPath", js.Array(value :_*))
    
    @scala.inline
    def setNewPath(value: Path): Self = this.set("newPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPathVarargs(value: (String | Double)*): Self = this.set("oldPath", js.Array(value :_*))
    
    @scala.inline
    def setOldPath(value: Path): Self = this.set("oldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `remove-item`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
