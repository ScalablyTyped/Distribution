package typings.rfc4648.libSrcCodecMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var bits: Double
  var chars: String
  var codes: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(bits: Double, chars: String, codes: StringDictionary[Double] = null): Encoding = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
    if (codes != null) __obj.updateDynamic("codes")(codes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

