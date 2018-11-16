package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclJson extends js.Object {
  @JSName("decrypt")
  var decrypt_Original: SjclConveninceDecryptor = js.native
  @JSName("encrypt")
  var encrypt_Original: SjclConveninceEncryptor = js.native
  def decode(obj: java.lang.String): js.Object = js.native
  def decrypt(password: java.lang.String, ciphertext: java.lang.String): java.lang.String = js.native
  def decrypt(password: java.lang.String, ciphertext: java.lang.String, params: SjclCipherDecryptParams): java.lang.String = js.native
  def decrypt(
    password: java.lang.String,
    ciphertext: java.lang.String,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def decrypt(password: java.lang.String, ciphertext: SjclCipherEncrypted): java.lang.String = js.native
  def decrypt(password: java.lang.String, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): java.lang.String = js.native
  def decrypt(
    password: java.lang.String,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def decrypt(password: BitArray, ciphertext: SjclCipherEncrypted): java.lang.String = js.native
  def decrypt(password: BitArray, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): java.lang.String = js.native
  def decrypt(
    password: BitArray,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def decrypt(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted): java.lang.String = js.native
  def decrypt(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): java.lang.String = js.native
  def decrypt(
    password: SjclElGamalSecretKey,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): java.lang.String = js.native
  def encode(obj: js.Object): java.lang.String = js.native
  def encrypt(password: java.lang.String, plaintext: java.lang.String): SjclCipherEncrypted = js.native
  def encrypt(password: java.lang.String, plaintext: java.lang.String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def encrypt(
    password: java.lang.String,
    plaintext: java.lang.String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
  def encrypt(password: BitArray, plaintext: java.lang.String): SjclCipherEncrypted = js.native
  def encrypt(password: BitArray, plaintext: java.lang.String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def encrypt(
    password: BitArray,
    plaintext: java.lang.String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
  def encrypt(password: SjclElGamalPublicKey, plaintext: java.lang.String): SjclCipherEncrypted = js.native
  def encrypt(password: SjclElGamalPublicKey, plaintext: java.lang.String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def encrypt(
    password: SjclElGamalPublicKey,
    plaintext: java.lang.String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
}

