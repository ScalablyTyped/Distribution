package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Body
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line:strict-export-declare-modifiers
@JSImport("stellar-base", "xdr.Operation")
@js.native
class Operation[T /* <: typings.stellarBase.mod.Operation */] protected ()
  extends typings.stellarBase.xdrMod.default.Operation[T] {
  def this(attributes: Body) = this()
}
object Operation {
  
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  @JSImport("stellar-base", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  @JSImport("stellar-base", "xdr.Operation.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation]): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation]): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.Operation.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.Operation.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation], io: Buffer): Unit = js.native
}
