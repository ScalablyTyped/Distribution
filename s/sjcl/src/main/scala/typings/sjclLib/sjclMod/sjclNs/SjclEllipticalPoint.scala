package typings
package sjclLib.sjclMod.sjclNs

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

