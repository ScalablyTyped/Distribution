package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.StellarValueExt")
@js.native
class StellarValueExt ()
  extends typings.stellarBase.xdrMod.default.StellarValueExt

/* static members */
@JSImport("stellar-base", "xdr.StellarValueExt")
@js.native
object StellarValueExt extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.StellarValueExt): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def stellarValueBasic(): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def stellarValueSigned(value: typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.StellarValueExt): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.StellarValueExt, io: Buffer): Unit = js.native
}

