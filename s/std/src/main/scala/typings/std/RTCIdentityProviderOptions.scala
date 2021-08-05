package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIdentityProviderOptions extends StObject {
  
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  
  var usernameHint: js.UndefOr[java.lang.String] = js.undefined
}
object RTCIdentityProviderOptions {
  
  inline def apply(): RTCIdentityProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIdentityProviderOptions]
  }
  
  extension [Self <: RTCIdentityProviderOptions](x: Self) {
    
    inline def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    inline def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    inline def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setUsernameHint(value: java.lang.String): Self = StObject.set(x, "usernameHint", value.asInstanceOf[js.Any])
    
    inline def setUsernameHintUndefined: Self = StObject.set(x, "usernameHint", js.undefined)
  }
}
