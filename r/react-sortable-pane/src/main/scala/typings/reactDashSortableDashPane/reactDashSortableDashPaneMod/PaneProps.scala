package typings.reactDashSortableDashPane.reactDashSortableDashPaneMod

import typings.react.reactMod.HTMLAttributes
import typings.reactDashSortableDashPane.Anon_X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var height: String | Double
  var id: PaneId
  var isResizable: js.UndefOr[Anon_X] = js.undefined
  var maxHeight: js.UndefOr[String | Double] = js.undefined
  var maxWidth: js.UndefOr[String | Double] = js.undefined
  var minHeight: js.UndefOr[String | Double] = js.undefined
  var minWidth: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var width: String | Double
}

object PaneProps {
  @scala.inline
  def apply(
    height: String | Double,
    id: PaneId,
    width: String | Double,
    className: String = null,
    isResizable: Anon_X = null,
    maxHeight: String | Double = null,
    maxWidth: String | Double = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    style: HTMLAttributes[HTMLElement] = null
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

