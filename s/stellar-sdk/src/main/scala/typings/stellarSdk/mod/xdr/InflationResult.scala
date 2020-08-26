package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.InflationResult")
@js.native
class InflationResult ()
  extends typings.stellarBase.mod.xdr.InflationResult

/* static members */
@JSImport("stellar-sdk", "xdr.InflationResult")
@js.native
object InflationResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  def inflationSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.InflationPayout]): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InflationResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InflationResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InflationResult, io: Buffer): Unit = js.native
}

