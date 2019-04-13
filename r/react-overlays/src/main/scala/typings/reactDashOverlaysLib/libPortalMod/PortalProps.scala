package typings
package reactDashOverlaysLib.libPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  var container: js.UndefOr[reactLib.reactMod.ReactNode | js.Function] = js.undefined
  var onRendered: js.UndefOr[js.Function] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(container: reactLib.reactMod.ReactNode | js.Function = null, onRendered: js.Function = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered)
    __obj.asInstanceOf[PortalProps]
  }
}

