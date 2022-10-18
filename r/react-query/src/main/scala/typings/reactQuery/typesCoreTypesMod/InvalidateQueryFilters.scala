package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.typesCoreUtilsMod.QueryFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidateQueryFilters[TPageData]
  extends StObject
     with QueryFilters
     with RefetchPageFilters[TPageData] {
  
  var refetchActive: js.UndefOr[Boolean] = js.undefined
  
  var refetchInactive: js.UndefOr[Boolean] = js.undefined
}
object InvalidateQueryFilters {
  
  inline def apply[TPageData](): InvalidateQueryFilters[TPageData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidateQueryFilters[TPageData]]
  }
  
  extension [Self <: InvalidateQueryFilters[?], TPageData](x: Self & InvalidateQueryFilters[TPageData]) {
    
    inline def setRefetchActive(value: Boolean): Self = StObject.set(x, "refetchActive", value.asInstanceOf[js.Any])
    
    inline def setRefetchActiveUndefined: Self = StObject.set(x, "refetchActive", js.undefined)
    
    inline def setRefetchInactive(value: Boolean): Self = StObject.set(x, "refetchInactive", value.asInstanceOf[js.Any])
    
    inline def setRefetchInactiveUndefined: Self = StObject.set(x, "refetchInactive", js.undefined)
  }
}
