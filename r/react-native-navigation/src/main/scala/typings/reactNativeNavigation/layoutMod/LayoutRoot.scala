package typings.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutRoot extends js.Object {
  var modals: js.UndefOr[js.Any] = js.undefined
  var overlays: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the root
    */
  var root: Layout[js.Object]
}

object LayoutRoot {
  @scala.inline
  def apply(root: Layout[js.Object], modals: js.Any = null, overlays: js.Any = null): LayoutRoot = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (modals != null) __obj.updateDynamic("modals")(modals.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutRoot]
  }
}

