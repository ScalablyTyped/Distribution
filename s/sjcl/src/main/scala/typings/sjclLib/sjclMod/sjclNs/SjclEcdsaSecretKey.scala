package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclEcdsaSecretKey extends SjclECCSecretKey {
  def sign(hash: BitArray, paranoia: scala.Double, fakeLegacyVersion: scala.Boolean): BitArray = js.native
  def sign(
    hash: BitArray,
    paranoia: scala.Double,
    fakeLegacyVersion: scala.Boolean,
    fixedKForTesting: BigNumber
  ): BitArray = js.native
}

