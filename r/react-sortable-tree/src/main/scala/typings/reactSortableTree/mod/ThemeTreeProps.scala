package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.reactSortableTree.PartialListProps
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeTreeProps extends js.Object {
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  var nodeContentRenderer: js.UndefOr[NodeRenderer] = js.undefined
  var placeholderRenderer: js.UndefOr[PlaceholderRenderer] = js.undefined
  var reactVirtualizedListProps: js.UndefOr[PartialListProps] = js.undefined
  var rowHeight: js.UndefOr[(js.Function1[/* info */ Index, Double]) | Double] = js.undefined
  var scaffoldBlockPxWidth: js.UndefOr[Double] = js.undefined
  var slideRegionSize: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ThemeTreeProps {
  @scala.inline
  def apply(
    innerStyle: CSSProperties = null,
    nodeContentRenderer: NodeRenderer = null,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: PartialListProps = null,
    rowHeight: (js.Function1[/* info */ Index, Double]) | Double = null,
    scaffoldBlockPxWidth: Int | Double = null,
    slideRegionSize: Int | Double = null,
    style: CSSProperties = null
  ): ThemeTreeProps = {
    val __obj = js.Dynamic.literal()
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer.asInstanceOf[js.Any])
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer.asInstanceOf[js.Any])
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTreeProps]
  }
}

