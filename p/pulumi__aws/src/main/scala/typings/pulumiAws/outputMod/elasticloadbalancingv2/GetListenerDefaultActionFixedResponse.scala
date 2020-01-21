package typings.pulumiAws.outputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionFixedResponse extends js.Object {
  var contentType: String = js.native
  var messageBody: String = js.native
  var statusCode: String = js.native
}

object GetListenerDefaultActionFixedResponse {
  @scala.inline
  def apply(contentType: String, messageBody: String, statusCode: String): GetListenerDefaultActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], messageBody = messageBody.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetListenerDefaultActionFixedResponse]
  }
}

