package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeMessageBody extends js.Object {
  var contentType: java.lang.String
  var messageBody: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: java.lang.String
}

object Anon_ContentTypeMessageBody {
  @scala.inline
  def apply(contentType: java.lang.String, statusCode: java.lang.String, messageBody: java.lang.String = null): Anon_ContentTypeMessageBody = {
    val __obj = js.Dynamic.literal(contentType = contentType, statusCode = statusCode)
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody)
    __obj.asInstanceOf[Anon_ContentTypeMessageBody]
  }
}

