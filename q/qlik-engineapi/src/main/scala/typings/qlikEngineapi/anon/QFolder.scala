package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QFolder extends js.Object {
  
  var qFolder: String = js.native
}
object QFolder {
  
  @scala.inline
  def apply(qFolder: String): QFolder = {
    val __obj = js.Dynamic.literal(qFolder = qFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFolder]
  }
  
  @scala.inline
  implicit class QFolderOps[Self <: QFolder] (val x: Self) extends AnyVal {
    
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
    def setQFolder(value: String): Self = this.set("qFolder", value.asInstanceOf[js.Any])
  }
}
