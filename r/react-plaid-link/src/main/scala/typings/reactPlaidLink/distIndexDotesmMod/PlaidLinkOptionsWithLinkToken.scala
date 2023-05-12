package typings.reactPlaidLink.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaidLinkOptionsWithLinkToken
  extends StObject
     with CommonPlaidLinkOptions[PlaidLinkOnSuccess]
     with PlaidLinkOptions {
  
  // receivedRedirectUri is required on the second-initialization of link when using Link
  // with a redirect_uri to support OAuth flows.
  var receivedRedirectUri: js.UndefOr[String] = js.undefined
  
  // Provide a link_token associated with your account. Create one
  // using the /link/token/create endpoint.
  var token: String | Null
}
object PlaidLinkOptionsWithLinkToken {
  
  inline def apply(onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Unit): PlaidLinkOptionsWithLinkToken = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction2(onSuccess), token = null)
    __obj.asInstanceOf[PlaidLinkOptionsWithLinkToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaidLinkOptionsWithLinkToken] (val x: Self) extends AnyVal {
    
    inline def setReceivedRedirectUri(value: String): Self = StObject.set(x, "receivedRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setReceivedRedirectUriUndefined: Self = StObject.set(x, "receivedRedirectUri", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
  }
}
