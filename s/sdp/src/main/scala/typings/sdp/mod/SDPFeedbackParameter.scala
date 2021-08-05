package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPFeedbackParameter extends StObject {
  
  var parameter: String
  
  var `type`: String
}
object SDPFeedbackParameter {
  
  inline def apply(parameter: String, `type`: String): SDPFeedbackParameter = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPFeedbackParameter]
  }
  
  extension [Self <: SDPFeedbackParameter](x: Self) {
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
