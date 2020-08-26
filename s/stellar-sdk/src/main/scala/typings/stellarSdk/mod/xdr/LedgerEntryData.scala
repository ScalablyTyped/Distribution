package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.LedgerEntryData")
@js.native
class LedgerEntryData ()
  extends typings.stellarBase.mod.xdr.LedgerEntryData

/* static members */
@JSImport("stellar-sdk", "xdr.LedgerEntryData")
@js.native
object LedgerEntryData extends js.Object {
  def account(value: typings.stellarBase.xdrMod.xdr.AccountEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  def datum(value: typings.stellarBase.xdrMod.xdr.DataEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerEntryData): Boolean = js.native
  def offer(value: typings.stellarBase.xdrMod.xdr.OfferEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerEntryData): Buffer = js.native
  def trustline(value: typings.stellarBase.xdrMod.xdr.TrustLineEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerEntryData, io: Buffer): Unit = js.native
}

