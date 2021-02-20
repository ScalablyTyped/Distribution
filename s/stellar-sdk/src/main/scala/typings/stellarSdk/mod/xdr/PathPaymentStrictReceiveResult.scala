package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult")
@js.native
class PathPaymentStrictReceiveResult ()
  extends typings.stellarBase.mod.xdr.PathPaymentStrictReceiveResult
object PathPaymentStrictReceiveResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.pathPaymentStrictReceiveNoIssuer")
  @js.native
  def pathPaymentStrictReceiveNoIssuer(value: typings.stellarBase.xdrMod.xdr.Asset): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.pathPaymentStrictReceiveSuccess")
  @js.native
  def pathPaymentStrictReceiveSuccess(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult, io: Buffer): Unit = js.native
}
