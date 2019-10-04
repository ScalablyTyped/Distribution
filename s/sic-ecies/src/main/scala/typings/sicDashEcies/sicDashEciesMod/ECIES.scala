package typings.sicDashEcies.sicDashEciesMod

import typings.bitcoreDashLib.bitcoreDashLibMod.PrivateKey
import typings.bitcoreDashLib.bitcoreDashLibMod.PublicKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECIES extends js.Object {
  var Rbuf: Buffer = js.native
  var kE: Buffer = js.native
  var kEkM: Buffer = js.native
  var kM: Buffer = js.native
  def apply(): ECIES = js.native
  def apply(opts: ECIESOptions): ECIES = js.native
  def decrypt(encbuf: Buffer): Buffer = js.native
  def encrypt(message: String): Buffer = js.native
  def encrypt(message: String, ivbuf: Buffer): Buffer = js.native
  def encrypt(message: Buffer): Buffer = js.native
  def encrypt(message: Buffer, ivbuf: Buffer): Buffer = js.native
  def privateKey(privateKey: PrivateKey): ECIES = js.native
  def publicKey(publicKey: PublicKey): ECIES = js.native
}

