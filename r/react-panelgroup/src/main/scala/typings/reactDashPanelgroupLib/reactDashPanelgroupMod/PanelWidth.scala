package typings
package reactDashPanelgroupLib.reactDashPanelgroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelWidth extends js.Object {
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var resize: js.UndefOr[
    reactDashPanelgroupLib.reactDashPanelgroupLibStrings.fixed | reactDashPanelgroupLib.reactDashPanelgroupLibStrings.dynamic | reactDashPanelgroupLib.reactDashPanelgroupLibStrings.stretch
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var snap: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object PanelWidth {
  @scala.inline
  def apply(
    minSize: scala.Int | scala.Double = null,
    resize: reactDashPanelgroupLib.reactDashPanelgroupLibStrings.fixed | reactDashPanelgroupLib.reactDashPanelgroupLibStrings.dynamic | reactDashPanelgroupLib.reactDashPanelgroupLibStrings.stretch = null,
    size: scala.Int | scala.Double = null,
    snap: js.Array[scala.Double] = null
  ): PanelWidth = {
    val __obj = js.Dynamic.literal()
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap)
    __obj.asInstanceOf[PanelWidth]
  }
}

