package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.react.reactMod.CSSProperties
import typings.reactDashVirtualized.distEsListMod.ListProps
import typings.reactDashVirtualized.reactDashVirtualizedMod.Index
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps extends ThemeTreeProps {
  var treeNodeRenderer: js.UndefOr[TreeRenderer] = js.undefined
}

object ThemeProps {
  @scala.inline
  def apply(
    innerStyle: CSSProperties = null,
    nodeContentRenderer: NodeRenderer = null,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: Partial[ListProps] = null,
    rowHeight: (js.Function1[/* info */ Index, Double]) | Double = null,
    scaffoldBlockPxWidth: Int | Double = null,
    slideRegionSize: Int | Double = null,
    style: CSSProperties = null,
    treeNodeRenderer: TreeRenderer = null
  ): ThemeProps = {
    val __obj = js.Dynamic.literal()
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer.asInstanceOf[js.Any])
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer.asInstanceOf[js.Any])
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (treeNodeRenderer != null) __obj.updateDynamic("treeNodeRenderer")(treeNodeRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProps]
  }
}

