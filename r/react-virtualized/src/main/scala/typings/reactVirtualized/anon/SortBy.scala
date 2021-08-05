package typings.reactVirtualized.anon

import typings.reactVirtualized.esTableMod.SortDirectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortBy extends StObject {
  
  var sortBy: String
  
  var sortDirection: SortDirectionType
}
object SortBy {
  
  inline def apply(sortBy: String, sortDirection: SortDirectionType): SortBy = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortBy]
  }
  
  extension [Self <: SortBy](x: Self) {
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
  }
}
