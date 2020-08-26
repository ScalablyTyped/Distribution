package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.SurveyResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
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
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setResponse(value: SurveyResponseMessage): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseSignature(value: Buffer): Self = this.set("responseSignature", value.asInstanceOf[js.Any])
  }
  
}

