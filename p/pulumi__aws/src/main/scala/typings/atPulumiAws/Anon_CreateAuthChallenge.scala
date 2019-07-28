package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateAuthChallenge extends js.Object {
  var createAuthChallenge: js.UndefOr[String] = js.undefined
  var customMessage: js.UndefOr[String] = js.undefined
  var defineAuthChallenge: js.UndefOr[String] = js.undefined
  var postAuthentication: js.UndefOr[String] = js.undefined
  var postConfirmation: js.UndefOr[String] = js.undefined
  var preAuthentication: js.UndefOr[String] = js.undefined
  var preSignUp: js.UndefOr[String] = js.undefined
  var preTokenGeneration: js.UndefOr[String] = js.undefined
  var userMigration: js.UndefOr[String] = js.undefined
  var verifyAuthChallengeResponse: js.UndefOr[String] = js.undefined
}

object Anon_CreateAuthChallenge {
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
  ): Anon_CreateAuthChallenge = {
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
    __obj.asInstanceOf[Anon_CreateAuthChallenge]
  }
}

