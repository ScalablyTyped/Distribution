package typings.reactPlaidLink.distIndexDotumdMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Public key integrations are deprecated and should not be used.
  * https://plaid.com/docs/link/link-token-migration-guide/
  */
trait PlaidLinkOptionsWithPublicKey
  extends StObject
     with CommonPlaidLinkOptions
     with PlaidLinkOptions {
  
  var accountSubtypes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  // Displayed once a user has successfully linked their account
  var clientName: String
  
  // An array of countries to filter institutions
  var countryCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  // The Plaid API environment on which to create user accounts.
  var env: String
  
  // A local string to change the default Link display language
  var language: js.UndefOr[String] = js.undefined
  
  var linkCustomizationName: js.UndefOr[String] = js.undefined
  
  var oauthNonce: js.UndefOr[String] = js.undefined
  
  var oauthRedirectUri: js.UndefOr[String] = js.undefined
  
  var oauthStateId: js.UndefOr[String] = js.undefined
  
  var paymentToken: js.UndefOr[String] = js.undefined
  
  // The Plaid products you wish to use, an array containing some of connect,
  // auth, identity, income, transactions, assets, liabilities
  var product: js.Array[String]
  
  // The public_key associated with your account; available from
  // the Plaid dashboard (https://dashboard.plaid.com)
  var publicKey: String
  
  // Provide a public_token to initialize Link in update mode.
  var token: js.UndefOr[String] = js.undefined
  
  // Your user's associated email address - specify to enable all Auth features.
  // Note that userLegalName must also be set.
  var userEmailAddress: js.UndefOr[String] = js.undefined
  
  // Your user's legal first and last name – specify to enable all Auth features.
  // Note that userEmailAddress must also be set.
  var userLegalName: js.UndefOr[String] = js.undefined
  
  // Specify a webhook to associate with a user.
  var webhook: js.UndefOr[String] = js.undefined
}
object PlaidLinkOptionsWithPublicKey {
  
  inline def apply(
    clientName: String,
    env: String,
    onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Unit,
    product: js.Array[String],
    publicKey: String
  ): PlaidLinkOptionsWithPublicKey = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaidLinkOptionsWithPublicKey]
  }
  
  extension [Self <: PlaidLinkOptionsWithPublicKey](x: Self) {
    
    inline def setAccountSubtypes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "accountSubtypes", value.asInstanceOf[js.Any])
    
    inline def setAccountSubtypesUndefined: Self = StObject.set(x, "accountSubtypes", js.undefined)
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setCountryCodes(value: js.Array[String]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
    
    inline def setCountryCodesUndefined: Self = StObject.set(x, "countryCodes", js.undefined)
    
    inline def setCountryCodesVarargs(value: String*): Self = StObject.set(x, "countryCodes", js.Array(value*))
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLinkCustomizationName(value: String): Self = StObject.set(x, "linkCustomizationName", value.asInstanceOf[js.Any])
    
    inline def setLinkCustomizationNameUndefined: Self = StObject.set(x, "linkCustomizationName", js.undefined)
    
    inline def setOauthNonce(value: String): Self = StObject.set(x, "oauthNonce", value.asInstanceOf[js.Any])
    
    inline def setOauthNonceUndefined: Self = StObject.set(x, "oauthNonce", js.undefined)
    
    inline def setOauthRedirectUri(value: String): Self = StObject.set(x, "oauthRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setOauthRedirectUriUndefined: Self = StObject.set(x, "oauthRedirectUri", js.undefined)
    
    inline def setOauthStateId(value: String): Self = StObject.set(x, "oauthStateId", value.asInstanceOf[js.Any])
    
    inline def setOauthStateIdUndefined: Self = StObject.set(x, "oauthStateId", js.undefined)
    
    inline def setPaymentToken(value: String): Self = StObject.set(x, "paymentToken", value.asInstanceOf[js.Any])
    
    inline def setPaymentTokenUndefined: Self = StObject.set(x, "paymentToken", js.undefined)
    
    inline def setProduct(value: js.Array[String]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductVarargs(value: String*): Self = StObject.set(x, "product", js.Array(value*))
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
    
    inline def setUserLegalName(value: String): Self = StObject.set(x, "userLegalName", value.asInstanceOf[js.Any])
    
    inline def setUserLegalNameUndefined: Self = StObject.set(x, "userLegalName", js.undefined)
    
    inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
