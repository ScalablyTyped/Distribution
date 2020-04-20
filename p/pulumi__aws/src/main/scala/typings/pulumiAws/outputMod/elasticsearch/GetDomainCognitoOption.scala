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
}

