package typings.rcTable.interfaceMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellType[RecordType] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colEnd: js.UndefOr[Double] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var colStart: js.UndefOr[Double] = js.undefined
  var column: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
  ] = js.undefined
  /** Only used for table header */
  var hasSubColumns: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CellType {
  @scala.inline
  def apply[RecordType](
    children: ReactNode = null,
    className: String = null,
    colEnd: js.UndefOr[Double] = js.undefined,
    colSpan: js.UndefOr[Double] = js.undefined,
    colStart: js.UndefOr[Double] = js.undefined,
    column: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any = null,
    hasSubColumns: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): CellType[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colEnd)) __obj.updateDynamic("colEnd")(colEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colStart)) __obj.updateDynamic("colStart")(colStart.get.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSubColumns)) __obj.updateDynamic("hasSubColumns")(hasSubColumns.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellType[RecordType]]
  }
}

