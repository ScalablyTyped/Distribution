package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateAuthChallengeCustomMessage extends js.Object {
  var createAuthChallenge: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var customMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var defineAuthChallenge: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var postAuthentication: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var postConfirmation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var preAuthentication: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var preSignUp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var preTokenGeneration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var userMigration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var verifyAuthChallengeResponse: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CreateAuthChallengeCustomMessage {
  @scala.inline
  def apply(
    createAuthChallenge: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defineAuthChallenge: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    postAuthentication: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    postConfirmation: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    preAuthentication: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    preSignUp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    preTokenGeneration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    userMigration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    verifyAuthChallengeResponse: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

