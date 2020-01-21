package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_hash_sha256")
@js.native
object cryptoHashSha256 extends js.Object {
  def apply(output: Buffer, input: Buffer): Unit = js.native
}

