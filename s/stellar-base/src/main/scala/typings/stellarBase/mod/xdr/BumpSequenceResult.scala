package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.BumpSequenceResult")
@js.native
class BumpSequenceResult ()
  extends typings.stellarBase.xdrMod.default.BumpSequenceResult
object BumpSequenceResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.bumpSequenceSuccess")
  @js.native
  def bumpSequenceSuccess(): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSImport("stellar-base", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSImport("stellar-base", "xdr.BumpSequenceResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.BumpSequenceResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.BumpSequenceResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult, io: Buffer): Unit = js.native
}
