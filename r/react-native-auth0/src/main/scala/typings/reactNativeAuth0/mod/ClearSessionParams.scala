package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSessionParams extends StObject {
  
  var customScheme: js.UndefOr[String] = js.undefined
  
  var federated: js.UndefOr[Boolean] = js.undefined
}
object ClearSessionParams {
  
  inline def apply(): ClearSessionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearSessionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearSessionParams] (val x: Self) extends AnyVal {
    
    inline def setCustomScheme(value: String): Self = StObject.set(x, "customScheme", value.asInstanceOf[js.Any])
    
    inline def setCustomSchemeUndefined: Self = StObject.set(x, "customScheme", js.undefined)
    
    inline def setFederated(value: Boolean): Self = StObject.set(x, "federated", value.asInstanceOf[js.Any])
    
    inline def setFederatedUndefined: Self = StObject.set(x, "federated", js.undefined)
  }
}
