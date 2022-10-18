package typings.primereact.treetableTreetableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTablePageParams extends StObject {
  
  var first: Double
  
  var page: Double
  
  var pageCount: Double
  
  var rows: Double
}
object TreeTablePageParams {
  
  inline def apply(first: Double, page: Double, pageCount: Double, rows: Double): TreeTablePageParams = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTablePageParams]
  }
  
  extension [Self <: TreeTablePageParams](x: Self) {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
