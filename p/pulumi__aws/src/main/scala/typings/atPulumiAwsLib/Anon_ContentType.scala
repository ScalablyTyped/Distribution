package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var contentType: java.lang.String
  var messageBody: java.lang.String
  var statusCode: java.lang.String
}

object Anon_ContentType {
  @scala.inline
  def apply(contentType: java.lang.String, messageBody: java.lang.String, statusCode: java.lang.String): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("messageBody")(messageBody)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

