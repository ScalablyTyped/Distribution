package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TrustLineEntryExt")
@js.native
class TrustLineEntryExt ()
  extends typings.stellarBase.xdrMod.xdr.TrustLineEntryExt

/* static members */
@JSImport("stellar-base/types/xdr", "TrustLineEntryExt")
@js.native
object TrustLineEntryExt extends js.Object {
  def `0`(): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def `1`(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryV1): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryExt): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryExt): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryExt, io: Buffer): Unit = js.native
}

