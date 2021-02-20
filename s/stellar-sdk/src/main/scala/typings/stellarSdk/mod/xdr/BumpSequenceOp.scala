package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.BumpTo
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.BumpSequenceOp")
@js.native
class BumpSequenceOp protected ()
  extends typings.stellarBase.mod.xdr.BumpSequenceOp {
  def this(attributes: BumpTo) = this()
}
object BumpSequenceOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BumpSequenceOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BumpSequenceOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.BumpSequenceOp.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BumpSequenceOp, io: Buffer): Unit = js.native
}
