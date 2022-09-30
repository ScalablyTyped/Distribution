package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`unknown-hook`
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.error
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.uncaught
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectElementError
  extends StObject
     with InspectedElementPayload {
  
  var errorType: user | `unknown-hook` | uncaught
  
  var id: Double
  
  var message: String
  
  var responseID: Double
  
  var stack: js.UndefOr[String] = js.undefined
  
  var `type`: error
}
object InspectElementError {
  
  inline def apply(errorType: user | `unknown-hook` | uncaught, id: Double, message: String, responseID: Double): InspectElementError = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[InspectElementError]
  }
  
  extension [Self <: InspectElementError](x: Self) {
    
    inline def setErrorType(value: user | `unknown-hook` | uncaught): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResponseID(value: Double): Self = StObject.set(x, "responseID", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
