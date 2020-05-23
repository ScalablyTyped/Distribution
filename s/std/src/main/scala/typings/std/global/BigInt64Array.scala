package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferLike
import typings.std.BigInt64ArrayConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigInt64Array")
@js.native
class BigInt64Array ()
  extends typings.std.BigInt64Array {
  def this(array: Iterable[typings.std.BigInt]) = this()
  def this(buffer: ArrayBufferLike) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("BigInt64Array")
@js.native
object BigInt64Array extends TopLevel[BigInt64ArrayConstructor]

