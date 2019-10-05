package typings.atPulumiAws.typesInputMod.elasticsearch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainCognitoOptions extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * ID of the Cognito Identity Pool to use
    */
  var identityPoolId: Input[String]
  /**
    * ARN of the IAM role that has the AmazonESCognitoAccess policy attached
    */
  var roleArn: Input[String]
  /**
    * ID of the Cognito User Pool to use
    */
  var userPoolId: Input[String]
}

object DomainCognitoOptions {
  @scala.inline
  def apply(
    identityPoolId: Input[String],
    roleArn: Input[String],
    userPoolId: Input[String],
    enabled: Input[Boolean] = null
  ): DomainCognitoOptions = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainCognitoOptions]
  }
}

