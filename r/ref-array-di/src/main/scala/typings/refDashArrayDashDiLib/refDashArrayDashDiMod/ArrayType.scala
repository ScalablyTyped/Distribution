package typings
package refDashArrayDashDiLib.refDashArrayDashDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends refDashNapiLib.refDashNapiMod.Type
     with org.scalablytyped.runtime.Instantiable0[refDashArrayDashDiLib.Anon_I[T]]
     with org.scalablytyped.runtime.Instantiable2[
      (/* data */ js.Array[scala.Double]) | (/* data */ nodeLib.Buffer), 
      /* length */ scala.Double, 
      refDashArrayDashDiLib.Anon_I[T]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* length */ scala.Double) | (/* data */ js.Array[scala.Double]) | (/* data */ nodeLib.Buffer), 
      refDashArrayDashDiLib.Anon_I[T]
    ] {
  var BYTES_PER_ELEMENT: scala.Double = js.native
  var fixedLength: scala.Double = js.native
  /** The reference to the base type. */
  var `type`: refDashNapiLib.refDashNapiMod.Type = js.native
  def apply(): refDashArrayDashDiLib.Anon_I[T] = js.native
  def apply(data: js.Array[scala.Double]): refDashArrayDashDiLib.Anon_I[T] = js.native
  def apply(data: js.Array[scala.Double], length: scala.Double): refDashArrayDashDiLib.Anon_I[T] = js.native
  def apply(data: nodeLib.Buffer): refDashArrayDashDiLib.Anon_I[T] = js.native
  def apply(data: nodeLib.Buffer, length: scala.Double): refDashArrayDashDiLib.Anon_I[T] = js.native
  def apply(length: scala.Double): refDashArrayDashDiLib.Anon_I[T] = js.native
  /**
       * Accepts a Buffer instance that should be an already-populated with data
       * for the ArrayType. The "length" of the Array is determined by searching
       * through the buffer's contents until an aligned NULL pointer is encountered.
       */
  def untilZeros(buffer: nodeLib.Buffer): refDashArrayDashDiLib.Anon_I[T] = js.native
}

