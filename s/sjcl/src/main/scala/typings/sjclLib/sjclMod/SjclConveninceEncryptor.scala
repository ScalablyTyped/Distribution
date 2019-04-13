package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclConveninceEncryptor extends js.Object {
  def apply(password: java.lang.String, plaintext: java.lang.String): SjclCipherEncrypted = js.native
  def apply(password: java.lang.String, plaintext: java.lang.String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(
    password: java.lang.String,
    plaintext: java.lang.String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
  def apply(password: BitArray, plaintext: java.lang.String): SjclCipherEncrypted = js.native
  def apply(password: BitArray, plaintext: java.lang.String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(
    password: BitArray,
    plaintext: java.lang.String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
  def apply(password: SjclElGamalPublicKey, plaintext: java.lang.String): SjclCipherEncrypted = js.native
  def apply(password: SjclElGamalPublicKey, plaintext: java.lang.String, params: SjclCipherEncryptParams): SjclCipherEncrypted = js.native
  def apply(
    password: SjclElGamalPublicKey,
    plaintext: java.lang.String,
    params: SjclCipherEncryptParams,
    rp: SjclCipherEncrypted
  ): SjclCipherEncrypted = js.native
}

