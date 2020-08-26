package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclOCB2Mode extends js.Object {
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: js.UndefOr[scala.Nothing],
    premac: Boolean
  ): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: js.UndefOr[scala.Nothing],
    premac: Boolean
  ): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: js.UndefOr[scala.Nothing],
    premac: Boolean
  ): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: js.UndefOr[scala.Nothing],
    premac: Boolean
  ): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: BitArray_,
    tlen: Double,
    premac: Boolean
  ): BitArray_ = js.native
  def pmac(prf: SjclCipher, adata: BitArray_): js.Array[Double] = js.native
}

