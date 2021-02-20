package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUSER_VARIABLES_UPDATE extends StObject {
  
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
  implicit class IUSER_VARIABLES_UPDATEMutableBuilder[Self <: IUSER_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = StObject.set(x, "changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarsVarargs(value: String*): Self = StObject.set(x, "changedVars", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
