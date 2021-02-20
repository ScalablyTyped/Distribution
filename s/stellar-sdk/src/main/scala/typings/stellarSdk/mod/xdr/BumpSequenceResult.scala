package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.BumpSequenceResult")
@js.native
class BumpSequenceResult ()
  extends typings.stellarBase.mod.xdr.BumpSequenceResult
object BumpSequenceResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.bumpSequenceSuccess")
  @js.native
  def bumpSequenceSuccess(): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult, io: Buffer): Unit = js.native
}
