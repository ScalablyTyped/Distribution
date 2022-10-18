package typings.reactPlaidLink.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Either the publicKey or the token field must be configured. The publicKey
// is deprecated so prefer to initialize Link with a Link Token instead.
/* Rewritten from type alias, can be one of: 
  - typings.reactPlaidLink.distIndexDotesmMod.PlaidLinkOptionsWithPublicKey
  - typings.reactPlaidLink.distIndexDotesmMod.PlaidLinkOptionsWithLinkToken
*/
trait PlaidLinkOptions extends StObject
object PlaidLinkOptions {
  
  inline def PlaidLinkOptionsWithLinkToken(onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Unit): typings.reactPlaidLink.distIndexDotesmMod.PlaidLinkOptionsWithLinkToken = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction2(onSuccess), token = null)
    __obj.asInstanceOf[typings.reactPlaidLink.distIndexDotesmMod.PlaidLinkOptionsWithLinkToken]
  }
  
  inline def PlaidLinkOptionsWithPublicKey(
    clientName: String,
    env: String,
    onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Unit,
    product: js.Array[String],
    publicKey: String
  ): typings.reactPlaidLink.distIndexDotesmMod.PlaidLinkOptionsWithPublicKey = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactPlaidLink.distIndexDotesmMod.PlaidLinkOptionsWithPublicKey]
  }
}
