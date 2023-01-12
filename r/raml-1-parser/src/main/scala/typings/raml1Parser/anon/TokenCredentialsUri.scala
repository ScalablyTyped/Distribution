package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenCredentialsUri extends StObject {
  
  /**
    * The URI of the Resource Owner Authorization endpoint as defined
    * in RFC5849 Section 2.2
    */
  var authorizationUri: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The URI of the Temporary Credential Request endpoint as defined
    * in RFC5849 Section 2.1
    */
  var requestTokenUri: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The URI of the Token Request endpoint as defined in RFC5849 Section 2.3
    */
  var tokenCredentialsUri: js.UndefOr[java.lang.String] = js.undefined
}
object TokenCredentialsUri {
  
  inline def apply(): TokenCredentialsUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenCredentialsUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenCredentialsUri] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationUri(value: java.lang.String): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUriUndefined: Self = StObject.set(x, "authorizationUri", js.undefined)
    
    inline def setRequestTokenUri(value: java.lang.String): Self = StObject.set(x, "requestTokenUri", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUriUndefined: Self = StObject.set(x, "requestTokenUri", js.undefined)
    
    inline def setTokenCredentialsUri(value: java.lang.String): Self = StObject.set(x, "tokenCredentialsUri", value.asInstanceOf[js.Any])
    
    inline def setTokenCredentialsUriUndefined: Self = StObject.set(x, "tokenCredentialsUri", js.undefined)
  }
}
