package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_kx_client_session_keys")
@js.native
object crypto_kx_client_session_keys extends js.Object {
  def apply(rx: Null, tx: Null, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  def apply(rx: Null, tx: Buffer, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  def apply(rx: Buffer, tx: Null, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
  def apply(rx: Buffer, tx: Buffer, clientPublicKey: Buffer, clientSecretKey: Buffer, serverPublicKey: Buffer): Unit = js.native
}

