package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult")
@js.native
class BeginSponsoringFutureReservesResult ()
  extends typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult
object BeginSponsoringFutureReservesResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.beginSponsoringFutureReservesSuccess")
  @js.native
  def beginSponsoringFutureReservesSuccess(): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult = js.native
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult = js.native
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.BeginSponsoringFutureReservesResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesResult, io: Buffer): Unit = js.native
}
