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
  def apply(
    applicationId: Input[String],
    externalId: Input[String],
    roleArn: Input[String],
    userDataShared: Input[Boolean] = null
  ): UserPoolClientAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (userDataShared != null) __obj.updateDynamic("userDataShared")(userDataShared.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientAnalyticsConfiguration]
  }
}

