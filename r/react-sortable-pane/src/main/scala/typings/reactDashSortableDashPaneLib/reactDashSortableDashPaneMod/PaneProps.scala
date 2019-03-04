package typings
package reactDashSortableDashPaneLib.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: java.lang.String | scala.Double
  var id: PaneId
  var isResizable: js.UndefOr[reactDashSortableDashPaneLib.Anon_X] = js.undefined
  var maxHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var minHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]] = js.undefined
  var width: java.lang.String | scala.Double
}

object PaneProps {
  @scala.inline
  def apply(
    height: java.lang.String | scala.Double,
    id: PaneId,
    width: java.lang.String | scala.Double,
    className: java.lang.String = null,
    isResizable: reactDashSortableDashPaneLib.Anon_X = null,
    maxHeight: java.lang.String | scala.Double = null,
    maxWidth: java.lang.String | scala.Double = null,
    minHeight: java.lang.String | scala.Double = null,
    minWidth: java.lang.String | scala.Double = null,
    style: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null
  ): PaneProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (isResizable != null) __obj.updateDynamic("isResizable")(isResizable)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PaneProps]
  }
}

