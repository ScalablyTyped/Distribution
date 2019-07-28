package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeMessageBodyStatusCode extends js.Object {
  var contentType: Input[String]
  var messageBody: js.UndefOr[Input[String]] = js.undefined
  var statusCode: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ContentTypeMessageBodyStatusCode {
  @scala.inline
  def apply(contentType: Input[String], messageBody: Input[String] = null, statusCode: Input[String] = null): Anon_ContentTypeMessageBodyStatusCode = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentTypeMessageBodyStatusCode]
  }
}

