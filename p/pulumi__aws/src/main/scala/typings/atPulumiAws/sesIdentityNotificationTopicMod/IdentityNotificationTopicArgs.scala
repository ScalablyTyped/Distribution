package typings.atPulumiAws.sesIdentityNotificationTopicMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityNotificationTopicArgs extends js.Object {
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: Input[String]
  /**
    * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
    */
  val includeOriginalHeaders: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: Input[String]
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: js.UndefOr[Input[String]] = js.undefined
}

object IdentityNotificationTopicArgs {
  @scala.inline
  def apply(
    identity: Input[String],
    notificationType: Input[String],
    includeOriginalHeaders: Input[Boolean] = null,
    topicArn: Input[String] = null
  ): IdentityNotificationTopicArgs = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any])
    if (includeOriginalHeaders != null) __obj.updateDynamic("includeOriginalHeaders")(includeOriginalHeaders.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationTopicArgs]
  }
}

