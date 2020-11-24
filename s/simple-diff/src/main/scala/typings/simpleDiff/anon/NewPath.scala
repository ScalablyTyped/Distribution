package typings.simpleDiff.anon

import typings.simpleDiff.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewPath extends js.Object {
  
  var newPath: Path = js.native
  
  var oldPath: Path = js.native
}
object NewPath {
  
  @scala.inline
  def apply(newPath: Path, oldPath: Path): NewPath = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPath]
  }
  
  @scala.inline
  implicit class NewPathOps[Self <: NewPath] (val x: Self) extends AnyVal {
    
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
    def setOldPathVarargs(value: (String | Double)*): Self = this.set("oldPath", js.Array(value :_*))
    
    @scala.inline
    def setOldPath(value: Path): Self = this.set("oldPath", value.asInstanceOf[js.Any])
  }
}
