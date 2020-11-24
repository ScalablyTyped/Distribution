package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUSER_VARIABLES_UPDATE extends js.Object {
  
  var changedVars: js.Array[String] = js.native
  
  var user: SFSUser = js.native
}
object IUSER_VARIABLES_UPDATE {
  
  @scala.inline
  def apply(changedVars: js.Array[String], user: SFSUser): IUSER_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit class IUSER_VARIABLES_UPDATEOps[Self <: IUSER_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
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
    def setChangedVarsVarargs(value: String*): Self = this.set("changedVars", js.Array(value :_*))
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = this.set("changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SFSUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
