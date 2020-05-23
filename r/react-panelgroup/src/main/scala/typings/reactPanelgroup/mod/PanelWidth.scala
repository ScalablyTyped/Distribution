package typings.reactPanelgroup.mod

import typings.reactPanelgroup.reactPanelgroupStrings.dynamic
import typings.reactPanelgroup.reactPanelgroupStrings.fixed
import typings.reactPanelgroup.reactPanelgroupStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelWidth extends js.Object {
  var minSize: js.UndefOr[Double] = js.undefined
  var resize: js.UndefOr[fixed | dynamic | stretch] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var snap: js.UndefOr[js.Array[Double]] = js.undefined
}

object PanelWidth {
  @scala.inline
  def apply(
    minSize: js.UndefOr[Double] = js.undefined,
    resize: fixed | dynamic | stretch = null,
    size: js.UndefOr[Double] = js.undefined,
    snap: js.Array[Double] = null
  ): PanelWidth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelWidth]
  }
}

