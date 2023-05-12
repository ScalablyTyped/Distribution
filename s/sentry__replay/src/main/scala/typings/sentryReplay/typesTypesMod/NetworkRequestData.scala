package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkRequestData
  extends StObject
     with _AllEntryData {
  
  var method: js.UndefOr[String] = js.undefined
  
  var requestBodySize: js.UndefOr[Double] = js.undefined
  
  var responseBodySize: js.UndefOr[Double] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object NetworkRequestData {
  
  inline def apply(): NetworkRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkRequestData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkRequestData] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRequestBodySize(value: Double): Self = StObject.set(x, "requestBodySize", value.asInstanceOf[js.Any])
    
    inline def setRequestBodySizeUndefined: Self = StObject.set(x, "requestBodySize", js.undefined)
    
    inline def setResponseBodySize(value: Double): Self = StObject.set(x, "responseBodySize", value.asInstanceOf[js.Any])
    
    inline def setResponseBodySizeUndefined: Self = StObject.set(x, "responseBodySize", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
