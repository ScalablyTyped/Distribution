package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMethod extends StObject {
  
  /** Method options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /** Whether requests are streamed */
  var requestStream: js.UndefOr[Boolean] = js.native
  
  /** Request type */
  var requestType: String = js.native
  
  /** Whether responses are streamed */
  var responseStream: js.UndefOr[Boolean] = js.native
  
  /** Response type */
  var responseType: String = js.native
  
  /** Method type */
  var `type`: js.UndefOr[String] = js.native
}
object IMethod {
  
  @scala.inline
  def apply(requestType: String, responseType: String): IMethod = {
    val __obj = js.Dynamic.literal(requestType = requestType.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethod]
  }
  
  @scala.inline
  implicit class IMethodMutableBuilder[Self <: IMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStreamUndefined: Self = StObject.set(x, "requestStream", js.undefined)
    
    @scala.inline
    def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStreamUndefined: Self = StObject.set(x, "responseStream", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
