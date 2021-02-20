package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILOGIN extends StObject {
  
  var data: js.Object = js.native
  
  var user: SFSUser = js.native
}
object ILOGIN {
  
  @scala.inline
  def apply(data: js.Object, user: SFSUser): ILOGIN = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILOGIN]
  }
  
  @scala.inline
  implicit class ILOGINMutableBuilder[Self <: ILOGIN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
