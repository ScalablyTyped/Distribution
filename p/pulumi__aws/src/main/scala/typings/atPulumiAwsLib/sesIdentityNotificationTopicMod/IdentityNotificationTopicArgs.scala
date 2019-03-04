package typings
package atPulumiAwsLib.sesIdentityNotificationTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityNotificationTopicArgs extends js.Object {
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object IdentityNotificationTopicArgs {
  @scala.inline
  def apply(
    identity: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IdentityNotificationTopicArgs = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationTopicArgs]
  }
}

