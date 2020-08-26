package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.NCommit
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.ScpStatementConfirm")
@js.native
class ScpStatementConfirm protected ()
  extends typings.stellarBase.xdrMod.default.ScpStatementConfirm {
  def this(attributes: NCommit) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.ScpStatementConfirm")
@js.native
object ScpStatementConfirm extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpStatementConfirm): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatementConfirm = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpStatementConfirm): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpStatementConfirm, io: Buffer): Unit = js.native
}

