package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.RevokeSponsorshipOp")
@js.native
class RevokeSponsorshipOp ()
  extends typings.stellarBase.xdrMod.default.RevokeSponsorshipOp
object RevokeSponsorshipOp {
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.revokeSponsorshipLedgerEntry")
  @js.native
  def revokeSponsorshipLedgerEntry(value: typings.stellarBase.xdrMod.xdr.LedgerKey): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.revokeSponsorshipSigner")
  @js.native
  def revokeSponsorshipSigner(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOpSigner): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.RevokeSponsorshipOp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp, io: Buffer): Unit = js.native
}
