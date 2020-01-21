package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainCognitoOptions extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID of the Cognito Identity Pool to use
    */
  var identityPoolId: String = js.native
  /**
    * ARN of the IAM role that has the AmazonESCognitoAccess policy attached
    */
  var roleArn: String = js.native
  /**
    * ID of the Cognito User Pool to use
    */
  var userPoolId: String = js.native
}

object DomainCognitoOptions {
  @scala.inline
  def apply(
    identityPoolId: String,
    roleArn: String,
    userPoolId: String,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): DomainCognitoOptions = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainCognitoOptions]
  }
}

