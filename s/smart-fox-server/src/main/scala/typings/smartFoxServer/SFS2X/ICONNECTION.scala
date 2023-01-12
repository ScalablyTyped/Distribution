package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICONNECTION extends StObject {
  
  var success: Boolean
}
object ICONNECTION {
  
  inline def apply(success: Boolean): ICONNECTION = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICONNECTION] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
