package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Last
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess")
@js.native
class PathPaymentStrictReceiveResultSuccess protected ()
  extends typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess {
  def this(attributes: Last) = this()
}
object PathPaymentStrictReceiveResultSuccess {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictReceiveResultSuccess.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess, io: Buffer): Unit = js.native
}
