package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult")
@js.native
class RevokeSponsorshipResult ()
  extends typings.stellarBase.mod.xdr.RevokeSponsorshipResult
object RevokeSponsorshipResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.revokeSponsorshipSuccess")
  @js.native
  def revokeSponsorshipSuccess(): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.RevokeSponsorshipResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResult, io: Buffer): Unit = js.native
}
