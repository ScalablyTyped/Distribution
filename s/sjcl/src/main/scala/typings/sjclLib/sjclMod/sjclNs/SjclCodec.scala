package typings
package sjclLib.sjclMod.sjclNs

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
  def apply[T](fromBits: js.Function1[BitArray, T], toBits: js.Function1[T, BitArray]): SjclCodec[T] = {
    val __obj = js.Dynamic.literal(fromBits = fromBits, toBits = toBits)
  
    __obj.asInstanceOf[SjclCodec[T]]
  }
}

