package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ManageSellOfferResult")
@js.native
class ManageSellOfferResult ()
  extends typings.stellarBase.xdrMod.default.ManageSellOfferResult
object ManageSellOfferResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.manageSellOfferSuccess")
  @js.native
  def manageSellOfferSuccess(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ManageSellOfferResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult, io: Buffer): Unit = js.native
}
