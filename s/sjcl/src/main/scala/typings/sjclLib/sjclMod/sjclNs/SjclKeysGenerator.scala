package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclKeysGenerator[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends js.Object {
  def apply(curve: scala.Double, paranoia: scala.Double): SjclKeyPair[P, S] = js.native
  def apply(curve: scala.Double, paranoia: scala.Double, sec: BigNumber): SjclKeyPair[P, S] = js.native
  def apply(curve: SjclEllipticalCurve, paranoia: scala.Double): SjclKeyPair[P, S] = js.native
  def apply(curve: SjclEllipticalCurve, paranoia: scala.Double, sec: BigNumber): SjclKeyPair[P, S] = js.native
}

