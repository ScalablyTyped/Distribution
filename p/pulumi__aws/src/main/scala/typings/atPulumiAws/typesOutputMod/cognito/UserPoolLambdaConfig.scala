package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolLambdaConfig extends js.Object {
  /**
    * The ARN of the lambda creating an authentication challenge.
    */
  var createAuthChallenge: js.UndefOr[String] = js.native
  /**
    * A custom Message AWS Lambda trigger.
    */
  var customMessage: js.UndefOr[String] = js.native
  /**
    * Defines the authentication challenge.
    */
  var defineAuthChallenge: js.UndefOr[String] = js.native
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var postAuthentication: js.UndefOr[String] = js.native
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var postConfirmation: js.UndefOr[String] = js.native
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var preAuthentication: js.UndefOr[String] = js.native
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var preSignUp: js.UndefOr[String] = js.native
  /**
    * Allow to customize identity token claims before token generation.
    */
  var preTokenGeneration: js.UndefOr[String] = js.native
  /**
    * The user migration Lambda config type.
    */
  var userMigration: js.UndefOr[String] = js.native
  /**
    * Verifies the authentication challenge response.
    */
  var verifyAuthChallengeResponse: js.UndefOr[String] = js.native
}

object UserPoolLambdaConfig {
  @scala.inline
  def apply(
    createAuthChallenge: String = null,
    customMessage: String = null,
    defineAuthChallenge: String = null,
    postAuthentication: String = null,
    postConfirmation: String = null,
    preAuthentication: String = null,
    preSignUp: String = null,
    preTokenGeneration: String = null,
    userMigration: String = null,
    verifyAuthChallengeResponse: String = null
  ): UserPoolLambdaConfig = {
    val __obj = js.Dynamic.literal()
    if (createAuthChallenge != null) __obj.updateDynamic("createAuthChallenge")(createAuthChallenge.asInstanceOf[js.Any])
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage.asInstanceOf[js.Any])
    if (defineAuthChallenge != null) __obj.updateDynamic("defineAuthChallenge")(defineAuthChallenge.asInstanceOf[js.Any])
    if (postAuthentication != null) __obj.updateDynamic("postAuthentication")(postAuthentication.asInstanceOf[js.Any])
    if (postConfirmation != null) __obj.updateDynamic("postConfirmation")(postConfirmation.asInstanceOf[js.Any])
    if (preAuthentication != null) __obj.updateDynamic("preAuthentication")(preAuthentication.asInstanceOf[js.Any])
    if (preSignUp != null) __obj.updateDynamic("preSignUp")(preSignUp.asInstanceOf[js.Any])
    if (preTokenGeneration != null) __obj.updateDynamic("preTokenGeneration")(preTokenGeneration.asInstanceOf[js.Any])
    if (userMigration != null) __obj.updateDynamic("userMigration")(userMigration.asInstanceOf[js.Any])
    if (verifyAuthChallengeResponse != null) __obj.updateDynamic("verifyAuthChallengeResponse")(verifyAuthChallengeResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolLambdaConfig]
  }
}

