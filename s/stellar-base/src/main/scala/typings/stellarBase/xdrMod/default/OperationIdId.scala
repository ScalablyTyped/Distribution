package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.OpNum
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.OperationIdId")
@js.native
class OperationIdId protected ()
  extends typings.stellarBase.xdrMod.xdr.OperationIdId {
  def this(attributes: OpNum) = this()
}
object OperationIdId {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationIdId): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationIdId): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationIdId.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationIdId, io: Buffer): Unit = js.native
}
