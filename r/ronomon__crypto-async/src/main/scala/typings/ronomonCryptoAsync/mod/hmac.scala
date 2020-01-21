package typings.ronomonCryptoAsync.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ronomon/crypto-async", "hmac")
@js.native
object hmac extends js.Object {
  def apply(
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
  def apply(
    algorithm: String,
    key: Buffer,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hmac */ Buffer, Unit]
  ): Unit = js.native
}

