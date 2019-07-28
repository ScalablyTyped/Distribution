package typings.rnDashFetchDashBlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decode extends js.Object {
  def decode(input: String): String
  def encode(input: String): String
}

object Anon_Decode {
  @scala.inline
  def apply(decode: String => String, encode: String => String): Anon_Decode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_Decode]
  }
}

