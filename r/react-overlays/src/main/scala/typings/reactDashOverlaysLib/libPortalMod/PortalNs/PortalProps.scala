package typings
package reactDashOverlaysLib.libPortalMod.PortalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  var container: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | js.Function] = js.undefined
  var onRendered: js.UndefOr[js.Function] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(
    container: reactLib.reactMod.ReactNs.ReactNode | js.Function = null,
    onRendered: js.Function = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered)
    __obj.asInstanceOf[PortalProps]
  }
}

