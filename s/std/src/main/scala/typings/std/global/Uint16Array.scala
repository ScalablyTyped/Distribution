package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Uint16ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Uint16Array")
@js.native
class Uint16Array ()
  extends typings.std.Uint16Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Uint16Array")
@js.native
object Uint16Array extends TopLevel[Uint16ArrayConstructor]

