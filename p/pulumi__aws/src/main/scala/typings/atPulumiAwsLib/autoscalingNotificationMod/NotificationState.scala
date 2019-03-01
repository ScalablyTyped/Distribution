package typings
package atPulumiAwsLib.autoscalingNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationState extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here][1]
    */
  val notifications: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType]
      ]
    ]
  ] = js.undefined
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object NotificationState {
  @scala.inline
  def apply(
    groupNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    notifications: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType]
      ]
    ] = null,
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): NotificationState = {
    val __obj = js.Dynamic.literal()
    if (groupNames != null) __obj.updateDynamic("groupNames")(groupNames.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationState]
  }
}

