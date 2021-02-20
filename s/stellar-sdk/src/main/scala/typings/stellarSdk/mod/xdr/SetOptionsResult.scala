package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.SetOptionsResult")
@js.native
class SetOptionsResult ()
  extends typings.stellarBase.mod.xdr.SetOptionsResult
object SetOptionsResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.SetOptionsResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.setOptionsSuccess")
  @js.native
  def setOptionsSuccess(): typings.stellarBase.xdrMod.xdr.SetOptionsResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.SetOptionsResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SetOptionsResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.SetOptionsResult, io: Buffer): Unit = js.native
}
