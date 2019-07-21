package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotificationArn extends js.Object {
  var notificationArn: js.UndefOr[java.lang.String] = js.undefined
  var notificationEvents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var notificationType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NotificationArn {
  @scala.inline
  def apply(
    notificationArn: java.lang.String = null,
    notificationEvents: js.Array[java.lang.String] = null,
    notificationType: java.lang.String = null
  ): Anon_NotificationArn = {
    val __obj = js.Dynamic.literal()
    if (notificationArn != null) __obj.updateDynamic("notificationArn")(notificationArn)
    if (notificationEvents != null) __obj.updateDynamic("notificationEvents")(notificationEvents)
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType)
    __obj.asInstanceOf[Anon_NotificationArn]
  }
}

