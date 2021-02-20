package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISOCKET_ERROR extends StObject {
  
  var errorMessage: String = js.native
}
object ISOCKET_ERROR {
  
  @scala.inline
  def apply(errorMessage: String): ISOCKET_ERROR = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISOCKET_ERROR]
  }
  
  @scala.inline
  implicit class ISOCKET_ERRORMutableBuilder[Self <: ISOCKET_ERROR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
