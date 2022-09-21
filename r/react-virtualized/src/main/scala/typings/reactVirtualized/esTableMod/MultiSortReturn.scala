package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSortReturn extends StObject {
  
  /**
    * Sort property to be passed to the `Table` component.
    * This function updates `sortBy` and `sortDirection` values.
    */
  def sort(params: SortParams): Unit
  
  /**
    * Specifies the fields currently responsible for sorting data,
    * In order of importance.
    */
  var sortBy: js.Array[String]
  
  /**
    * Specifies the direction a specific field is being sorted in.
    */
  var sortDirection: SortDirectionMap
}
object MultiSortReturn {
  
  inline def apply(sort: SortParams => Unit, sortBy: js.Array[String], sortDirection: SortDirectionMap): MultiSortReturn = {
    val __obj = js.Dynamic.literal(sort = js.Any.fromFunction1(sort), sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSortReturn]
  }
  
  extension [Self <: MultiSortReturn](x: Self) {
    
    inline def setSort(value: SortParams => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    inline def setSortBy(value: js.Array[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByVarargs(value: String*): Self = StObject.set(x, "sortBy", js.Array(value*))
    
    inline def setSortDirection(value: SortDirectionMap): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
  }
}
