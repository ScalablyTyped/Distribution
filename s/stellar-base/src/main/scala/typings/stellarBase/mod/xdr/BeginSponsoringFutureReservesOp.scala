package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.SponsoredId
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp")
@js.native
class BeginSponsoringFutureReservesOp protected ()
  extends typings.stellarBase.xdrMod.default.BeginSponsoringFutureReservesOp {
  def this(attributes: SponsoredId) = this()
}
object BeginSponsoringFutureReservesOp {
  
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp = js.native
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp = js.native
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BeginSponsoringFutureReservesOp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp, io: Buffer): Unit = js.native
}
