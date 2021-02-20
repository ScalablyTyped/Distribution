package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientData extends StObject {
  
  var challenge: java.lang.String = js.native
  
  var extensions: js.UndefOr[WebAuthnExtensions] = js.native
  
  var hashAlg: java.lang.String | Algorithm = js.native
  
  var origin: java.lang.String = js.native
  
  var rpId: java.lang.String = js.native
  
  var tokenBinding: js.UndefOr[java.lang.String] = js.native
}
object ClientData {
  
  @scala.inline
  def apply(
    challenge: java.lang.String,
    hashAlg: java.lang.String | Algorithm,
    origin: java.lang.String,
    rpId: java.lang.String
  ): ClientData = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rpId = rpId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit class ClientDataMutableBuilder[Self <: ClientData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallenge(value: java.lang.String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: WebAuthnExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setHashAlg(value: java.lang.String | Algorithm): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenBinding(value: java.lang.String): Self = StObject.set(x, "tokenBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenBindingUndefined: Self = StObject.set(x, "tokenBinding", js.undefined)
  }
}
