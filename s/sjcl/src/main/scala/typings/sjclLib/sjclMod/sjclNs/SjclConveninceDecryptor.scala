package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclConveninceDecryptor extends js.Object {
  def apply(password: java.lang.String, ciphertext: java.lang.String): java.lang.String = js.native
  def apply(password: java.lang.String, ciphertext: java.lang.String, params: SjclCipherDecryptParams): java.lang.String = js.native
  def apply(
    password: java.lang.String,
    ciphertext: java.lang.String,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def apply(password: java.lang.String, ciphertext: SjclCipherEncrypted): java.lang.String = js.native
  def apply(password: java.lang.String, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): java.lang.String = js.native
  def apply(
    password: java.lang.String,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def apply(password: BitArray, ciphertext: SjclCipherEncrypted): java.lang.String = js.native
  def apply(password: BitArray, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): java.lang.String = js.native
  def apply(
    password: BitArray,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def apply(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted): java.lang.String = js.native
  def apply(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): java.lang.String = js.native
  def apply(
    password: SjclElGamalSecretKey,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
}

