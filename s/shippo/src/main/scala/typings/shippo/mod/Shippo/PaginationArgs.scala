package typings.shippo.mod.Shippo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationArgs extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
}
object PaginationArgs {
  
  inline def apply(): PaginationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginationArgs] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
