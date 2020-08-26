package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.PublicKey")
@js.native
class PublicKey ()
  extends typings.stellarBase.mod.xdr.PublicKey

/* static members */
@JSImport("stellar-sdk", "xdr.PublicKey")
@js.native
object PublicKey extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PublicKey): Boolean = js.native
  def publicKeyTypeEd25519(value: Buffer): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PublicKey): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PublicKey, io: Buffer): Unit = js.native
}

