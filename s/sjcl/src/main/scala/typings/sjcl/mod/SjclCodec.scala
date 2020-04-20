package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclCodec[T] extends js.Object {
  def fromBits(bits: BitArray_): T
  def toBits(value: T): BitArray_
}

object SjclCodec {
  @scala.inline
  def apply[T](fromBits: BitArray_ => T, toBits: T => BitArray_): SjclCodec[T] = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits), toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[SjclCodec[T]]
  }
}

