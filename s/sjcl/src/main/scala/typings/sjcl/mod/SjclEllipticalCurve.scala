package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEllipticalCurve extends js.Object {
  def fromBits(bits: BitArray_): SjclEllipticalPoint
}

object SjclEllipticalCurve {
  @scala.inline
  def apply(fromBits: BitArray_ => SjclEllipticalPoint): SjclEllipticalCurve = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits))
  
    __obj.asInstanceOf[SjclEllipticalCurve]
  }
}

