package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoutParams extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var federated: Boolean
  
  var returnTo: js.UndefOr[String] = js.undefined
}
object LogoutParams {
  
  inline def apply(federated: Boolean): LogoutParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutParams]
  }
  
  extension [Self <: LogoutParams](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    inline def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
    
    inline def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
  }
}
