package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscription extends js.Object {
  def remove(): scala.Unit
}

object EventSubscription {
  @scala.inline
  def apply(remove: js.Function0[scala.Unit]): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[EventSubscription]
  }
}

