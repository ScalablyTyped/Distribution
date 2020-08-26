package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ScpHistoryEntry")
@js.native
class ScpHistoryEntry ()
  extends typings.stellarBase.mod.xdr.ScpHistoryEntry

/* static members */
@JSImport("stellar-sdk", "xdr.ScpHistoryEntry")
@js.native
object ScpHistoryEntry extends js.Object {
  def `0`(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntryV0): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntry): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntry): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntry, io: Buffer): Unit = js.native
}

