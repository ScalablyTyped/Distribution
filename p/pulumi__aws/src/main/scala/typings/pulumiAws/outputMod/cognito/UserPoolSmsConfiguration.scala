package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSmsConfiguration extends js.Object {
  /**
    * The external ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
    */
  var externalId: String = js.native
  /**
    * The ARN of the Amazon SNS caller. This is usually the IAM role that you've given Cognito permission to assume.
    */
  var snsCallerArn: String = js.native
}

object UserPoolSmsConfiguration {
  @scala.inline
  def apply(externalId: String, snsCallerArn: String): UserPoolSmsConfiguration = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], snsCallerArn = snsCallerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSmsConfiguration]
  }
  @scala.inline
  implicit class UserPoolSmsConfigurationOps[Self <: UserPoolSmsConfiguration] (val x: Self) extends AnyVal {
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
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnsCallerArn(value: String): Self = this.set("snsCallerArn", value.asInstanceOf[js.Any])
  }
  
}

