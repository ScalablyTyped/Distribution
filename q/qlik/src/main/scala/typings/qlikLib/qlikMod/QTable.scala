package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QTable extends js.Object {
  var colCount: scala.Double
  var headers: js.Array[QHeader]
  var rowCount: scala.Double
  var rows: js.Array[QRow]
  var totals: js.Array[QMeasureCell]
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ java.lang.String, scala.Unit]): scala.Unit
  def getColByName(fld: java.lang.String): js.UndefOr[scala.Double]
  def getMoreData(): scala.Unit
}

object QTable {
  @scala.inline
  def apply(
    colCount: scala.Double,
    exportData: js.Function2[ExportDataOptions, js.Function1[/* url */ java.lang.String, scala.Unit], scala.Unit],
    getColByName: js.Function1[java.lang.String, js.UndefOr[scala.Double]],
    getMoreData: js.Function0[scala.Unit],
    headers: js.Array[QHeader],
    rowCount: scala.Double,
    rows: js.Array[QRow],
    totals: js.Array[QMeasureCell]
  ): QTable = {
    val __obj = js.Dynamic.literal(colCount = colCount, exportData = exportData, getColByName = getColByName, getMoreData = getMoreData, headers = headers, rowCount = rowCount, rows = rows, totals = totals)
  
    __obj.asInstanceOf[QTable]
  }
}

