package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreExceptionsInformation
  extends StObject
     with ExceptionInformation {
  
  var detailURI: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var explanationString: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var siteName: js.UndefOr[java.lang.String | Null] = js.undefined
}
object StoreExceptionsInformation {
  
  inline def apply(): StoreExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreExceptionsInformation]
  }
  
  extension [Self <: StoreExceptionsInformation](x: Self) {
    
    inline def setDetailURI(value: java.lang.String): Self = StObject.set(x, "detailURI", value.asInstanceOf[js.Any])
    
    inline def setDetailURINull: Self = StObject.set(x, "detailURI", null)
    
    inline def setDetailURIUndefined: Self = StObject.set(x, "detailURI", js.undefined)
    
    inline def setExplanationString(value: java.lang.String): Self = StObject.set(x, "explanationString", value.asInstanceOf[js.Any])
    
    inline def setExplanationStringNull: Self = StObject.set(x, "explanationString", null)
    
    inline def setExplanationStringUndefined: Self = StObject.set(x, "explanationString", js.undefined)
    
    inline def setSiteName(value: java.lang.String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
    
    inline def setSiteNameNull: Self = StObject.set(x, "siteName", null)
    
    inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
  }
}
