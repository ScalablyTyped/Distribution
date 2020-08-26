package typings.reactVirtualized.esListMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.esGridMod.GridCoreProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, std.Exclude<keyof react-virtualized.react-virtualized/dist/es/Grid.GridCellProps, 'rowIndex'>> & {  index :react-virtualized.react-virtualized/dist/es/Grid.GridCellProps['rowIndex']} */
@js.native
trait ListRowProps extends js.Object {
  var columnIndex: Double = js.native
  var index: Double = js.native
  var isScrolling: Boolean = js.native
  var isVisible: Boolean = js.native
  var key: String = js.native
  var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent = js.native
  var style: CSSProperties = js.native
}

object ListRowProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    index: Double,
    isScrolling: Boolean,
    isVisible: Boolean,
    key: String,
    parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent,
    style: CSSProperties
  ): ListRowProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRowProps]
  }
  @scala.inline
  implicit class ListRowPropsOps[Self <: ListRowProps] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

