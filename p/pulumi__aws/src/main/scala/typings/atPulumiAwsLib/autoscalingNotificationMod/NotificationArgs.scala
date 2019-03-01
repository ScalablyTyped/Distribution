package typings
package atPulumiAwsLib.autoscalingNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationArgs extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here][1]
    */
  val notifications: atPulumiPulumiLib.outputMod.Input[
    js.Array[
      atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType]
    ]
  ]
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object NotificationArgs {
  @scala.inline
  def apply(
    groupNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    notifications: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType]
      ]
    ],
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): NotificationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupNames")(groupNames.asInstanceOf[js.Any])
    __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationArgs]
  }
}

