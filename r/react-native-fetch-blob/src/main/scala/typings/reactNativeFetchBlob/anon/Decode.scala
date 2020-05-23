package typings.reactNativeFetchBlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decode extends js.Object {
  def decode(input: String): String
  def encode(input: String): String
}

object Decode {
  @scala.inline
  def apply(decode: String => String, encode: String => String): Decode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Decode]
  }
}

