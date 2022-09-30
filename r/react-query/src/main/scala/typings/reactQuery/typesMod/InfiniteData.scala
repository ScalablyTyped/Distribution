package typings.reactQuery.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfiniteData[TData] extends StObject {
  
  var pageParams: js.Array[Any]
  
  var pages: js.Array[TData]
}
object InfiniteData {
  
  inline def apply[TData](pageParams: js.Array[Any], pages: js.Array[TData]): InfiniteData[TData] = {
    val __obj = js.Dynamic.literal(pageParams = pageParams.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteData[TData]]
  }
  
  extension [Self <: InfiniteData[?], TData](x: Self & InfiniteData[TData]) {
    
    inline def setPageParams(value: js.Array[Any]): Self = StObject.set(x, "pageParams", value.asInstanceOf[js.Any])
    
    inline def setPageParamsVarargs(value: Any*): Self = StObject.set(x, "pageParams", js.Array(value*))
    
    inline def setPages(value: js.Array[TData]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: TData*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
