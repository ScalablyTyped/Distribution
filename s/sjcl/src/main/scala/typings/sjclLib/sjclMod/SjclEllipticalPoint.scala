package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclEllipticalPoint extends js.Object {
  def isValid(): scala.Boolean
  def mult(k: BigNumber): SjclEllipticalPoint
  def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint
  def multiples(): js.Array[SjclEllipticalPoint]
  def toBits(): BitArray
  def toJac(): SjclPointJacobian
}

object SjclEllipticalPoint {
  @scala.inline
  def apply(
    isValid: () => scala.Boolean,
    mult: BigNumber => SjclEllipticalPoint,
    mult2: (BigNumber, BigNumber, SjclEllipticalPoint) => SjclEllipticalPoint,
    multiples: () => js.Array[SjclEllipticalPoint],
    toBits: () => BitArray,
    toJac: () => SjclPointJacobian
  ): SjclEllipticalPoint = {
    val __obj = js.Dynamic.literal(isValid = js.Any.fromFunction0(isValid), mult = js.Any.fromFunction1(mult), mult2 = js.Any.fromFunction3(mult2), multiples = js.Any.fromFunction0(multiples), toBits = js.Any.fromFunction0(toBits), toJac = js.Any.fromFunction0(toJac))
  
    __obj.asInstanceOf[SjclEllipticalPoint]
  }
}

