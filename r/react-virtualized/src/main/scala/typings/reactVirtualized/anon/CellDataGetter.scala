package typings.reactVirtualized.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellDataGetter extends js.Object {
  var `aria-label`: Requireable[String] = js.native
  var cellDataGetter: Requireable[TableCellDataGetter] = js.native
  var cellRenderer: Requireable[TableCellRenderer] = js.native
  var className: Requireable[String] = js.native
  var columnData: Requireable[js.Object] = js.native
  var dataKey: Validator[String] = js.native
  var disableSort: Requireable[Boolean] = js.native
  var flexGrow: Requireable[Double] = js.native
  var flexShrink: Requireable[Double] = js.native
  var headerClassName: Requireable[String] = js.native
  var headerRenderer: Validator[TableHeaderRowRenderer] = js.native
  var id: Requireable[String] = js.native
  var label: Requireable[String] = js.native
  var maxWidth: Requireable[Double] = js.native
  var minWidth: Requireable[Double] = js.native
  var style: Requireable[CSSProperties] = js.native
  var width: Validator[Double] = js.native
}

object CellDataGetter {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellDataGetter: Requireable[TableCellDataGetter],
    cellRenderer: Requireable[TableCellRenderer],
    className: Requireable[String],
    columnData: Requireable[js.Object],
    dataKey: Validator[String],
    disableSort: Requireable[Boolean],
    flexGrow: Requireable[Double],
    flexShrink: Requireable[Double],
    headerClassName: Requireable[String],
    headerRenderer: Validator[TableHeaderRowRenderer],
    id: Requireable[String],
    label: Requireable[String],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    style: Requireable[CSSProperties],
    width: Validator[Double]
  ): CellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], disableSort = disableSort.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerRenderer = headerRenderer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDataGetter]
  }
  @scala.inline
  implicit class CellDataGetterOps[Self <: CellDataGetter] (val x: Self) extends AnyVal {
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
    def `setAria-label`(value: Requireable[String]): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellDataGetter(value: Requireable[TableCellDataGetter]): Self = this.set("cellDataGetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellRenderer(value: Requireable[TableCellRenderer]): Self = this.set("cellRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: Requireable[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnData(value: Requireable[js.Object]): Self = this.set("columnData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataKey(value: Validator[String]): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableSort(value: Requireable[Boolean]): Self = this.set("disableSort", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexGrow(value: Requireable[Double]): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexShrink(value: Requireable[Double]): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderClassName(value: Requireable[String]): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderRenderer(value: Validator[TableHeaderRowRenderer]): Self = this.set("headerRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Requireable[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Requireable[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Requireable[Double]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Requireable[Double]): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Requireable[CSSProperties]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Validator[Double]): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

