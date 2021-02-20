package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt")
@js.native
class ClaimableBalanceEntryExt ()
  extends typings.stellarBase.mod.xdr.ClaimableBalanceEntryExt
object ClaimableBalanceEntryExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimableBalanceEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt = js.native
}
