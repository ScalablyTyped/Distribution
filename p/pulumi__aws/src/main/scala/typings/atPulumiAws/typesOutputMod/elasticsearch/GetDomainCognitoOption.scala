package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainCognitoOption extends js.Object {
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  /**
    * The Cognito Identity pool used by the domain.
    */
  var identityPoolId: String
  /**
    * The IAM Role with the AmazonESCognitoAccess policy attached.
    */
  var roleArn: String
  /**
    * The Cognito User pool used by the domain.
    */
  var userPoolId: String
}

object GetDomainCognitoOption {
  @scala.inline
  def apply(enabled: Boolean, identityPoolId: String, roleArn: String, userPoolId: String): GetDomainCognitoOption = {
    val __obj = js.Dynamic.literal(enabled = enabled, identityPoolId = identityPoolId, roleArn = roleArn, userPoolId = userPoolId)
  
    __obj.asInstanceOf[GetDomainCognitoOption]
  }
}

