package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SjclElGamalSecretKey extends SjclECCSecretKey {
  def dh(pk: SjclECCPublicKey): BitArray
  def unkem(tag: BitArray): BitArray
}

