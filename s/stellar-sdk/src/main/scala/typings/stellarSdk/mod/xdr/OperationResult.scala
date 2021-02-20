package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationResult")
@js.native
class OperationResult ()
  extends typings.stellarBase.mod.xdr.OperationResult
object OperationResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSImport("stellar-sdk", "xdr.OperationResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSImport("stellar-sdk", "xdr.OperationResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.opInner")
  @js.native
  def opInner(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationResult, io: Buffer): Unit = js.native
}
