package typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var appearance: AppearanceTypes
  var autoDismiss: js.UndefOr[Boolean] = js.undefined
  var onDismiss: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appearance: AppearanceTypes,
    autoDismiss: js.UndefOr[Boolean] = js.undefined,
    onDismiss: /* id */ String => Unit = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(appearance = appearance)
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    __obj.asInstanceOf[Options]
  }
}

