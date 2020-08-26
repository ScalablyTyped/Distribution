package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolClientAnalyticsConfiguration extends js.Object {
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var applicationId: Input[String] = js.native
  /**
    * An ID for the Analytics Configuration.
    */
  var externalId: Input[String] = js.native
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var roleArn: Input[String] = js.native
  /**
    * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var userDataShared: js.UndefOr[Input[Boolean]] = js.native
}

object UserPoolClientAnalyticsConfiguration {
  @scala.inline
  def apply(applicationId: Input[String], externalId: Input[String], roleArn: Input[String]): UserPoolClientAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientAnalyticsConfiguration]
  }
  @scala.inline
  implicit class UserPoolClientAnalyticsConfigurationOps[Self <: UserPoolClientAnalyticsConfiguration] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalId(value: Input[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserDataShared(value: Input[Boolean]): Self = this.set("userDataShared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDataShared: Self = this.set("userDataShared", js.undefined)
  }
  
}

