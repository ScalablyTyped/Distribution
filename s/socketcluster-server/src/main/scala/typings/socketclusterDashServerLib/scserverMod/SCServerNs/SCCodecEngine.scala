package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCCodecEngine extends js.Object {
  def decode(input: js.Any): js.Any
  def encode(`object`: js.Any): js.Any
}

object SCCodecEngine {
  @scala.inline
  def apply(decode: js.Function1[js.Any, js.Any], encode: js.Function1[js.Any, js.Any]): SCCodecEngine = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode)
  
    __obj.asInstanceOf[SCCodecEngine]
  }
}

