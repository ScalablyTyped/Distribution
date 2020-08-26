package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.AccountEntryV1Ext")
@js.native
class AccountEntryV1Ext ()
  extends typings.stellarBase.xdrMod.default.AccountEntryV1Ext

/* static members */
@JSImport("stellar-base", "xdr.AccountEntryV1Ext")
@js.native
object AccountEntryV1Ext extends js.Object {
  def `0`(): typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntryV1Ext, io: Buffer): Unit = js.native
}

