package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotificationArnNotificationEvents extends js.Object {
  var notificationArn: js.UndefOr[Input[String]] = js.undefined
  var notificationEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var notificationType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_NotificationArnNotificationEvents {
  @scala.inline
  def apply(
    notificationArn: Input[String] = null,
    notificationEvents: Input[js.Array[Input[String]]] = null,
    notificationType: Input[String] = null
  ): Anon_NotificationArnNotificationEvents = {
    val __obj = js.Dynamic.literal()
    if (notificationArn != null) __obj.updateDynamic("notificationArn")(notificationArn.asInstanceOf[js.Any])
    if (notificationEvents != null) __obj.updateDynamic("notificationEvents")(notificationEvents.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotificationArnNotificationEvents]
  }
}

