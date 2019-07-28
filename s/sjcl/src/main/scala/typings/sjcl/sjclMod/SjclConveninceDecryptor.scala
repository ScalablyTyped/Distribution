package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclConveninceDecryptor extends js.Object {
  def apply(password: String, ciphertext: String): String = js.native
  def apply(password: String, ciphertext: String, params: SjclCipherDecryptParams): String = js.native
  def apply(password: String, ciphertext: String, params: SjclCipherDecryptParams, rp: SjclCipherDecrypted): String = js.native
  def apply(password: String, ciphertext: SjclCipherEncrypted): String = js.native
  def apply(password: String, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String = js.native
  def apply(
    password: String,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String = js.native
  def apply(password: BitArray, ciphertext: SjclCipherEncrypted): String = js.native
  def apply(password: BitArray, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String = js.native
  def apply(
    password: BitArray,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String = js.native
  def apply(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted): String = js.native
  def apply(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String = js.native
  def apply(
    password: SjclElGamalSecretKey,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String = js.native
}

