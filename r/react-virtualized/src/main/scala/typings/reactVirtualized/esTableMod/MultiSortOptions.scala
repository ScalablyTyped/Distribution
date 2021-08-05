package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSortOptions extends StObject {
  
  var defaultSortBy: js.UndefOr[js.Array[String]] = js.undefined
  
  var defaultSortDirection: js.UndefOr[SortDirectionMap] = js.undefined
}
object MultiSortOptions {
  
  inline def apply(): MultiSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSortOptions]
  }
  
  extension [Self <: MultiSortOptions](x: Self) {
    
    inline def setDefaultSortBy(value: js.Array[String]): Self = StObject.set(x, "defaultSortBy", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortByUndefined: Self = StObject.set(x, "defaultSortBy", js.undefined)
    
    inline def setDefaultSortByVarargs(value: String*): Self = StObject.set(x, "defaultSortBy", js.Array(value :_*))
    
    inline def setDefaultSortDirection(value: SortDirectionMap): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
  }
}
