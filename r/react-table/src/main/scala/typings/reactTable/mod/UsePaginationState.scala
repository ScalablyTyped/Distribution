package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsePaginationState[D /* <: js.Object */] extends StObject {
  
  var pageIndex: Double
  
  var pageSize: Double
}
object UsePaginationState {
  
  inline def apply[D /* <: js.Object */](pageIndex: Double, pageSize: Double): UsePaginationState[D] = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationState[D]]
  }
  
  extension [Self <: UsePaginationState[?], D /* <: js.Object */](x: Self & UsePaginationState[D]) {
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
  }
}
