package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "BumpSequenceResult")
@js.native
class BumpSequenceResult ()
  extends typings.stellarBase.xdrMod.xdr.BumpSequenceResult

/* static members */
@JSImport("stellar-base/types/xdr", "BumpSequenceResult")
@js.native
object BumpSequenceResult extends js.Object {
  def bumpSequenceSuccess(): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult, io: Buffer): Unit = js.native
}

