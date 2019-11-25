package typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends js.Object {
  var children: ReactNode
  var hasToasts: Boolean
  var placement: Placement
}

object ToastContainerProps {
  @scala.inline
  def apply(hasToasts: Boolean, placement: Placement, children: ReactNode = null): ToastContainerProps = {
    val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastContainerProps]
  }
}

