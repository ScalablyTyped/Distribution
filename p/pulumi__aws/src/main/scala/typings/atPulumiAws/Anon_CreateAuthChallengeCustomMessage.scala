package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateAuthChallengeCustomMessage extends js.Object {
  var createAuthChallenge: js.UndefOr[Input[String]] = js.undefined
  var customMessage: js.UndefOr[Input[String]] = js.undefined
  var defineAuthChallenge: js.UndefOr[Input[String]] = js.undefined
  var postAuthentication: js.UndefOr[Input[String]] = js.undefined
  var postConfirmation: js.UndefOr[Input[String]] = js.undefined
  var preAuthentication: js.UndefOr[Input[String]] = js.undefined
  var preSignUp: js.UndefOr[Input[String]] = js.undefined
  var preTokenGeneration: js.UndefOr[Input[String]] = js.undefined
  var userMigration: js.UndefOr[Input[String]] = js.undefined
  var verifyAuthChallengeResponse: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CreateAuthChallengeCustomMessage {
  @scala.inline
  def apply(
    createAuthChallenge: Input[String] = null,
    customMessage: Input[String] = null,
    defineAuthChallenge: Input[String] = null,
    postAuthentication: Input[String] = null,
    postConfirmation: Input[String] = null,
    preAuthentication: Input[String] = null,
    preSignUp: Input[String] = null,
    preTokenGeneration: Input[String] = null,
    userMigration: Input[String] = null,
    verifyAuthChallengeResponse: Input[String] = null
  ): Anon_CreateAuthChallengeCustomMessage = {
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
    __obj.asInstanceOf[Anon_CreateAuthChallengeCustomMessage]
  }
}

