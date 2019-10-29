package typings.reactDashSortableDashPane

import typings.reactDashSortableDashPane.libPaneMod.PaneSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[PaneSize] = js.undefined
  var width: js.UndefOr[PaneSize] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(height: PaneSize = null, width: PaneSize = null): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

