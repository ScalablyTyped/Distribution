package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_kx_server_session_keys")
@js.native
object cryptoKxServerSessionKeys extends js.Object {
  
  def apply(rx: Null, tx: Null, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  def apply(rx: Null, tx: Buffer, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  def apply(rx: Buffer, tx: Null, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
  def apply(rx: Buffer, tx: Buffer, serverPublicKey: Buffer, serverSecretKey: Buffer, clientPublicKey: Buffer): Unit = js.native
}
