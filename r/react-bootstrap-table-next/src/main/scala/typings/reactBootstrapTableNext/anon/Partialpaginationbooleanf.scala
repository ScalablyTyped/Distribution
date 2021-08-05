package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  pagination :boolean,   filter :boolean,   sort :boolean,   cellEdit :boolean,   search :boolean}> */
trait Partialpaginationbooleanf extends StObject {
  
  var cellEdit: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[Boolean] = js.undefined
  
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  var search: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
}
object Partialpaginationbooleanf {
  
  inline def apply(): Partialpaginationbooleanf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpaginationbooleanf]
  }
  
  extension [Self <: Partialpaginationbooleanf](x: Self) {
    
    inline def setCellEdit(value: Boolean): Self = StObject.set(x, "cellEdit", value.asInstanceOf[js.Any])
    
    inline def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
