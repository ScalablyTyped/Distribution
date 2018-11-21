package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uint8ClampedArrayConstructor
  extends ScalablyTyped.runtime.Instantiable0[Uint8ClampedArray]
     with ScalablyTyped.runtime.Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ scala.Double, Uint8ClampedArray]
     with ScalablyTyped.runtime.Instantiable3[
      /* buffer */ ArrayBufferLike, 
      /* byteOffset */ scala.Double, 
      /* length */ scala.Double, 
      Uint8ClampedArray
    ]
     with ScalablyTyped.runtime.Instantiable1[
      (/* elements */ Iterable[scala.Double]) | (/* length */ scala.Double) | (/* arrayOrArrayBuffer */ ArrayLike[scala.Double]) | (/* arrayOrArrayBuffer */ ArrayBufferLike), 
      Uint8ClampedArray
    ] {
  /**
        * The size in bytes of each element in the array.
        */
  val BYTES_PER_ELEMENT: scala.Double = js.native
  /**
        * Creates an array from an array-like or iterable object.
        * @param arrayLike An array-like or iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from(arrayLike: ArrayLike[scala.Double]): Uint8ClampedArray = js.native
  /**
        * Creates an array from an array-like or iterable object.
        * @param arrayLike An array-like or iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from(
    arrayLike: ArrayLike[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double]
  ): Uint8ClampedArray = js.native
  /**
        * Creates an array from an array-like or iterable object.
        * @param arrayLike An array-like or iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from(
    arrayLike: ArrayLike[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double],
    thisArg: js.Any
  ): Uint8ClampedArray = js.native
  /**
       * Creates an array from an array-like or iterable object.
       * @param arrayLike An array-like or iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from(arrayLike: Iterable[scala.Double]): Uint8ClampedArray = js.native
  /**
       * Creates an array from an array-like or iterable object.
       * @param arrayLike An array-like or iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from(
    arrayLike: Iterable[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double]
  ): Uint8ClampedArray = js.native
  /**
       * Creates an array from an array-like or iterable object.
       * @param arrayLike An array-like or iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from(
    arrayLike: Iterable[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double],
    thisArg: js.Any
  ): Uint8ClampedArray = js.native
  /**
        * Returns a new array from a set of elements.
        * @param items A set of elements to include in the new array object.
        */
  def of(items: scala.Double*): Uint8ClampedArray = js.native
}

