package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.DestAsset
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp")
@js.native
class PathPaymentStrictSendOp protected ()
  extends typings.stellarBase.mod.xdr.PathPaymentStrictSendOp {
  def this(attributes: DestAsset) = this()
}
object PathPaymentStrictSendOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictSendOp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp, io: Buffer): Unit = js.native
}
