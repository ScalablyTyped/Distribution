package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeTreeProps extends js.Object {
  var innerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var nodeContentRenderer: js.UndefOr[NodeRenderer] = js.undefined
  var placeholderRenderer: js.UndefOr[PlaceholderRenderer] = js.undefined
  var reactVirtualizedListProps: js.UndefOr[stdLib.Partial[reactDashVirtualizedLib.distEsListMod.ListProps]] = js.undefined
  var rowHeight: js.UndefOr[
    (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]) | scala.Double
  ] = js.undefined
  var scaffoldBlockPxWidth: js.UndefOr[scala.Double] = js.undefined
  var slideRegionSize: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ThemeTreeProps {
  @scala.inline
  def apply(
    innerStyle: reactLib.reactMod.CSSProperties = null,
    nodeContentRenderer: NodeRenderer = null,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: stdLib.Partial[reactDashVirtualizedLib.distEsListMod.ListProps] = null,
    rowHeight: (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]) | scala.Double = null,
    scaffoldBlockPxWidth: scala.Int | scala.Double = null,
    slideRegionSize: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ThemeTreeProps = {
    val __obj = js.Dynamic.literal()
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer.asInstanceOf[js.Any])
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer.asInstanceOf[js.Any])
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ThemeTreeProps]
  }
}

