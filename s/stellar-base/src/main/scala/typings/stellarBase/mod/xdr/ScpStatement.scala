package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.NodeId
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ScpStatement")
@js.native
class ScpStatement protected ()
  extends typings.stellarBase.xdrMod.default.ScpStatement {
  def this(attributes: NodeId) = this()
}
object ScpStatement {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpStatement = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpStatement = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpStatement = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpStatement): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatement = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpStatement): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpStatement.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpStatement.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpStatement, io: Buffer): Unit = js.native
}
