package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclPointJacobian extends js.Object {
  def add(T: SjclEllipticalPoint): SjclPointJacobian
  def doubl(): SjclPointJacobian
  def isValid(): Boolean
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian
  def negate(): SjclPointJacobian
  def toAffine(): SjclEllipticalPoint
}

object SjclPointJacobian {
  @scala.inline
  def apply(
    add: SjclEllipticalPoint => SjclPointJacobian,
    doubl: () => SjclPointJacobian,
    isValid: () => Boolean,
    mult: (BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    mult2: (BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint) => SjclPointJacobian,
    negate: () => SjclPointJacobian,
    toAffine: () => SjclEllipticalPoint
  ): SjclPointJacobian = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), doubl = js.Any.fromFunction0(doubl), isValid = js.Any.fromFunction0(isValid), mult = js.Any.fromFunction2(mult), mult2 = js.Any.fromFunction4(mult2), negate = js.Any.fromFunction0(negate), toAffine = js.Any.fromFunction0(toAffine))
    __obj.asInstanceOf[SjclPointJacobian]
  }
}

