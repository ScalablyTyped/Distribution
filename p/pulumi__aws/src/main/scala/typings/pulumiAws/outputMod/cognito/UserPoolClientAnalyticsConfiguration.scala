package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolClientAnalyticsConfiguration extends js.Object {
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var applicationId: String = js.native
  /**
    * An ID for the Analytics Configuration.
    */
  var externalId: String = js.native
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var roleArn: String = js.native
  /**
    * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var userDataShared: js.UndefOr[Boolean] = js.native
}

object UserPoolClientAnalyticsConfiguration {
  @scala.inline
  def apply(
    applicationId: String,
    externalId: String,
    roleArn: String,
    userDataShared: js.UndefOr[Boolean] = js.undefined
  ): UserPoolClientAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(userDataShared)) __obj.updateDynamic("userDataShared")(userDataShared.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientAnalyticsConfiguration]
  }
}

