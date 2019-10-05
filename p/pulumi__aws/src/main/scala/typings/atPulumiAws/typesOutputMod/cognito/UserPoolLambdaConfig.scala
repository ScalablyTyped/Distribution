package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolLambdaConfig extends js.Object {
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
    if (createAuthChallenge != null) __obj.updateDynamic("createAuthChallenge")(createAuthChallenge)
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (defineAuthChallenge != null) __obj.updateDynamic("defineAuthChallenge")(defineAuthChallenge)
    if (postAuthentication != null) __obj.updateDynamic("postAuthentication")(postAuthentication)
    if (postConfirmation != null) __obj.updateDynamic("postConfirmation")(postConfirmation)
    if (preAuthentication != null) __obj.updateDynamic("preAuthentication")(preAuthentication)
    if (preSignUp != null) __obj.updateDynamic("preSignUp")(preSignUp)
    if (preTokenGeneration != null) __obj.updateDynamic("preTokenGeneration")(preTokenGeneration)
    if (userMigration != null) __obj.updateDynamic("userMigration")(userMigration)
    if (verifyAuthChallengeResponse != null) __obj.updateDynamic("verifyAuthChallengeResponse")(verifyAuthChallengeResponse)
    __obj.asInstanceOf[UserPoolLambdaConfig]
  }
}

