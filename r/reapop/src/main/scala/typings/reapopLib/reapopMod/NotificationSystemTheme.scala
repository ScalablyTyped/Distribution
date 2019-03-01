package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSystemTheme extends js.Object {
  var notificationClassName: js.UndefOr[reapopLib.Anon_Button] = js.undefined
  var notificationsContainerClassName: js.UndefOr[reapopLib.Anon_Main] = js.undefined
  var notificationsContainerTransition: js.UndefOr[reapopLib.Anon_EnterTimeout] = js.undefined
  var notificationsSystem: js.UndefOr[reapopLib.Anon_ClassName] = js.undefined
  var smallScreenMin: js.UndefOr[scala.Double] = js.undefined
}

object NotificationSystemTheme {
  @scala.inline
  def apply(
    notificationClassName: reapopLib.Anon_Button = null,
    notificationsContainerClassName: reapopLib.Anon_Main = null,
    notificationsContainerTransition: reapopLib.Anon_EnterTimeout = null,
    notificationsSystem: reapopLib.Anon_ClassName = null,
    smallScreenMin: scala.Int | scala.Double = null
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

