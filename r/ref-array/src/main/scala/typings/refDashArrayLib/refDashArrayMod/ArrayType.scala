package typings
package refDashArrayLib.refDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends refLib.refMod.Type
     with org.scalablytyped.runtime.Instantiable0[refDashArrayLib.Anon_I[T]]
     with org.scalablytyped.runtime.Instantiable2[
      (/* data */ js.Array[scala.Double]) | (/* data */ nodeLib.Buffer), 
      /* length */ scala.Double, 
      refDashArrayLib.Anon_I[T]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* data */ js.Array[scala.Double]) | (/* data */ nodeLib.Buffer) | (/* length */ scala.Double), 
      refDashArrayLib.Anon_I[T]
    ] {
  var BYTES_PER_ELEMENT: scala.Double = js.native
  var fixedLength: scala.Double = js.native
  /** The reference to the base type. */
  var `type`: refLib.refMod.Type = js.native
  def apply(): refDashArrayLib.Anon_I[T] = js.native
  def apply(data: js.Array[scala.Double]): refDashArrayLib.Anon_I[T] = js.native
  def apply(data: js.Array[scala.Double], length: scala.Double): refDashArrayLib.Anon_I[T] = js.native
  def apply(data: nodeLib.Buffer): refDashArrayLib.Anon_I[T] = js.native
  def apply(data: nodeLib.Buffer, length: scala.Double): refDashArrayLib.Anon_I[T] = js.native
  def apply(length: scala.Double): refDashArrayLib.Anon_I[T] = js.native
  /**
    * Accepts a Buffer instance that should be an already-populated with data
    * for the ArrayType. The "length" of the Array is determined by searching
    * through the buffer's contents until an aligned NULL pointer is encountered.
    */
  def untilZeros(buffer: nodeLib.Buffer): refDashArrayLib.Anon_I[T] = js.native
}

