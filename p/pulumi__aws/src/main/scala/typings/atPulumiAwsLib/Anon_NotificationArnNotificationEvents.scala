package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotificationArnNotificationEvents extends js.Object {
  var notificationArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var notificationEvents: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var notificationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_NotificationArnNotificationEvents {
  @scala.inline
  def apply(
    notificationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationEvents: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_NotificationArnNotificationEvents = {
    val __obj = js.Dynamic.literal()
    if (notificationArn != null) __obj.updateDynamic("notificationArn")(notificationArn.asInstanceOf[js.Any])
    if (notificationEvents != null) __obj.updateDynamic("notificationEvents")(notificationEvents.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotificationArnNotificationEvents]
  }
}

