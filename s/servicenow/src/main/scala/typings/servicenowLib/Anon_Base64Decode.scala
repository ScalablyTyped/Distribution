package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64Decode extends js.Object {
  def base64Decode(value: java.lang.String): java.lang.String
  def base64DecodeAsBytes(value: java.lang.String): js.Any
  def escapeHTML(value: java.lang.String): java.lang.String
  def getStringFromStream(stream: js.Object): java.lang.String
}

object Anon_Base64Decode {
  @scala.inline
  def apply(
    base64Decode: java.lang.String => java.lang.String,
    base64DecodeAsBytes: java.lang.String => js.Any,
    escapeHTML: java.lang.String => java.lang.String,
    getStringFromStream: js.Object => java.lang.String
  ): Anon_Base64Decode = {
    val __obj = js.Dynamic.literal(base64Decode = js.Any.fromFunction1(base64Decode), base64DecodeAsBytes = js.Any.fromFunction1(base64DecodeAsBytes), escapeHTML = js.Any.fromFunction1(escapeHTML), getStringFromStream = js.Any.fromFunction1(getStringFromStream))
  
    __obj.asInstanceOf[Anon_Base64Decode]
  }
}

