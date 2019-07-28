package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeMessageBody extends js.Object {
  var contentType: String
  var messageBody: js.UndefOr[String] = js.undefined
  var statusCode: String
}

object Anon_ContentTypeMessageBody {
  @scala.inline
  def apply(contentType: String, statusCode: String, messageBody: String = null): Anon_ContentTypeMessageBody = {
    val __obj = js.Dynamic.literal(contentType = contentType, statusCode = statusCode)
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody)
    __obj.asInstanceOf[Anon_ContentTypeMessageBody]
  }
}

