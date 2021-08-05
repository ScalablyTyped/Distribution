package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolLambdaConfig extends StObject {
  
  /**
    * The ARN of the lambda creating an authentication challenge.
    */
  var createAuthChallenge: js.UndefOr[String] = js.undefined
  
  /**
    * A custom Message AWS Lambda trigger.
    */
  var customMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the authentication challenge.
    */
  var defineAuthChallenge: js.UndefOr[String] = js.undefined
  
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var postAuthentication: js.UndefOr[String] = js.undefined
  
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var postConfirmation: js.UndefOr[String] = js.undefined
  
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var preAuthentication: js.UndefOr[String] = js.undefined
  
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var preSignUp: js.UndefOr[String] = js.undefined
  
  /**
    * Allow to customize identity token claims before token generation.
    */
  var preTokenGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * The user migration Lambda config type.
    */
  var userMigration: js.UndefOr[String] = js.undefined
  
  /**
    * Verifies the authentication challenge response.
    */
  var verifyAuthChallengeResponse: js.UndefOr[String] = js.undefined
}
object UserPoolLambdaConfig {
  
  inline def apply(): UserPoolLambdaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolLambdaConfig]
  }
  
  extension [Self <: UserPoolLambdaConfig](x: Self) {
    
    inline def setCreateAuthChallenge(value: String): Self = StObject.set(x, "createAuthChallenge", value.asInstanceOf[js.Any])
    
    inline def setCreateAuthChallengeUndefined: Self = StObject.set(x, "createAuthChallenge", js.undefined)
    
    inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    inline def setDefineAuthChallenge(value: String): Self = StObject.set(x, "defineAuthChallenge", value.asInstanceOf[js.Any])
    
    inline def setDefineAuthChallengeUndefined: Self = StObject.set(x, "defineAuthChallenge", js.undefined)
    
    inline def setPostAuthentication(value: String): Self = StObject.set(x, "postAuthentication", value.asInstanceOf[js.Any])
    
    inline def setPostAuthenticationUndefined: Self = StObject.set(x, "postAuthentication", js.undefined)
    
    inline def setPostConfirmation(value: String): Self = StObject.set(x, "postConfirmation", value.asInstanceOf[js.Any])
    
    inline def setPostConfirmationUndefined: Self = StObject.set(x, "postConfirmation", js.undefined)
    
    inline def setPreAuthentication(value: String): Self = StObject.set(x, "preAuthentication", value.asInstanceOf[js.Any])
    
    inline def setPreAuthenticationUndefined: Self = StObject.set(x, "preAuthentication", js.undefined)
    
    inline def setPreSignUp(value: String): Self = StObject.set(x, "preSignUp", value.asInstanceOf[js.Any])
    
    inline def setPreSignUpUndefined: Self = StObject.set(x, "preSignUp", js.undefined)
    
    inline def setPreTokenGeneration(value: String): Self = StObject.set(x, "preTokenGeneration", value.asInstanceOf[js.Any])
    
    inline def setPreTokenGenerationUndefined: Self = StObject.set(x, "preTokenGeneration", js.undefined)
    
    inline def setUserMigration(value: String): Self = StObject.set(x, "userMigration", value.asInstanceOf[js.Any])
    
    inline def setUserMigrationUndefined: Self = StObject.set(x, "userMigration", js.undefined)
    
    inline def setVerifyAuthChallengeResponse(value: String): Self = StObject.set(x, "verifyAuthChallengeResponse", value.asInstanceOf[js.Any])
    
    inline def setVerifyAuthChallengeResponseUndefined: Self = StObject.set(x, "verifyAuthChallengeResponse", js.undefined)
  }
}
