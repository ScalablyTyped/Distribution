package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCodecs extends js.Object {
  var base64: SjclCodec[java.lang.String]
  var base64url: SjclCodec[java.lang.String]
  var bytes: SjclCodec[js.Array[scala.Double]]
  var hex: SjclCodec[java.lang.String]
  var utf8String: SjclCodec[java.lang.String]
}

object SjclCodecs {
  @scala.inline
  def apply(
    base64: SjclCodec[java.lang.String],
    base64url: SjclCodec[java.lang.String],
    bytes: SjclCodec[js.Array[scala.Double]],
    hex: SjclCodec[java.lang.String],
    utf8String: SjclCodec[java.lang.String]
  ): SjclCodecs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base64")(base64)
    __obj.updateDynamic("base64url")(base64url)
    __obj.updateDynamic("bytes")(bytes)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("utf8String")(utf8String)
    __obj.asInstanceOf[SjclCodecs]
  }
}

