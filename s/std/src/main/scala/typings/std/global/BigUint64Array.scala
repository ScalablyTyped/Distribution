package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferLike
import typings.std.BigUint64ArrayConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigUint64Array")
@js.native
class BigUint64Array ()
  extends typings.std.BigUint64Array {
  def this(array: Iterable[typings.std.BigInt]) = this()
  def this(buffer: ArrayBufferLike) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("BigUint64Array")
@js.native
object BigUint64Array extends TopLevel[BigUint64ArrayConstructor]

