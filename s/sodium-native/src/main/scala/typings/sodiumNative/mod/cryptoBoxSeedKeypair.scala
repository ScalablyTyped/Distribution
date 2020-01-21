package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_box_seed_keypair")
@js.native
object cryptoBoxSeedKeypair extends js.Object {
  def apply(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
}

