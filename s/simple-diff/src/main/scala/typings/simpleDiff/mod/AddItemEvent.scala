package typings.simpleDiff.mod

import typings.simpleDiff.simpleDiffNumbers.`-1`
import typings.simpleDiff.simpleDiffStrings.`add-item`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddItemEvent extends Event {
  
  var curIndex: `-1` = js.native
  
  var newIndex: Double = js.native
  
  var newPath: Path = js.native
  
  var newValue: js.Any = js.native
  
  var oldIndex: `-1` = js.native
  
  var oldPath: Path = js.native
  
  var `type`: `add-item` = js.native
}
object AddItemEvent {
  
  @scala.inline
  def apply(
    curIndex: `-1`,
    newIndex: Double,
    newPath: Path,
    newValue: js.Any,
    oldIndex: `-1`,
    oldPath: Path,
    `type`: `add-item`
  ): AddItemEvent = {
    val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddItemEvent]
  }
  
  @scala.inline
  implicit class AddItemEventOps[Self <: AddItemEvent] (val x: Self) extends AnyVal {
    
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
    def setCurIndex(value: `-1`): Self = this.set("curIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPathVarargs(value: (String | Double)*): Self = this.set("newPath", js.Array(value :_*))
    
    @scala.inline
    def setNewPath(value: Path): Self = this.set("newPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: `-1`): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPathVarargs(value: (String | Double)*): Self = this.set("oldPath", js.Array(value :_*))
    
    @scala.inline
    def setOldPath(value: Path): Self = this.set("oldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `add-item`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
