package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  def fromXDR(input: Buffer): js.Any = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): js.Any = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): js.Any = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): js.Any = js.native
  def isValid(value: js.Any): Boolean = js.native
  def read(io: Buffer): js.Any = js.native
  def toXDR(value: js.Any): Buffer = js.native
  def write(value: js.Any, io: Buffer): Unit = js.native
}

