package typings
package rnDashFetchDashBlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decode extends js.Object {
  def decode(input: java.lang.String): java.lang.String
  def encode(input: java.lang.String): java.lang.String
}

object Anon_Decode {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, java.lang.String],
    encode: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Decode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[Anon_Decode]
  }
}

