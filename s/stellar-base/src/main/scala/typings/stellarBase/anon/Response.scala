package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.SurveyResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends StObject {
  
  var response: SurveyResponseMessage = js.native
  
  var responseSignature: Buffer = js.native
}
object Response {
  
  @scala.inline
  def apply(response: SurveyResponseMessage, responseSignature: Buffer): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseSignature = responseSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: SurveyResponseMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseSignature(value: Buffer): Self = StObject.set(x, "responseSignature", value.asInstanceOf[js.Any])
  }
}
