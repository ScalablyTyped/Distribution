package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer")
@js.native
class ManageOfferSuccessResultOffer ()
  extends typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer
object ManageOfferSuccessResultOffer {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.manageOfferCreated")
  @js.native
  def manageOfferCreated(value: typings.stellarBase.xdrMod.xdr.OfferEntry): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.manageOfferUpdated")
  @js.native
  def manageOfferUpdated(value: typings.stellarBase.xdrMod.xdr.OfferEntry): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ManageOfferSuccessResultOffer.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer, io: Buffer): Unit = js.native
}
