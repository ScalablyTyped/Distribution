package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclJson extends js.Object {
  @JSName("decrypt")
  var decrypt_Original: SjclConveninceDecryptor = js.native
  @JSName("encrypt")
  var encrypt_Original: SjclConveninceEncryptor = js.native
  def decode(obj: String): js.Object = js.native
  def decrypt(password: String, ciphertext: String): String = js.native
  def decrypt(password: String, ciphertext: String, params: SjclCipherDecryptParams): String = js.native
  def decrypt(password: String, ciphertext: String, params: SjclCipherDecryptParams, rp: SjclCipherDecrypted): String = js.native
  def decrypt(password: String, ciphertext: SjclCipherEncrypted): String = js.native
  def decrypt(password: String, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String = js.native
  def decrypt(
    password: String,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String = js.native
  def decrypt(password: BitArray, ciphertext: SjclCipherEncrypted): String = js.native
  def decrypt(password: BitArray, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String = js.native
  def decrypt(
    password: BitArray,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String = js.native
  def decrypt(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted): String = js.native
  def decrypt(password: SjclElGamalSecretKey, ciphertext: SjclCipherEncrypted, params: SjclCipherDecryptParams): String = js.native
  def decrypt(
    password: SjclElGamalSecretKey,
    ciphertext: SjclCipherEncrypted,
    params: SjclCipherDecryptParams,
    rp: SjclCipherDecrypted
  ): String = js.native
  def encode(obj: js.Object): String = js.native
  def encrypt(password: String, plaintext: String): SjclCipherEncrypted = js.native
  def encrypt(password: String, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def encrypt(password: String, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted = js.native
  def encrypt(password: BitArray, plaintext: String): SjclCipherEncrypted = js.native
  def encrypt(password: BitArray, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def encrypt(password: BitArray, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted = js.native
  def encrypt(password: SjclElGamalPublicKey, plaintext: String): SjclCipherEncrypted = js.native
  def encrypt(password: SjclElGamalPublicKey, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def encrypt(
    password: SjclElGamalPublicKey,
    plaintext: String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
}

