package typings.raml1Parser.spec10SecurityMod

import typings.raml1Parser.spec10CommonMod.Annotable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth10SecuritySettings10
  extends StObject
     with Annotable {
  
  /**
    * The URI of the Resource Owner Authorization endpoint
    * as defined in RFC5849 Section 2.2
    */
  var authorizationUri: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the Temporary Credential Request endpoint
    * as defined in RFC5849 Section 2.1
    */
  var requestTokenUri: js.UndefOr[String] = js.undefined
  
  /**
    * List of the signature methods used by the server.
    * Available methods: HMAC-SHA1, RSA-SHA1, PLAINTEXT
    */
  var signatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URI of the Token Request endpoint as defined in RFC5849 Section 2.3
    */
  var tokenCredentialsUri: js.UndefOr[String] = js.undefined
}
object OAuth10SecuritySettings10 {
  
  inline def apply(): OAuth10SecuritySettings10 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth10SecuritySettings10]
  }
  
  extension [Self <: OAuth10SecuritySettings10](x: Self) {
    
    inline def setAuthorizationUri(value: String): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUriUndefined: Self = StObject.set(x, "authorizationUri", js.undefined)
    
    inline def setRequestTokenUri(value: String): Self = StObject.set(x, "requestTokenUri", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUriUndefined: Self = StObject.set(x, "requestTokenUri", js.undefined)
    
    inline def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value*))
    
    inline def setTokenCredentialsUri(value: String): Self = StObject.set(x, "tokenCredentialsUri", value.asInstanceOf[js.Any])
    
    inline def setTokenCredentialsUriUndefined: Self = StObject.set(x, "tokenCredentialsUri", js.undefined)
  }
}
