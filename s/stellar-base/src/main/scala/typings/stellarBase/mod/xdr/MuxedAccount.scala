package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.MuxedAccount")
@js.native
class MuxedAccount ()
  extends typings.stellarBase.xdrMod.default.MuxedAccount

/* static members */
@JSImport("stellar-base", "xdr.MuxedAccount")
@js.native
object MuxedAccount extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.MuxedAccount): Boolean = js.native
  def keyTypeEd25519(value: Buffer): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  def keyTypeMuxedEd25519(value: typings.stellarBase.xdrMod.xdr.MuxedAccountMed25519): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.MuxedAccount): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.MuxedAccount, io: Buffer): Unit = js.native
}

