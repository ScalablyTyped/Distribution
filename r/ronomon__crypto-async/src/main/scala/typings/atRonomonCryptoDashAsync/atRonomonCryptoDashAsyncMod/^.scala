package typings.atRonomonCryptoDashAsync.atRonomonCryptoDashAsyncMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ronomon/crypto-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    iv: Buffer,
    plaintext: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* ciphertext */ Buffer, Unit]
  ): Unit = js.native
  def cipher(
    algorithm: String,
    cipherDirection: CipherDirection,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    iv: Buffer,
    ivOffset: Double,
    ivSize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  def hash(
    algorithm: String,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hash */ Buffer, Unit]
  ): Unit = js.native
  def hash(
    algorithm: String,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  def hmac(
    algorithm: String,
    key: Buffer,
    keyOffset: Double,
    keySize: Double,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
  def hmac(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hmac */ Buffer, Unit]
  ): Unit = js.native
}

