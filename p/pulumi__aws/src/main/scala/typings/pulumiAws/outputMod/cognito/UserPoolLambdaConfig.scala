package typings.pulumiAws.outputMod.cognito

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
  def apply(): UserPoolLambdaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolLambdaConfig]
  }
  @scala.inline
  implicit class UserPoolLambdaConfigOps[Self <: UserPoolLambdaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateAuthChallenge(value: String): Self = this.set("createAuthChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateAuthChallenge: Self = this.set("createAuthChallenge", js.undefined)
    @scala.inline
    def setCustomMessage(value: String): Self = this.set("customMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMessage: Self = this.set("customMessage", js.undefined)
    @scala.inline
    def setDefineAuthChallenge(value: String): Self = this.set("defineAuthChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefineAuthChallenge: Self = this.set("defineAuthChallenge", js.undefined)
    @scala.inline
    def setPostAuthentication(value: String): Self = this.set("postAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostAuthentication: Self = this.set("postAuthentication", js.undefined)
    @scala.inline
    def setPostConfirmation(value: String): Self = this.set("postConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostConfirmation: Self = this.set("postConfirmation", js.undefined)
    @scala.inline
    def setPreAuthentication(value: String): Self = this.set("preAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreAuthentication: Self = this.set("preAuthentication", js.undefined)
    @scala.inline
    def setPreSignUp(value: String): Self = this.set("preSignUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreSignUp: Self = this.set("preSignUp", js.undefined)
    @scala.inline
    def setPreTokenGeneration(value: String): Self = this.set("preTokenGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreTokenGeneration: Self = this.set("preTokenGeneration", js.undefined)
    @scala.inline
    def setUserMigration(value: String): Self = this.set("userMigration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMigration: Self = this.set("userMigration", js.undefined)
    @scala.inline
    def setVerifyAuthChallengeResponse(value: String): Self = this.set("verifyAuthChallengeResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyAuthChallengeResponse: Self = this.set("verifyAuthChallengeResponse", js.undefined)
  }
  
}

