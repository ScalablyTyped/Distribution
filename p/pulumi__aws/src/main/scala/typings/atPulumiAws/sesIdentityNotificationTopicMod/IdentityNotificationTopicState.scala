package typings.atPulumiAws.sesIdentityNotificationTopicMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityNotificationTopicState extends js.Object {
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: js.UndefOr[Input[String]] = js.native
  /**
    * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
    */
  val includeOriginalHeaders: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: js.UndefOr[Input[String]] = js.native
}

object IdentityNotificationTopicState {
  @scala.inline
  def apply(
    identity: Input[String] = null,
    includeOriginalHeaders: Input[Boolean] = null,
    notificationType: Input[String] = null,
    topicArn: Input[String] = null
  ): IdentityNotificationTopicState = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (includeOriginalHeaders != null) __obj.updateDynamic("includeOriginalHeaders")(includeOriginalHeaders.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationTopicState]
  }
}

