package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.LedgerHeaderExt")
@js.native
class LedgerHeaderExt ()
  extends typings.stellarBase.xdrMod.default.LedgerHeaderExt

/* static members */
@JSImport("stellar-base", "xdr.LedgerHeaderExt")
@js.native
object LedgerHeaderExt extends js.Object {
  def `0`(): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderExt): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderExt): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderExt, io: Buffer): Unit = js.native
}

