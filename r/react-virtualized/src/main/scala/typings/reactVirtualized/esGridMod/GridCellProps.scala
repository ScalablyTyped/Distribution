package typings.reactVirtualized.esGridMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridCellProps extends js.Object {
  var columnIndex: Double = js.native
  var isScrolling: Boolean = js.native
  var isVisible: Boolean = js.native
  var key: String = js.native
  var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent = js.native
  var rowIndex: Double = js.native
  var style: CSSProperties = js.native
}

object GridCellProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    isScrolling: Boolean,
    isVisible: Boolean,
    key: String,
    parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent,
    rowIndex: Double,
    style: CSSProperties
  ): GridCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCellProps]
  }
  @scala.inline
  implicit class GridCellPropsOps[Self <: GridCellProps] (val x: Self) extends AnyVal {
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
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

