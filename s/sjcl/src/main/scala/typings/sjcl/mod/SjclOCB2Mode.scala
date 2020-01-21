package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclOCB2Mode extends js.Object {
  def decrypt(prp: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def decrypt(prp: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def decrypt(prp: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def decrypt(
    prp: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def encrypt(prp: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def encrypt(
    prp: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def pmac(prp: SjclCipher, adata: BitArray_): js.Array[Double] = js.native
}

