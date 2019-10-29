package typings.reactDashSortableDashPane.libPaneMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashSortableDashPane.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProps
  extends /* otherProps */ StringDictionary[js.Any] {
  var children: js.UndefOr[String | ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultSize: js.UndefOr[Anon_Height] = js.undefined
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var maxHeight: js.UndefOr[PaneSize] = js.undefined
  var maxWidth: js.UndefOr[PaneSize] = js.undefined
  var minHeight: js.UndefOr[PaneSize] = js.undefined
  var minWidth: js.UndefOr[PaneSize] = js.undefined
  var onSizeChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resizable: js.UndefOr[IsPaneResizable] = js.undefined
  var size: js.UndefOr[Anon_Height] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PaneProps {
  @scala.inline
  def apply(
    StringDictionary: /* otherProps */ StringDictionary[js.Any] = null,
    children: String | ReactNode = null,
    className: String = null,
    defaultSize: Anon_Height = null,
    grid: js.Tuple2[Double, Double] = null,
    maxHeight: PaneSize = null,
    maxWidth: PaneSize = null,
    minHeight: PaneSize = null,
    minWidth: PaneSize = null,
    onSizeChange: () => Unit = null,
    resizable: IsPaneResizable = null,
    size: Anon_Height = null,
    style: CSSProperties = null
  ): PaneProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onSizeChange != null) __obj.updateDynamic("onSizeChange")(js.Any.fromFunction0(onSizeChange))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PaneProps]
  }
}

