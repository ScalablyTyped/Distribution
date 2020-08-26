package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.CloseTime
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "StellarValue")
@js.native
class StellarValue protected ()
  extends typings.stellarBase.xdrMod.xdr.StellarValue {
  def this(attributes: CloseTime) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "StellarValue")
@js.native
object StellarValue extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.StellarValue = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.StellarValue = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.StellarValue = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.StellarValue = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.StellarValue): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.StellarValue = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.StellarValue): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.StellarValue, io: Buffer): Unit = js.native
}

