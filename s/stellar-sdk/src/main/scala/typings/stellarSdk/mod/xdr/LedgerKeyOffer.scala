package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.SellerId
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerKeyOffer")
@js.native
class LedgerKeyOffer protected ()
  extends typings.stellarBase.mod.xdr.LedgerKeyOffer {
  def this(attributes: SellerId) = this()
}
object LedgerKeyOffer {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyOffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyOffer.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer, io: Buffer): Unit = js.native
}
