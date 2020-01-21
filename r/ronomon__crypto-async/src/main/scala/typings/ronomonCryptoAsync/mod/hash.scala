package typings.ronomonCryptoAsync.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ronomon/crypto-async", "hash")
@js.native
object hash extends js.Object {
  def apply(
    algorithm: String,
    source: Buffer,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* hash */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    algorithm: String,
    source: Buffer,
    sourceOffset: Double,
    sourceSize: Double,
    target: Buffer,
    targetOffset: Double,
    cb: js.Function2[/* error */ js.UndefOr[Error], /* targetSize */ Double, Unit]
  ): Unit = js.native
}

