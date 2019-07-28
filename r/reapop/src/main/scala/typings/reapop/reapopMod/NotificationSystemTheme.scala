package typings.reapop.reapopMod

import typings.reapop.Anon_Button
import typings.reapop.Anon_ClassName
import typings.reapop.Anon_EnterTimeout
import typings.reapop.Anon_Main
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSystemTheme extends js.Object {
  var notificationClassName: js.UndefOr[Anon_Button] = js.undefined
  var notificationsContainerClassName: js.UndefOr[Anon_Main] = js.undefined
  var notificationsContainerTransition: js.UndefOr[Anon_EnterTimeout] = js.undefined
  var notificationsSystem: js.UndefOr[Anon_ClassName] = js.undefined
  var smallScreenMin: js.UndefOr[Double] = js.undefined
}

object NotificationSystemTheme {
  @scala.inline
  def apply(
    notificationClassName: Anon_Button = null,
    notificationsContainerClassName: Anon_Main = null,
    notificationsContainerTransition: Anon_EnterTimeout = null,
    notificationsSystem: Anon_ClassName = null,
    smallScreenMin: Int | Double = null
  ): NotificationSystemTheme = {
    val __obj = js.Dynamic.literal()
    if (notificationClassName != null) __obj.updateDynamic("notificationClassName")(notificationClassName)
    if (notificationsContainerClassName != null) __obj.updateDynamic("notificationsContainerClassName")(notificationsContainerClassName)
    if (notificationsContainerTransition != null) __obj.updateDynamic("notificationsContainerTransition")(notificationsContainerTransition)
    if (notificationsSystem != null) __obj.updateDynamic("notificationsSystem")(notificationsSystem)
    if (smallScreenMin != null) __obj.updateDynamic("smallScreenMin")(smallScreenMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSystemTheme]
  }
}

