package typings.reactVirtualized.esTableMod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortParams extends StObject {
  
  var defaultSortDirection: SortDirectionType
  
  var event: MouseEvent
  
  var sortBy: String
}
object SortParams {
  
  inline def apply(defaultSortDirection: SortDirectionType, event: MouseEvent, sortBy: String): SortParams = {
    val __obj = js.Dynamic.literal(defaultSortDirection = defaultSortDirection.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortParams]
  }
  
  extension [Self <: SortParams](x: Self) {
    
    inline def setDefaultSortDirection(value: SortDirectionType): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
  }
}
