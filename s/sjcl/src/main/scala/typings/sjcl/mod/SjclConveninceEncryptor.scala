package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclConveninceEncryptor extends js.Object {
  def apply(password: String, plaintext: String): SjclCipherEncrypted = js.native
  def apply(password: String, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(password: String, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted = js.native
  def apply(password: BitArray_, plaintext: String): SjclCipherEncrypted = js.native
  def apply(password: BitArray_, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(password: BitArray_, plaintext: String, params: SjclCipherEncryptParams, rp: SjclCipherEncrypted): SjclCipherEncrypted = js.native
  def apply(password: SjclElGamalPublicKey, plaintext: String): SjclCipherEncrypted = js.native
  def apply(password: SjclElGamalPublicKey, plaintext: String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(
    password: SjclElGamalPublicKey,
    plaintext: String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
}

