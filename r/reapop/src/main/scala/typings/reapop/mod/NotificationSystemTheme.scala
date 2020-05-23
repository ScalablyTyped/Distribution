package typings.reapop.mod

import typings.reapop.anon.ClassName
import typings.reapop.anon.EnterTimeout
import typings.reapop.anon.Main
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSystemTheme extends js.Object {
  var notificationClassName: js.UndefOr[typings.reapop.anon.Button] = js.undefined
  var notificationsContainerClassName: js.UndefOr[Main] = js.undefined
  var notificationsContainerTransition: js.UndefOr[EnterTimeout] = js.undefined
  var notificationsSystem: js.UndefOr[ClassName] = js.undefined
  var smallScreenMin: js.UndefOr[Double] = js.undefined
}

object NotificationSystemTheme {
  @scala.inline
  def apply(
    notificationClassName: typings.reapop.anon.Button = null,
    notificationsContainerClassName: Main = null,
    notificationsContainerTransition: EnterTimeout = null,
    notificationsSystem: ClassName = null,
    smallScreenMin: js.UndefOr[Double] = js.undefined
  ): NotificationSystemTheme = {
    val __obj = js.Dynamic.literal()
    if (notificationClassName != null) __obj.updateDynamic("notificationClassName")(notificationClassName.asInstanceOf[js.Any])
    if (notificationsContainerClassName != null) __obj.updateDynamic("notificationsContainerClassName")(notificationsContainerClassName.asInstanceOf[js.Any])
    if (notificationsContainerTransition != null) __obj.updateDynamic("notificationsContainerTransition")(notificationsContainerTransition.asInstanceOf[js.Any])
    if (notificationsSystem != null) __obj.updateDynamic("notificationsSystem")(notificationsSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(smallScreenMin)) __obj.updateDynamic("smallScreenMin")(smallScreenMin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSystemTheme]
  }
}

