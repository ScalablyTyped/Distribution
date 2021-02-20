package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPFeedbackParameter extends StObject {
  
  var parameter: String = js.native
  
  var `type`: String = js.native
}
object SDPFeedbackParameter {
  
  @scala.inline
  def apply(parameter: String, `type`: String): SDPFeedbackParameter = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPFeedbackParameter]
  }
  
  @scala.inline
  implicit class SDPFeedbackParameterMutableBuilder[Self <: SDPFeedbackParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
