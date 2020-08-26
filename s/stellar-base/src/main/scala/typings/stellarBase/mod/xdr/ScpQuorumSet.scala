package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.InnerSets
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.ScpQuorumSet")
@js.native
class ScpQuorumSet protected ()
  extends typings.stellarBase.xdrMod.default.ScpQuorumSet {
  def this(attributes: InnerSets) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.ScpQuorumSet")
@js.native
object ScpQuorumSet extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpQuorumSet): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpQuorumSet = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpQuorumSet): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpQuorumSet, io: Buffer): Unit = js.native
}

