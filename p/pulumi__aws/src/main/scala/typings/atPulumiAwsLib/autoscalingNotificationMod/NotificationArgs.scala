package typings
package atPulumiAwsLib.autoscalingNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationArgs extends js.Object {
  /**
    * A list of AutoScaling Group Names
    */
  val groupNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  /**
    * A list of Notification Types that trigger
    * notifications. Acceptable values are documented [in the AWS documentation here][1]
    */
  val notifications: atPulumiPulumiLib.resourceMod.Input[
    js.Array[
      atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType]
    ]
  ]
  /**
    * The Topic ARN for notifications to be sent through
    */
  val topicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

