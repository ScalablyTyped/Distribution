package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionOptions extends StObject {
  
  var allowList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.undefined
  
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object AssertionOptions {
  
  inline def apply(): AssertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertionOptions]
  }
  
  extension [Self <: AssertionOptions](x: Self) {
    
    inline def setAllowList(value: js.Array[ScopedCredentialDescriptor]): Self = StObject.set(x, "allowList", value.asInstanceOf[js.Any])
    
    inline def setAllowListUndefined: Self = StObject.set(x, "allowList", js.undefined)
    
    inline def setAllowListVarargs(value: ScopedCredentialDescriptor*): Self = StObject.set(x, "allowList", js.Array(value :_*))
    
    inline def setExtensions(value: WebAuthnExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    inline def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
