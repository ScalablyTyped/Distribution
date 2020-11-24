package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveData extends js.Object {
  
  var saveData: Boolean | Null = js.native
  
  var unsupported: Boolean = js.native
}
object SaveData {
  
  @scala.inline
  def apply(unsupported: Boolean): SaveData = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveData]
  }
  
  @scala.inline
  implicit class SaveDataOps[Self <: SaveData] (val x: Self) extends AnyVal {
    
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
    def setUnsupported(value: Boolean): Self = this.set("unsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveData(value: Boolean): Self = this.set("saveData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveDataNull: Self = this.set("saveData", null)
  }
}
