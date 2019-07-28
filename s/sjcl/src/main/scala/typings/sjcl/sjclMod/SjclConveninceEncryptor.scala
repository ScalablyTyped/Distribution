package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclConveninceEncryptor extends js.Object {
  def apply(password: String, plaintext: String): SjclCipherEncrypted = js.native
  def apply(password: String, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(password: String, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted = js.native
  def apply(password: BitArray, plaintext: String): SjclCipherEncrypted = js.native
  def apply(password: BitArray, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(password: BitArray, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted = js.native
  def apply(password: SjclElGamalPublicKey, plaintext: String): SjclCipherEncrypted = js.native
  def apply(password: SjclElGamalPublicKey, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(
    password: SjclElGamalPublicKey,
    plaintext: String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
}

