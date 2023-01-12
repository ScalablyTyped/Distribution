package typings.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchNextPageOptions
  extends StObject
     with ResultOptions {
  
  var cancelRefetch: js.UndefOr[Boolean] = js.undefined
  
  var pageParam: js.UndefOr[Any] = js.undefined
}
object FetchNextPageOptions {
  
  inline def apply(): FetchNextPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchNextPageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchNextPageOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelRefetch(value: Boolean): Self = StObject.set(x, "cancelRefetch", value.asInstanceOf[js.Any])
    
    inline def setCancelRefetchUndefined: Self = StObject.set(x, "cancelRefetch", js.undefined)
    
    inline def setPageParam(value: Any): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
    
    inline def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
  }
}
