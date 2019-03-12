package typings
package reactDashNativeDashFetchDashBlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decode extends js.Object {
  def decode(input: java.lang.String): java.lang.String
  def encode(input: java.lang.String): java.lang.String
}

object Anon_Decode {
  @scala.inline
  def apply(decode: java.lang.String => java.lang.String, encode: java.lang.String => java.lang.String): Anon_Decode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_Decode]
  }
}

