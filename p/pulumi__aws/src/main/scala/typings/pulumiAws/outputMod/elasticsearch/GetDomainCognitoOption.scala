package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainCognitoOption extends js.Object {
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  /**
    * The Cognito Identity pool used by the domain.
    */
  var identityPoolId: String = js.native
  /**
    * The IAM Role with the AmazonESCognitoAccess policy attached.
    */
  var roleArn: String = js.native
  /**
    * The Cognito User pool used by the domain.
    */
  var userPoolId: String = js.native
}

object GetDomainCognitoOption {
  @scala.inline
  def apply(enabled: Boolean, identityPoolId: String, roleArn: String, userPoolId: String): GetDomainCognitoOption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainCognitoOption]
  }
  @scala.inline
  implicit class GetDomainCognitoOptionOps[Self <: GetDomainCognitoOption] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: String): Self = this.set("identityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: String): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
  }
  
}

