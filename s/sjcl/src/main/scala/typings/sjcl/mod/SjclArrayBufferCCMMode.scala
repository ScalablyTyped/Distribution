package typings.sjcl.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclArrayBufferCCMMode extends StObject {
  
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: Unit, tlen: Double): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: Unit, tlen: Double): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  
  def decrypt(prf: SjclCipher, ciphertext_buffer: ArrayBuffer, iv: BitArray_, tag: BitArray_): ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: Unit,
    tlen: Double
  ): ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: Unit,
    tlen: Double,
    ol: Double
  ): ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: Unit,
    tlen: Unit,
    ol: Double
  ): ArrayBuffer = js.native
  def decrypt(prf: SjclCipher, ciphertext_buffer: ArrayBuffer, iv: BitArray_, tag: BitArray_, adata: ArrayBuffer): ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: ArrayBuffer,
    tlen: Double
  ): ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: ArrayBuffer,
    tlen: Double,
    ol: Double
  ): ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: ArrayBuffer,
    tlen: Unit,
    ol: Double
  ): ArrayBuffer = js.native
  
  def encrypt(prf: SjclCipher, plaintext_buffer: ArrayBuffer, iv: BitArray_): ArrayBuffer = js.native
  def encrypt(prf: SjclCipher, plaintext_buffer: ArrayBuffer, iv: BitArray_, adata: Unit, tlen: Double): ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: ArrayBuffer,
    iv: BitArray_,
    adata: Unit,
    tlen: Double,
    ol: Double
  ): ArrayBuffer = js.native
  def encrypt(prf: SjclCipher, plaintext_buffer: ArrayBuffer, iv: BitArray_, adata: Unit, tlen: Unit, ol: Double): ArrayBuffer = js.native
  def encrypt(prf: SjclCipher, plaintext_buffer: ArrayBuffer, iv: BitArray_, adata: ArrayBuffer): ArrayBuffer = js.native
  def encrypt(prf: SjclCipher, plaintext_buffer: ArrayBuffer, iv: BitArray_, adata: ArrayBuffer, tlen: Double): ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: ArrayBuffer,
    iv: BitArray_,
    adata: ArrayBuffer,
    tlen: Double,
    ol: Double
  ): ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: ArrayBuffer,
    iv: BitArray_,
    adata: ArrayBuffer,
    tlen: Unit,
    ol: Double
  ): ArrayBuffer = js.native
}
