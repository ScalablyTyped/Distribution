package typings.request.mod

import typings.request.requestBooleans.`true`
import typings.request.requestStrings.body
import typings.request.requestStrings.header
import typings.request.requestStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthOptions extends StObject {
  
  var body_hash: js.UndefOr[`true` | String] = js.native
  
  var callback: js.UndefOr[String] = js.native
  
  var consumer_key: js.UndefOr[String] = js.native
  
  var consumer_secret: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var token_secret: js.UndefOr[String] = js.native
  
  var transport_method: js.UndefOr[body | header | query] = js.native
  
  var verifier: js.UndefOr[String] = js.native
}
object OAuthOptions {
  
  @scala.inline
  def apply(): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthOptions]
  }
  
  @scala.inline
  implicit class OAuthOptionsMutableBuilder[Self <: OAuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody_hash(value: `true` | String): Self = StObject.set(x, "body_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_hashUndefined: Self = StObject.set(x, "body_hash", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumer_keyUndefined: Self = StObject.set(x, "consumer_key", js.undefined)
    
    @scala.inline
    def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumer_secretUndefined: Self = StObject.set(x, "consumer_secret", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setToken_secret(value: String): Self = StObject.set(x, "token_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_secretUndefined: Self = StObject.set(x, "token_secret", js.undefined)
    
    @scala.inline
    def setTransport_method(value: body | header | query): Self = StObject.set(x, "transport_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport_methodUndefined: Self = StObject.set(x, "transport_method", js.undefined)
    
    @scala.inline
    def setVerifier(value: String): Self = StObject.set(x, "verifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifierUndefined: Self = StObject.set(x, "verifier", js.undefined)
  }
}
