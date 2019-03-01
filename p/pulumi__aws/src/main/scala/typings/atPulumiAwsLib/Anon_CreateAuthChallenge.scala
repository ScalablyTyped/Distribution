package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateAuthChallenge extends js.Object {
  var createAuthChallenge: js.UndefOr[java.lang.String] = js.undefined
  var customMessage: js.UndefOr[java.lang.String] = js.undefined
  var defineAuthChallenge: js.UndefOr[java.lang.String] = js.undefined
  var postAuthentication: js.UndefOr[java.lang.String] = js.undefined
  var postConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var preAuthentication: js.UndefOr[java.lang.String] = js.undefined
  var preSignUp: js.UndefOr[java.lang.String] = js.undefined
  var preTokenGeneration: js.UndefOr[java.lang.String] = js.undefined
  var userMigration: js.UndefOr[java.lang.String] = js.undefined
  var verifyAuthChallengeResponse: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CreateAuthChallenge {
  @scala.inline
  def apply(
    createAuthChallenge: java.lang.String = null,
    customMessage: java.lang.String = null,
    defineAuthChallenge: java.lang.String = null,
    postAuthentication: java.lang.String = null,
    postConfirmation: java.lang.String = null,
    preAuthentication: java.lang.String = null,
    preSignUp: java.lang.String = null,
    preTokenGeneration: java.lang.String = null,
    userMigration: java.lang.String = null,
    verifyAuthChallengeResponse: java.lang.String = null
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

