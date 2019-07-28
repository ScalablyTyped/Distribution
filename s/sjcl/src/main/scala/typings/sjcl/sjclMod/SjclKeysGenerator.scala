package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclKeysGenerator[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends js.Object {
  def apply(curve: Double, paranoia: Double): SjclKeyPair[P, S] = js.native
  def apply(curve: Double, paranoia: Double, sec: BigNumber): SjclKeyPair[P, S] = js.native
  def apply(curve: SjclEllipticalCurve, paranoia: Double): SjclKeyPair[P, S] = js.native
  def apply(curve: SjclEllipticalCurve, paranoia: Double, sec: BigNumber): SjclKeyPair[P, S] = js.native
}

