package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeMessageBodyStatusCode extends js.Object {
  var contentType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var messageBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var statusCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ContentTypeMessageBodyStatusCode {
  @scala.inline
  def apply(
    contentType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    messageBody: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statusCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ContentTypeMessageBodyStatusCode = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentTypeMessageBodyStatusCode]
  }
}

