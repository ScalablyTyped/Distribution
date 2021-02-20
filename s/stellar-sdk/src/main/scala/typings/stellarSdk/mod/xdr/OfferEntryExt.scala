package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OfferEntryExt")
@js.native
class OfferEntryExt ()
  extends typings.stellarBase.mod.xdr.OfferEntryExt
object OfferEntryExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OfferEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OfferEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OfferEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OfferEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.OfferEntryExt = js.native
}
