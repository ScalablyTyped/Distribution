package typings.refDashArrayDashDi.refDashArrayDashDiMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.refDashArrayDashDi.Anon_Buffer
import typings.refDashNapi.refDashNapiMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends Type
     with Instantiable0[Anon_Buffer[T]]
     with Instantiable1[
      (/* data */ js.Array[Double]) | (/* data */ Buffer) | (/* length */ Double), 
      Anon_Buffer[T]
    ]
     with Instantiable2[
      (/* data */ js.Array[Double]) | (/* data */ Buffer), 
      /* length */ Double, 
      Anon_Buffer[T]
    ] {
  var BYTES_PER_ELEMENT: Double = js.native
  var fixedLength: Double = js.native
  /** The reference to the base type. */
  var `type`: Type = js.native
  def apply(): Anon_Buffer[T] = js.native
  def apply(data: js.Array[Double]): Anon_Buffer[T] = js.native
  def apply(data: js.Array[Double], length: Double): Anon_Buffer[T] = js.native
  def apply(data: Buffer): Anon_Buffer[T] = js.native
  def apply(data: Buffer, length: Double): Anon_Buffer[T] = js.native
  def apply(length: Double): Anon_Buffer[T] = js.native
  /**
    * Accepts a Buffer instance that should be an already-populated with data
    * for the ArrayType. The "length" of the Array is determined by searching
    * through the buffer's contents until an aligned NULL pointer is encountered.
    */
  def untilZeros(buffer: Buffer): Anon_Buffer[T] = js.native
}

