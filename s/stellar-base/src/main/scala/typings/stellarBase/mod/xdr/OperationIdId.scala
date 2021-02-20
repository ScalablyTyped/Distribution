package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.OpNum
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.OperationIdId")
@js.native
class OperationIdId protected ()
  extends typings.stellarBase.xdrMod.default.OperationIdId {
  def this(attributes: OpNum) = this()
}
object OperationIdId {
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSImport("stellar-base", "xdr.OperationIdId.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSImport("stellar-base", "xdr.OperationIdId.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationIdId): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationIdId): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.OperationIdId.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.OperationIdId.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationIdId.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationIdId, io: Buffer): Unit = js.native
}
