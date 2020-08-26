package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.MaxTime
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TimeBounds")
@js.native
class TimeBounds protected ()
  extends typings.stellarBase.xdrMod.xdr.TimeBounds {
  def this(attributes: MaxTime) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "TimeBounds")
@js.native
object TimeBounds extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TimeBounds): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TimeBounds = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TimeBounds): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TimeBounds, io: Buffer): Unit = js.native
}

