package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_kx_seed_keypair")
@js.native
object cryptoKxSeedKeypair extends js.Object {
  
  def apply(publicKey: Buffer, secretKey: Buffer, seed: Buffer): Unit = js.native
}
