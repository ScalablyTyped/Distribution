package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.OpNum
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.OperationIdId")
@js.native
class OperationIdId protected ()
  extends typings.stellarBase.xdrMod.default.OperationIdId {
  def this(attributes: OpNum) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.OperationIdId")
@js.native
object OperationIdId extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationIdId): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationIdId = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationIdId): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.OperationIdId, io: Buffer): Unit = js.native
}
