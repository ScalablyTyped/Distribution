package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.PathPaymentStrictSendResult")
@js.native
class PathPaymentStrictSendResult ()
  extends typings.stellarBase.xdrMod.default.PathPaymentStrictSendResult
object PathPaymentStrictSendResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.pathPaymentStrictSendNoIssuer")
  @js.native
  def pathPaymentStrictSendNoIssuer(value: typings.stellarBase.xdrMod.xdr.Asset): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.pathPaymentStrictSendSuccess")
  @js.native
  def pathPaymentStrictSendSuccess(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PathPaymentStrictSendResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult, io: Buffer): Unit = js.native
}
