package typings.atPulumiAws.typesInputMod.alb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleActionFixedResponse extends js.Object {
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: Input[String]
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[Input[String]] = js.undefined
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: js.UndefOr[Input[String]] = js.undefined
}

object ListenerRuleActionFixedResponse {
  @scala.inline
  def apply(contentType: Input[String], messageBody: Input[String] = null, statusCode: Input[String] = null): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
}

