package typings.reactQuery.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefetchPageFilters[TPageData] extends StObject {
  
  var refetchPage: js.UndefOr[
    js.Function3[
      /* lastPage */ TPageData, 
      /* index */ Double, 
      /* allPages */ js.Array[TPageData], 
      Boolean
    ]
  ] = js.undefined
}
object RefetchPageFilters {
  
  inline def apply[TPageData](): RefetchPageFilters[TPageData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefetchPageFilters[TPageData]]
  }
  
  extension [Self <: RefetchPageFilters[?], TPageData](x: Self & RefetchPageFilters[TPageData]) {
    
    inline def setRefetchPage(
      value: (/* lastPage */ TPageData, /* index */ Double, /* allPages */ js.Array[TPageData]) => Boolean
    ): Self = StObject.set(x, "refetchPage", js.Any.fromFunction3(value))
    
    inline def setRefetchPageUndefined: Self = StObject.set(x, "refetchPage", js.undefined)
  }
}
