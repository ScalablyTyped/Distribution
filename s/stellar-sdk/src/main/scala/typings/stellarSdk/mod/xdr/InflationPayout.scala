package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.AmountDestination
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.InflationPayout")
@js.native
class InflationPayout protected ()
  extends typings.stellarBase.mod.xdr.InflationPayout {
  def this(attributes: AmountDestination) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.InflationPayout")
@js.native
object InflationPayout extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InflationPayout = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InflationPayout = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InflationPayout = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InflationPayout = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InflationPayout): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InflationPayout = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InflationPayout): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InflationPayout, io: Buffer): Unit = js.native
}

