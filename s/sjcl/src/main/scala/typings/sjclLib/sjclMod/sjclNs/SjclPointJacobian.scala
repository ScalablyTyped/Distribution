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

