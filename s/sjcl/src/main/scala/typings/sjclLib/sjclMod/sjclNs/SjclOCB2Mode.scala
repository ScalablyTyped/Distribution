package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclOCB2Mode extends js.Object {
  def decrypt(prp: SjclCipher, ciphertext: BitArray, iv: BitArray): BitArray = js.native
  def decrypt(prp: SjclCipher, ciphertext: BitArray, iv: BitArray, adata: BitArray): BitArray = js.native
  def decrypt(prp: SjclCipher, ciphertext: BitArray, iv: BitArray, adata: BitArray, tlen: scala.Double): BitArray = js.native
  def decrypt(
    prp: SjclCipher,
    ciphertext: BitArray,
    iv: BitArray,
    adata: BitArray,
    tlen: scala.Double,
    premac: scala.Boolean
  ): BitArray = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray, iv: BitArray): BitArray = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray, iv: BitArray, adata: BitArray): BitArray = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray, iv: BitArray, adata: BitArray, tlen: scala.Double): BitArray = js.native
  def encrypt(
    prp: SjclCipher,
    plaintext: BitArray,
    iv: BitArray,
    adata: BitArray,
    tlen: scala.Double,
    premac: scala.Boolean
  ): BitArray = js.native
  def pmac(prp: SjclCipher, adata: BitArray): js.Array[scala.Double] = js.native
}

