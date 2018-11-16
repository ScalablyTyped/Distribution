package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SjclEcdsaPublicKey extends SjclECCPublicKey {
  def verify(hash: BitArray, rs: BitArray, fakeLegacyVersion: scala.Boolean): scala.Boolean
}

