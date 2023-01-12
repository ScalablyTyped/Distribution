package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableFilterParams extends StObject {
  
  var filters: DataTableFilterMeta
}
object DataTableFilterParams {
  
  inline def apply(filters: DataTableFilterMeta): DataTableFilterParams = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableFilterParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableFilterParams] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DataTableFilterMeta): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
  }
}
