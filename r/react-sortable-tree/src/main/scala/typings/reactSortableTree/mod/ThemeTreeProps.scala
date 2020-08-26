package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.reactSortableTree.anon.PartialListProps
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeTreeProps extends js.Object {
  var innerStyle: js.UndefOr[CSSProperties] = js.native
  var nodeContentRenderer: js.UndefOr[NodeRenderer] = js.native
  var placeholderRenderer: js.UndefOr[PlaceholderRenderer] = js.native
  var reactVirtualizedListProps: js.UndefOr[PartialListProps] = js.native
  var rowHeight: js.UndefOr[(js.Function1[/* info */ NodeData with Index, Double]) | Double] = js.native
  var scaffoldBlockPxWidth: js.UndefOr[Double] = js.native
  var slideRegionSize: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ThemeTreeProps {
  @scala.inline
  def apply(): ThemeTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTreeProps]
  }
  @scala.inline
  implicit class ThemeTreePropsOps[Self <: ThemeTreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInnerStyle(value: CSSProperties): Self = this.set("innerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerStyle: Self = this.set("innerStyle", js.undefined)
    @scala.inline
    def setNodeContentRenderer(value: NodeRenderer): Self = this.set("nodeContentRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeContentRenderer: Self = this.set("nodeContentRenderer", js.undefined)
    @scala.inline
    def setPlaceholderRenderer(value: PlaceholderRenderer): Self = this.set("placeholderRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderRenderer: Self = this.set("placeholderRenderer", js.undefined)
    @scala.inline
    def setReactVirtualizedListProps(value: PartialListProps): Self = this.set("reactVirtualizedListProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactVirtualizedListProps: Self = this.set("reactVirtualizedListProps", js.undefined)
    @scala.inline
    def setRowHeightFunction1(value: /* info */ NodeData with Index => Double): Self = this.set("rowHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setRowHeight(value: (js.Function1[/* info */ NodeData with Index, Double]) | Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setScaffoldBlockPxWidth(value: Double): Self = this.set("scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaffoldBlockPxWidth: Self = this.set("scaffoldBlockPxWidth", js.undefined)
    @scala.inline
    def setSlideRegionSize(value: Double): Self = this.set("slideRegionSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideRegionSize: Self = this.set("slideRegionSize", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

