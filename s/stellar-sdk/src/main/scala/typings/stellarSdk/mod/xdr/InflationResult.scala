package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.InflationResult")
@js.native
class InflationResult ()
  extends typings.stellarBase.mod.xdr.InflationResult
object InflationResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.inflationSuccess")
  @js.native
  def inflationSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.InflationPayout]): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InflationResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InflationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InflationResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.InflationResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InflationResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InflationResult, io: Buffer): Unit = js.native
}
