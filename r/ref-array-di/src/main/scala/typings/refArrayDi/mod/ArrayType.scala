package typings.refArrayDi.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.refArrayDi.AnonDicti
import typings.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends Type
     with Instantiable0[AnonDicti[T]]
     with Instantiable1[
      (/* data */ js.Array[Double]) | (/* data */ Buffer) | (/* length */ Double), 
      AnonDicti[T]
    ]
     with Instantiable2[
      (/* data */ js.Array[Double]) | (/* data */ Buffer), 
      /* length */ Double, 
      AnonDicti[T]
    ] {
  var BYTES_PER_ELEMENT: Double = js.native
  var fixedLength: Double = js.native
  /** The reference to the base type. */
  var `type`: Type = js.native
  def apply(): AnonDicti[T] = js.native
  def apply(data: js.Array[Double]): AnonDicti[T] = js.native
  def apply(data: js.Array[Double], length: Double): AnonDicti[T] = js.native
  def apply(data: Buffer): AnonDicti[T] = js.native
  def apply(data: Buffer, length: Double): AnonDicti[T] = js.native
  def apply(length: Double): AnonDicti[T] = js.native
  /**
    * Accepts a Buffer instance that should be an already-populated with data
    * for the ArrayType. The "length" of the Array is determined by searching
    * through the buffer's contents until an aligned NULL pointer is encountered.
    */
  def untilZeros(buffer: Buffer): AnonDicti[T] = js.native
}

