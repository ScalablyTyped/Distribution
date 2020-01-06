package typings.atPulumiAws.autoscalingNotificationMod

import typings.atPulumiAws.autoscalingNotificationTypeMod.NotificationType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationArgs extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: Input[js.Array[Input[String]]] = js.native
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here][1]
    */
  val notifications: Input[js.Array[Input[NotificationType]]] = js.native
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: Input[String] = js.native
}

object NotificationArgs {
  @scala.inline
  def apply(
    groupNames: Input[js.Array[Input[String]]],
    notifications: Input[js.Array[Input[NotificationType]]],
    topicArn: Input[String]
  ): NotificationArgs = {
    val __obj = js.Dynamic.literal(groupNames = groupNames.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationArgs]
  }
}

