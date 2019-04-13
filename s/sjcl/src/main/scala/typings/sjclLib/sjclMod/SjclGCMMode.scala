package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclGCMMode extends js.Object {
  def decrypt(prp: SjclCipher, ciphertext: BitArray, iv: BitArray): BitArray = js.native
  def decrypt(prp: SjclCipher, ciphertext: BitArray, iv: BitArray, adata: BitArray): BitArray = js.native
  def decrypt(prp: SjclCipher, ciphertext: BitArray, iv: BitArray, adata: BitArray, tlen: scala.Double): BitArray = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray, iv: BitArray): BitArray = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray, iv: BitArray, adata: BitArray): BitArray = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray, iv: BitArray, adata: BitArray, tlen: scala.Double): BitArray = js.native
}

