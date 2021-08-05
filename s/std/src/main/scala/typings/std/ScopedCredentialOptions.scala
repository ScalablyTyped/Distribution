package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedCredentialOptions extends StObject {
  
  var excludeList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.undefined
  
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object ScopedCredentialOptions {
  
  inline def apply(): ScopedCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedCredentialOptions]
  }
  
  extension [Self <: ScopedCredentialOptions](x: Self) {
    
    inline def setExcludeList(value: js.Array[ScopedCredentialDescriptor]): Self = StObject.set(x, "excludeList", value.asInstanceOf[js.Any])
    
    inline def setExcludeListUndefined: Self = StObject.set(x, "excludeList", js.undefined)
    
    inline def setExcludeListVarargs(value: ScopedCredentialDescriptor*): Self = StObject.set(x, "excludeList", js.Array(value :_*))
    
    inline def setExtensions(value: WebAuthnExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    inline def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
