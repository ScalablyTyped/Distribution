package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.SurveyRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
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
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequest(value: SurveyRequestMessage): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSignature(value: Buffer): Self = this.set("requestSignature", value.asInstanceOf[js.Any])
  }
}
