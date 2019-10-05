package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainCognitoOptions extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * ID of the Cognito Identity Pool to use
    */
  var identityPoolId: String
  /**
    * ARN of the IAM role that has the AmazonESCognitoAccess policy attached
    */
  var roleArn: String
  /**
    * ID of the Cognito User Pool to use
    */
  var userPoolId: String
}

object DomainCognitoOptions {
  @scala.inline
  def apply(
    identityPoolId: String,
    roleArn: String,
    userPoolId: String,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): DomainCognitoOptions = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId, roleArn = roleArn, userPoolId = userPoolId)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[DomainCognitoOptions]
  }
}

