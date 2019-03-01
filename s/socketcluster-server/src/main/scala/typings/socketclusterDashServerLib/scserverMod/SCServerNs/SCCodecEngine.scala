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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[SCCodecEngine]
  }
}

