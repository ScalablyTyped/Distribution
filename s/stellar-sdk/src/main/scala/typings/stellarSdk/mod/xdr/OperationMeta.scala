package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Changes
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.OperationMeta")
@js.native
class OperationMeta protected ()
  extends typings.stellarBase.mod.xdr.OperationMeta {
  def this(attributes: Changes) = this()
}
object OperationMeta {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSImport("stellar-sdk", "xdr.OperationMeta.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  @JSImport("stellar-sdk", "xdr.OperationMeta.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationMeta): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationMeta = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationMeta): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationMeta.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.OperationMeta.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.OperationMeta.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationMeta, io: Buffer): Unit = js.native
}
