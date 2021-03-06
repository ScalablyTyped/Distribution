package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ManageSellOfferResult")
@js.native
class ManageSellOfferResult ()
  extends typings.stellarBase.mod.xdr.ManageSellOfferResult
object ManageSellOfferResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.manageSellOfferSuccess")
  @js.native
  def manageSellOfferSuccess(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageSellOfferResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult, io: Buffer): Unit = js.native
}
