package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolSmsConfiguration extends js.Object {
  /**
    * The external ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
    */
  var externalId: String
  /**
    * The ARN of the Amazon SNS caller. This is usually the IAM role that you've given Cognito permission to assume.
    */
  var snsCallerArn: String
}

object UserPoolSmsConfiguration {
  @scala.inline
  def apply(externalId: String, snsCallerArn: String): UserPoolSmsConfiguration = {
    val __obj = js.Dynamic.literal(externalId = externalId, snsCallerArn = snsCallerArn)
  
    __obj.asInstanceOf[UserPoolSmsConfiguration]
  }
}

