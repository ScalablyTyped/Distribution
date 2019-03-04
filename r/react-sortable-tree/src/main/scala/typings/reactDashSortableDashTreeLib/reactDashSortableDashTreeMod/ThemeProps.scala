package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps extends ThemeTreeProps {
  var treeNodeRenderer: js.UndefOr[TreeRenderer] = js.undefined
}

object ThemeProps {
  @scala.inline
  def apply(
    innerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    nodeContentRenderer: NodeRenderer = null,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: stdLib.Partial[reactDashVirtualizedLib.distEsListMod.ListProps] = null,
    rowHeight: (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]) | scala.Double = null,
    scaffoldBlockPxWidth: scala.Int | scala.Double = null,
    slideRegionSize: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    treeNodeRenderer: TreeRenderer = null
  ): ThemeProps = {
    val __obj = js.Dynamic.literal()
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer)
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer)
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (treeNodeRenderer != null) __obj.updateDynamic("treeNodeRenderer")(treeNodeRenderer)
    __obj.asInstanceOf[ThemeProps]
  }
}

