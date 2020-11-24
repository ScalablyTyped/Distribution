package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_keypair")
@js.native
object cryptoBoxKeypair extends js.Object {
  
  def apply(publicKey: Buffer, secretKey: Buffer): Unit = js.native
}
