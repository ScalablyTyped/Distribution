package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Uint8ClampedArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Uint8ClampedArray")
@js.native
class Uint8ClampedArray ()
  extends typings.std.Uint8ClampedArray {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Uint8ClampedArray")
@js.native
object Uint8ClampedArray extends TopLevel[Uint8ClampedArrayConstructor]

