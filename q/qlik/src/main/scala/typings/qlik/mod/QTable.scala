package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QTable extends js.Object {
  var colCount: Double = js.native
  var headers: js.Array[QHeader] = js.native
  var rowCount: Double = js.native
  var rows: js.Array[QRow] = js.native
  var totals: js.Array[QMeasureCell] = js.native
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ String, Unit]): Unit = js.native
  def getColByName(fld: String): js.UndefOr[Double] = js.native
  def getMoreData(): Unit = js.native
}

object QTable {
  @scala.inline
  def apply(
    colCount: Double,
    exportData: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Unit,
    getColByName: String => js.UndefOr[Double],
    getMoreData: () => Unit,
    headers: js.Array[QHeader],
    rowCount: Double,
    rows: js.Array[QRow],
    totals: js.Array[QMeasureCell]
  ): QTable = {
    val __obj = js.Dynamic.literal(colCount = colCount.asInstanceOf[js.Any], exportData = js.Any.fromFunction2(exportData), getColByName = js.Any.fromFunction1(getColByName), getMoreData = js.Any.fromFunction0(getMoreData), headers = headers.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[QTable]
  }
  @scala.inline
  implicit class QTableOps[Self <: QTable] (val x: Self) extends AnyVal {
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
    def setColCount(value: Double): Self = this.set("colCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportData(value: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Unit): Self = this.set("exportData", js.Any.fromFunction2(value))
    @scala.inline
    def setGetColByName(value: String => js.UndefOr[Double]): Self = this.set("getColByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMoreData(value: () => Unit): Self = this.set("getMoreData", js.Any.fromFunction0(value))
    @scala.inline
    def setHeadersVarargs(value: QHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[QHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: QRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[QRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalsVarargs(value: QMeasureCell*): Self = this.set("totals", js.Array(value :_*))
    @scala.inline
    def setTotals(value: js.Array[QMeasureCell]): Self = this.set("totals", value.asInstanceOf[js.Any])
  }
  
}

