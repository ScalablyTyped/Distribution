package typings
package atPulumiAwsLib.sesIdentityNotificationTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityNotificationTopicState extends js.Object {
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
    */
  val includeOriginalHeaders: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object IdentityNotificationTopicState {
  @scala.inline
  def apply(
    identity: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    includeOriginalHeaders: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IdentityNotificationTopicState = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (includeOriginalHeaders != null) __obj.updateDynamic("includeOriginalHeaders")(includeOriginalHeaders.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationTopicState]
  }
}

