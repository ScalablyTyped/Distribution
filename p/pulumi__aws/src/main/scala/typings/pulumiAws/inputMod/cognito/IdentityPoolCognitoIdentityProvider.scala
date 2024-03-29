package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityPoolCognitoIdentityProvider extends StObject {
  
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Input[Boolean]] = js.undefined
}
object IdentityPoolCognitoIdentityProvider {
  
  inline def apply(): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
  
  extension [Self <: IdentityPoolCognitoIdentityProvider](x: Self) {
    
    inline def setClientId(value: Input[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setProviderName(value: Input[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    inline def setServerSideTokenCheck(value: Input[Boolean]): Self = StObject.set(x, "serverSideTokenCheck", value.asInstanceOf[js.Any])
    
    inline def setServerSideTokenCheckUndefined: Self = StObject.set(x, "serverSideTokenCheck", js.undefined)
  }
}
