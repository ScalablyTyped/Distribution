package typings
package sjclLib.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclCodec[T] extends js.Object {
  def fromBits(bits: BitArray): T
  def toBits(value: T): BitArray
}

object SjclCodec {
  @scala.inline
  def apply[T](fromBits: BitArray => T, toBits: T => BitArray): SjclCodec[T] = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits), toBits = js.Any.fromFunction1(toBits))
  
    __obj.asInstanceOf[SjclCodec[T]]
  }
}

