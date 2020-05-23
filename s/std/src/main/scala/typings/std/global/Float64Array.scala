package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Float64ArrayConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Float64Array")
@js.native
class Float64Array ()
  extends typings.std.Float64Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Float64Array")
@js.native
object Float64Array extends TopLevel[Float64ArrayConstructor]

