package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.SurveyRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  var request: SurveyRequestMessage = js.native
  
  var requestSignature: Buffer = js.native
}
object Request {
  
  @scala.inline
  def apply(request: SurveyRequestMessage, requestSignature: Buffer): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], requestSignature = requestSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: SurveyRequestMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSignature(value: Buffer): Self = StObject.set(x, "requestSignature", value.asInstanceOf[js.Any])
  }
}
