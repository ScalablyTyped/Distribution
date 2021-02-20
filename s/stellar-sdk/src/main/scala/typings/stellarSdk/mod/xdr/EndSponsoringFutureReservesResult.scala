package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult")
@js.native
class EndSponsoringFutureReservesResult ()
  extends typings.stellarBase.mod.xdr.EndSponsoringFutureReservesResult
object EndSponsoringFutureReservesResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.endSponsoringFutureReservesSuccess")
  @js.native
  def endSponsoringFutureReservesSuccess(): typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult = js.native
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult = js.native
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.EndSponsoringFutureReservesResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.EndSponsoringFutureReservesResult, io: Buffer): Unit = js.native
}
