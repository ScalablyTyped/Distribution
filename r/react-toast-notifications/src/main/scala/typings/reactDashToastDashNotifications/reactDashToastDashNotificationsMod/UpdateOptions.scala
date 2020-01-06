package typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends Options {
  var content: js.UndefOr[String] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    appearance: AppearanceTypes,
    autoDismiss: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    onDismiss: /* id */ String => Unit = null
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    __obj.asInstanceOf[UpdateOptions]
  }
}

