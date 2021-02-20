package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp")
@js.native
class RevokeSponsorshipOp ()
  extends typings.stellarBase.mod.xdr.RevokeSponsorshipOp
object RevokeSponsorshipOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.revokeSponsorshipLedgerEntry")
  @js.native
  def revokeSponsorshipLedgerEntry(value: typings.stellarBase.xdrMod.xdr.LedgerKey): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.revokeSponsorshipSigner")
  @js.native
  def revokeSponsorshipSigner(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOpSigner): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipOp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipOp, io: Buffer): Unit = js.native
}
