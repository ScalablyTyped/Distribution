package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "Hyper")
@js.native
class Hyper protected ()
  extends typings.stellarBase.xdrMod.xdr.Hyper {
  def this(low: Double, high: Double) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "Hyper")
@js.native
object Hyper extends js.Object {
  val MAX_VALUE: typings.stellarBase.xdrMod.xdr.Hyper = js.native
  val MIN_VALUE: typings.stellarBase.xdrMod.xdr.Hyper = js.native
  def fromBytes(low: Double, high: Double): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  def fromString(input: String): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Hyper): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Hyper = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Hyper): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Hyper, io: Buffer): Unit = js.native
}

