package typings.sjcl.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclArrayBufferCodec extends SjclCodec[ArrayBuffer] {
  def fromBits(bits: BitArray_, padding: js.UndefOr[scala.Nothing], padding_count: Double): ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean): ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean, padding_count: Double): ArrayBuffer = js.native
  def hexDumpBuffer(buffer: ArrayBuffer): Unit = js.native
}

