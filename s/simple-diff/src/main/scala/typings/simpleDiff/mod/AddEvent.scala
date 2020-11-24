package typings.simpleDiff.mod

import typings.simpleDiff.simpleDiffStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddEvent extends Event {
  
  var newPath: Path = js.native
  
  var newValue: js.Any = js.native
  
  var oldPath: Path = js.native
  
  var oldValue: js.UndefOr[scala.Nothing] = js.native
  
  var `type`: add = js.native
}
object AddEvent {
  
  @scala.inline
  def apply(newPath: Path, newValue: js.Any, oldPath: Path, `type`: add): AddEvent = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEvent]
  }
  
  @scala.inline
  implicit class AddEventOps[Self <: AddEvent] (val x: Self) extends AnyVal {
    
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
    def setNewPathVarargs(value: (String | Double)*): Self = this.set("newPath", js.Array(value :_*))
    
    @scala.inline
    def setNewPath(value: Path): Self = this.set("newPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPathVarargs(value: (String | Double)*): Self = this.set("oldPath", js.Array(value :_*))
    
    @scala.inline
    def setOldPath(value: Path): Self = this.set("oldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
