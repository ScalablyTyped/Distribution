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
  
  @scala.inline
  def apply(federated: Boolean): LogoutParams = {
    val __obj = js.Dynamic.literal(federated = federated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoutParams]
  }
  
  @scala.inline
  implicit class LogoutParamsMutableBuilder[Self <: LogoutParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
  }
}
