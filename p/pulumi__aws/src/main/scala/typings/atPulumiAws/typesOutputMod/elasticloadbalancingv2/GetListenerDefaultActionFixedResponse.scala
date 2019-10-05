package typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerDefaultActionFixedResponse extends js.Object {
  var contentType: String
  var messageBody: String
  var statusCode: String
}

object GetListenerDefaultActionFixedResponse {
  @scala.inline
  def apply(contentType: String, messageBody: String, statusCode: String): GetListenerDefaultActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType, messageBody = messageBody, statusCode = statusCode)
  
    __obj.asInstanceOf[GetListenerDefaultActionFixedResponse]
  }
}

