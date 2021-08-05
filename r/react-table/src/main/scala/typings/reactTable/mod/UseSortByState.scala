package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSortByState[D /* <: js.Object */] extends StObject {
  
  var sortBy: js.Array[SortingRule[D]]
}
object UseSortByState {
  
  inline def apply[D /* <: js.Object */](sortBy: js.Array[SortingRule[D]]): UseSortByState[D] = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByState[D]]
  }
  
  extension [Self <: UseSortByState[?], D /* <: js.Object */](x: Self & UseSortByState[D]) {
    
    inline def setSortBy(value: js.Array[SortingRule[D]]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByVarargs(value: SortingRule[D]*): Self = StObject.set(x, "sortBy", js.Array(value :_*))
  }
}
