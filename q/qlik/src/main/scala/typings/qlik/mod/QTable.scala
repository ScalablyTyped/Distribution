package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QTable extends js.Object {
  var colCount: Double
  var headers: js.Array[QHeader]
  var rowCount: Double
  var rows: js.Array[QRow]
  var totals: js.Array[QMeasureCell]
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ String, Unit]): Unit
  def getColByName(fld: String): js.UndefOr[Double]
  def getMoreData(): Unit
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
}

