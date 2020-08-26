package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Body
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import typings.stellarBase.xdrMod.xdrHidden.Operation2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line:strict-export-declare-modifiers
@JSImport("stellar-base", "xdr.Operation")
@js.native
class Operation[T /* <: typings.stellarBase.mod.Operation */] protected ()
  extends typings.stellarBase.xdrMod.default.Operation[T] {
  def this(attributes: Body) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.Operation")
@js.native
object Operation extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  def isValid(value: Operation2[typings.stellarBase.mod.Operation]): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.mod.Operation = js.native
  def toXDR(value: Operation2[typings.stellarBase.mod.Operation]): Buffer = js.native
  def write(value: Operation2[typings.stellarBase.mod.Operation], io: Buffer): Unit = js.native
}

