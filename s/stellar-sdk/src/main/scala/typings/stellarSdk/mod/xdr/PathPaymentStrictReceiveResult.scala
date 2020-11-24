package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult")
@js.native
class PathPaymentStrictReceiveResult ()
  extends typings.stellarBase.mod.xdr.PathPaymentStrictReceiveResult
/* static members */
@JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult")
@js.native
object PathPaymentStrictReceiveResult extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): Boolean = js.native
  
  def pathPaymentStrictReceiveNoIssuer(value: typings.stellarBase.xdrMod.xdr.Asset): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def pathPaymentStrictReceiveSuccess(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult, io: Buffer): Unit = js.native
}
