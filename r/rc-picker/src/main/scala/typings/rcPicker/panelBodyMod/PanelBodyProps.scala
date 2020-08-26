package typings.rcPicker.panelBodyMod

import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelBodyProps[DateType] extends js.Object {
  var baseDate: DateType = js.native
  var colNum: Double = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var getCellNode: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var headerCells: js.UndefOr[ReactNode] = js.native
  var prefixCls: String = js.native
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
  var rowNum: Double = js.native
  var titleCell: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
  def getCellClassName(date: DateType): Record[String, js.UndefOr[Boolean]] = js.native
  def getCellDate(date: DateType, offset: Double): DateType = js.native
  def getCellText(date: DateType): ReactNode = js.native
  def onSelect(value: DateType): Unit = js.native
}

object PanelBodyProps {
  @scala.inline
  def apply[DateType](
    baseDate: DateType,
    colNum: Double,
    getCellClassName: DateType => Record[String, js.UndefOr[Boolean]],
    getCellDate: (DateType, Double) => DateType,
    getCellText: DateType => ReactNode,
    onSelect: DateType => Unit,
    prefixCls: String,
    rowNum: Double
  ): PanelBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(baseDate = baseDate.asInstanceOf[js.Any], colNum = colNum.asInstanceOf[js.Any], getCellClassName = js.Any.fromFunction1(getCellClassName), getCellDate = js.Any.fromFunction2(getCellDate), getCellText = js.Any.fromFunction1(getCellText), onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBodyProps[DateType]]
  }
  @scala.inline
  implicit class PanelBodyPropsOps[Self <: PanelBodyProps[_], DateType] (val x: Self with PanelBodyProps[DateType]) extends AnyVal {
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
    def setBaseDate(value: DateType): Self = this.set("baseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setColNum(value: Double): Self = this.set("colNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCellClassName(value: DateType => Record[String, js.UndefOr[Boolean]]): Self = this.set("getCellClassName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCellDate(value: (DateType, Double) => DateType): Self = this.set("getCellDate", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCellText(value: DateType => ReactNode): Self = this.set("getCellText", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSelect(value: DateType => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowNum(value: Double): Self = this.set("rowNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setGetCellNode(value: /* date */ DateType => ReactNode): Self = this.set("getCellNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCellNode: Self = this.set("getCellNode", js.undefined)
    @scala.inline
    def setHeaderCells(value: ReactNode): Self = this.set("headerCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCells: Self = this.set("headerCells", js.undefined)
    @scala.inline
    def setPrefixColumn(value: /* date */ DateType => ReactNode): Self = this.set("prefixColumn", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrefixColumn: Self = this.set("prefixColumn", js.undefined)
    @scala.inline
    def setRowClassName(value: /* date */ DateType => String): Self = this.set("rowClassName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
    @scala.inline
    def setTitleCell(value: /* date */ DateType => String): Self = this.set("titleCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTitleCell: Self = this.set("titleCell", js.undefined)
  }
  
}

