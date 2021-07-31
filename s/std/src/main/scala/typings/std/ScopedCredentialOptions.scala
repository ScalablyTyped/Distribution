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
  
  @scala.inline
  def apply(): ScopedCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedCredentialOptions]
  }
  
  @scala.inline
  implicit class ScopedCredentialOptionsMutableBuilder[Self <: ScopedCredentialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeList(value: js.Array[ScopedCredentialDescriptor]): Self = StObject.set(x, "excludeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeListUndefined: Self = StObject.set(x, "excludeList", js.undefined)
    
    @scala.inline
    def setExcludeListVarargs(value: ScopedCredentialDescriptor*): Self = StObject.set(x, "excludeList", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: WebAuthnExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
