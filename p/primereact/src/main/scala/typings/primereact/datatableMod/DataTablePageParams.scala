package typings.primereact.datatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTablePageParams extends StObject {
  
  var first: Double
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pageCount: js.UndefOr[Double] = js.undefined
  
  var rows: Double
}
object DataTablePageParams {
  
  inline def apply(first: Double, rows: Double): DataTablePageParams = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTablePageParams]
  }
  
  extension [Self <: DataTablePageParams](x: Self) {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
