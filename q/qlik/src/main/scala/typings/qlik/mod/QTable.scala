package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QTable extends StObject {
  
  var colCount: Double = js.native
  
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ String, Unit]): Unit = js.native
  
  def getColByName(fld: String): js.UndefOr[Double] = js.native
  
  def getMoreData(): Unit = js.native
  
  var headers: js.Array[QHeader] = js.native
  
  var rowCount: Double = js.native
  
  var rows: js.Array[QRow] = js.native
  
  var totals: js.Array[QMeasureCell] = js.native
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
  implicit class QTableMutableBuilder[Self <: QTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportData(value: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Unit): Self = StObject.set(x, "exportData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetColByName(value: String => js.UndefOr[Double]): Self = StObject.set(x, "getColByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMoreData(value: () => Unit): Self = StObject.set(x, "getMoreData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: js.Array[QHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: QHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[QRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: QRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotals(value: js.Array[QMeasureCell]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsVarargs(value: QMeasureCell*): Self = StObject.set(x, "totals", js.Array(value :_*))
  }
}
