package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBUDDY_VARIABLES_UPDATE extends js.Object {
  
  var buddy: SFSBuddy = js.native
  
  var changedVars: js.Array[String] = js.native
  
  var isItMe: Boolean = js.native
}
object IBUDDY_VARIABLES_UPDATE {
  
  @scala.inline
  def apply(buddy: SFSBuddy, changedVars: js.Array[String], isItMe: Boolean): IBUDDY_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], changedVars = changedVars.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit class IBUDDY_VARIABLES_UPDATEOps[Self <: IBUDDY_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
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
    def setBuddy(value: SFSBuddy): Self = this.set("buddy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarsVarargs(value: String*): Self = this.set("changedVars", js.Array(value :_*))
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = this.set("changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsItMe(value: Boolean): Self = this.set("isItMe", value.asInstanceOf[js.Any])
  }
}
