package typings.reapop.mod

import typings.reapop.AnonButton
import typings.reapop.AnonClassName
import typings.reapop.AnonEnterTimeout
import typings.reapop.AnonMain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSystemTheme extends js.Object {
  var notificationClassName: js.UndefOr[AnonButton] = js.undefined
  var notificationsContainerClassName: js.UndefOr[AnonMain] = js.undefined
  var notificationsContainerTransition: js.UndefOr[AnonEnterTimeout] = js.undefined
  var notificationsSystem: js.UndefOr[AnonClassName] = js.undefined
  var smallScreenMin: js.UndefOr[Double] = js.undefined
}

object NotificationSystemTheme {
  @scala.inline
  def apply(
    notificationClassName: AnonButton = null,
    notificationsContainerClassName: AnonMain = null,
    notificationsContainerTransition: AnonEnterTimeout = null,
    notificationsSystem: AnonClassName = null,
    smallScreenMin: Int | Double = null
  ): NotificationSystemTheme = {
    val __obj = js.Dynamic.literal()
    if (notificationClassName != null) __obj.updateDynamic("notificationClassName")(notificationClassName.asInstanceOf[js.Any])
    if (notificationsContainerClassName != null) __obj.updateDynamic("notificationsContainerClassName")(notificationsContainerClassName.asInstanceOf[js.Any])
    if (notificationsContainerTransition != null) __obj.updateDynamic("notificationsContainerTransition")(notificationsContainerTransition.asInstanceOf[js.Any])
    if (notificationsSystem != null) __obj.updateDynamic("notificationsSystem")(notificationsSystem.asInstanceOf[js.Any])
    if (smallScreenMin != null) __obj.updateDynamic("smallScreenMin")(smallScreenMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSystemTheme]
  }
}

