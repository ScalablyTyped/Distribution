package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigUint64ArrayConstructor
  extends org.scalablytyped.runtime.Instantiable0[BigUint64Array]
     with org.scalablytyped.runtime.Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ scala.Double, BigUint64Array]
     with org.scalablytyped.runtime.Instantiable3[
      /* buffer */ ArrayBufferLike, 
      /* byteOffset */ scala.Double, 
      /* length */ scala.Double, 
      BigUint64Array
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* buffer */ ArrayBufferLike) | (/* length */ scala.Double) | (/* array */ Iterable[BigInt]), 
      BigUint64Array
    ] {
  /** The size in bytes of each element in the array. */
  val BYTES_PER_ELEMENT: scala.Double = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: ArrayLike[BigInt]): BigUint64Array = js.native
  def from[U](arrayLike: ArrayLike[U], mapfn: js.Function2[/* v */ U, /* k */ scala.Double, BigInt]): BigUint64Array = js.native
  def from[U](
    arrayLike: ArrayLike[U],
    mapfn: js.Function2[/* v */ U, /* k */ scala.Double, BigInt],
    thisArg: js.Any
  ): BigUint64Array = js.native
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: BigInt*): BigUint64Array = js.native
}

