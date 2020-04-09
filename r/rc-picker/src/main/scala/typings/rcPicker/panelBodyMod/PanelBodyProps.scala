package typings.rcPicker.panelBodyMod

import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBodyProps[DateType] extends js.Object {
  var baseDate: DateType
  var colNum: Double
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var getCellNode: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var headerCells: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: String
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  var rowNum: Double
  var titleCell: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  def getCellClassName(date: DateType): Record[String, js.UndefOr[Boolean]]
  def getCellDate(date: DateType, offset: Double): DateType
  def getCellText(date: DateType): ReactNode
  def onSelect(value: DateType): Unit
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
    rowNum: Double,
    disabledDate: /* date */ DateType => Boolean = null,
    getCellNode: /* date */ DateType => ReactNode = null,
    headerCells: ReactNode = null,
    prefixColumn: /* date */ DateType => ReactNode = null,
    rowClassName: /* date */ DateType => String = null,
    titleCell: /* date */ DateType => String = null
  ): PanelBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(baseDate = baseDate.asInstanceOf[js.Any], colNum = colNum.asInstanceOf[js.Any], getCellClassName = js.Any.fromFunction1(getCellClassName), getCellDate = js.Any.fromFunction2(getCellDate), getCellText = js.Any.fromFunction1(getCellText), onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (getCellNode != null) __obj.updateDynamic("getCellNode")(js.Any.fromFunction1(getCellNode))
    if (headerCells != null) __obj.updateDynamic("headerCells")(headerCells.asInstanceOf[js.Any])
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (titleCell != null) __obj.updateDynamic("titleCell")(js.Any.fromFunction1(titleCell))
    __obj.asInstanceOf[PanelBodyProps[DateType]]
  }
}

