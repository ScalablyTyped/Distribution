package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclPointJacobian extends js.Object {
  def add(T: SjclEllipticalPoint): SjclPointJacobian
  def doubl(): SjclPointJacobian
  def isValid(): scala.Boolean
  def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian
  def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian
  def toAffine(): SjclEllipticalPoint
}

object SjclPointJacobian {
  @scala.inline
  def apply(
    add: js.Function1[SjclEllipticalPoint, SjclPointJacobian],
    doubl: js.Function0[SjclPointJacobian],
    isValid: js.Function0[scala.Boolean],
    mult: js.Function2[BigNumber, SjclEllipticalPoint, SjclPointJacobian],
    mult2: js.Function4[BigNumber, SjclEllipticalPoint, BigNumber, SjclEllipticalPoint, SjclPointJacobian],
    toAffine: js.Function0[SjclEllipticalPoint]
  ): SjclPointJacobian = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("doubl")(doubl)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("mult")(mult)
    __obj.updateDynamic("mult2")(mult2)
    __obj.updateDynamic("toAffine")(toAffine)
    __obj.asInstanceOf[SjclPointJacobian]
  }
}

