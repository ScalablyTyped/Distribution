package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEllipticalCurve extends js.Object {
  def fromBits(bits: BitArray): SjclEllipticalPoint
}

object SjclEllipticalCurve {
  @scala.inline
  def apply(fromBits: js.Function1[BitArray, SjclEllipticalPoint]): SjclEllipticalCurve = {
    val __obj = js.Dynamic.literal(fromBits = fromBits)
  
    __obj.asInstanceOf[SjclEllipticalCurve]
  }
}

