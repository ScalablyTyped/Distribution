package typings.std.global

import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint8ClampedArray")
@js.native
/* standard es2017.typedarrays */
open class Uint8ClampedArray ()
  extends StObject
     with typings.std.Uint8ClampedArray {
  /* standard es5 */
  def this(array: ArrayBufferLike) = this()
  /* standard es5 */
  def this(array: ArrayLike[Double]) = this()
  /* standard es2015.iterable */
  def this(elements: js.Iterable[Double]) = this()
  /* standard es5 */
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object Uint8ClampedArray {
  
  inline def apply: Uint8ClampedArrayConstructor = js.Dynamic.global.selectDynamic("Uint8ClampedArray").asInstanceOf[Uint8ClampedArrayConstructor]
}
