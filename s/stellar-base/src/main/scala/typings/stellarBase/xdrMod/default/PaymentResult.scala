package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.PaymentResult")
@js.native
class PaymentResult ()
  extends typings.stellarBase.xdrMod.xdr.PaymentResult
object PaymentResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PaymentResult = js.native
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PaymentResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PaymentResult = js.native
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PaymentResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PaymentResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.paymentSuccess")
  @js.native
  def paymentSuccess(): typings.stellarBase.xdrMod.xdr.PaymentResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PaymentResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PaymentResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PaymentResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PaymentResult, io: Buffer): Unit = js.native
}
