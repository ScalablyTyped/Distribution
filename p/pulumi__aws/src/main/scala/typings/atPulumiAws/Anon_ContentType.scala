package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: String
  var messageBody: String
  var statusCode: String
}

object Anon_ContentType {
  @scala.inline
  def apply(contentType: String, messageBody: String, statusCode: String): Anon_ContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType, messageBody = messageBody, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_ContentType]
  }
}

