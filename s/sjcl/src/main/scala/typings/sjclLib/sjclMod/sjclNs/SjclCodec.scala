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

