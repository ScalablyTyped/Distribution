package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "SignerKey")
@js.native
class SignerKey ()
  extends typings.stellarBase.xdrMod.xdr.SignerKey

/* static members */
@JSImport("stellar-base/types/xdr", "SignerKey")
@js.native
object SignerKey extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.SignerKey): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  def signerKeyTypeEd25519(value: Buffer): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  def signerKeyTypeHashX(value: Buffer): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  def signerKeyTypePreAuthTx(value: Buffer): typings.stellarBase.xdrMod.xdr.SignerKey = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.SignerKey): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.SignerKey, io: Buffer): Unit = js.native
}

