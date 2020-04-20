package typings.reactNativeFetchBlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecode extends js.Object {
  def decode(input: String): String
  def encode(input: String): String
}

object AnonDecode {
  @scala.inline
  def apply(decode: String => String, encode: String => String): AnonDecode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[AnonDecode]
  }
}

