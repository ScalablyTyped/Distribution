package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMethod extends StObject {
  
  /** Method options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /** Whether requests are streamed */
  var requestStream: js.UndefOr[Boolean] = js.undefined
  
  /** Request type */
  var requestType: String
  
  /** Whether responses are streamed */
  var responseStream: js.UndefOr[Boolean] = js.undefined
  
  /** Response type */
  var responseType: String
  
  /** Method type */
  var `type`: js.UndefOr[String] = js.undefined
}
object IMethod {
  
  inline def apply(requestType: String, responseType: String): IMethod = {
    val __obj = js.Dynamic.literal(requestType = requestType.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethod]
  }
  
  extension [Self <: IMethod](x: Self) {
    
    inline def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
    
    inline def setRequestStreamUndefined: Self = StObject.set(x, "requestStream", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
    
    inline def setResponseStreamUndefined: Self = StObject.set(x, "responseStream", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
