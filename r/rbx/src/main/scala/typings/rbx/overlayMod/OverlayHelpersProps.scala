package typings.rbx.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayHelpersProps extends js.Object {
  var overlay: js.UndefOr[Boolean] = js.undefined
}

object OverlayHelpersProps {
  @scala.inline
  def apply(overlay: js.UndefOr[Boolean] = js.undefined): OverlayHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayHelpersProps]
  }
}

