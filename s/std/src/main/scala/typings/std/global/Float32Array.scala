package typings.std.global

import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Float32ArrayConstructor
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Float32Array")
@js.native
class Float32Array ()
  extends StObject
     with typings.std.Float32Array {
  def this(array: ArrayBufferLike) = this()
  def this(array: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object Float32Array {
  
  @scala.inline
  def apply: Float32ArrayConstructor = js.Dynamic.global.selectDynamic("Float32Array").asInstanceOf[Float32ArrayConstructor]
}
