package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "ScpStatementPledges")
@js.native
class ScpStatementPledges ()
  extends typings.stellarBase.xdrMod.xdr.ScpStatementPledges

/* static members */
@JSImport("stellar-base/types/xdr", "ScpStatementPledges")
@js.native
object ScpStatementPledges extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpStatementPledges): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  def scpStConfirm(value: typings.stellarBase.xdrMod.xdr.ScpStatementConfirm): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  def scpStExternalize(value: typings.stellarBase.xdrMod.xdr.ScpStatementExternalize): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  def scpStNominate(value: typings.stellarBase.xdrMod.xdr.ScpNomination): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  def scpStPrepare(value: typings.stellarBase.xdrMod.xdr.ScpStatementPrepare): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpStatementPledges): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpStatementPledges, io: Buffer): Unit = js.native
}

