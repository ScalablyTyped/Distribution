package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ManageBuyOfferResult")
@js.native
class ManageBuyOfferResult ()
  extends typings.stellarBase.mod.xdr.ManageBuyOfferResult
object ManageBuyOfferResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.manageBuyOfferSuccess")
  @js.native
  def manageBuyOfferSuccess(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ManageBuyOfferResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult, io: Buffer): Unit = js.native
}
