package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleActionFixedResponse extends js.Object {
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: String
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[String] = js.undefined
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: String
}

object ListenerRuleActionFixedResponse {
  @scala.inline
  def apply(contentType: String, statusCode: String, messageBody: String = null): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType, statusCode = statusCode)
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody)
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
}

