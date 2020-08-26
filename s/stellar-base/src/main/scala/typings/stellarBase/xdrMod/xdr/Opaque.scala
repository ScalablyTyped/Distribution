package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opaque extends js.Object {
  def fromXDR(input: Buffer): Buffer = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): Buffer = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): Buffer = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): Buffer = js.native
  def isValid(value: Buffer): Boolean = js.native
  def read(io: Buffer): Buffer = js.native
  def toXDR(value: Buffer): Buffer = js.native
  def write(value: Buffer, io: Buffer): Unit = js.native
}

