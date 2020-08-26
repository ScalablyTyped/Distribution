package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainCognitoOptions extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * ID of the Cognito Identity Pool to use
    */
  var identityPoolId: Input[String] = js.native
  /**
    * ARN of the IAM role that has the AmazonESCognitoAccess policy attached
    */
  var roleArn: Input[String] = js.native
  /**
    * ID of the Cognito User Pool to use
    */
  var userPoolId: Input[String] = js.native
}

object DomainCognitoOptions {
  @scala.inline
  def apply(identityPoolId: Input[String], roleArn: Input[String], userPoolId: Input[String]): DomainCognitoOptions = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainCognitoOptions]
  }
  @scala.inline
  implicit class DomainCognitoOptionsOps[Self <: DomainCognitoOptions] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: Input[String]): Self = this.set("identityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

