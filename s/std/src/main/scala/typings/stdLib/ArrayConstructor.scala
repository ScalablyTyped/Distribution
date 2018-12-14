package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor
  extends org.scalablytyped.runtime.Instantiable0[js.Array[js.Any]]
     with org.scalablytyped.runtime.Instantiable1[
      (/* arrayLength */ scala.Double) | (/* items (repeated) */ js.Object), 
      js.Array[js.Any] | js.Array[js.Object]
    ] {
  @JSName(org.scalablytyped.runtime.Symbol.species)
  val species: ArrayConstructor = js.native
  def apply(): js.Array[_] = js.native
  def apply(arrayLength: scala.Double): js.Array[_] = js.native
  def apply[T](items: T*): js.Array[T] = js.native
  /**
       * Creates an array from an iterable object.
       * @param iterable An iterable object to convert to an array.
       */
  /**
       * Creates an array from an array-like object.
       * @param arrayLike An array-like object to convert to an array.
       */
  def from[T](iterable: ArrayLike[T]): js.Array[T] = js.native
  /**
       * Creates an array from an iterable object.
       * @param iterable An iterable object to convert to an array.
       */
  def from[T](iterable: Iterable[T]): js.Array[T] = js.native
  /**
       * Creates an array from an iterable object.
       * @param iterable An iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  /**
       * Creates an array from an iterable object.
       * @param arrayLike An array-like object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from[T, U](iterable: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): js.Array[U] = js.native
  /**
       * Creates an array from an iterable object.
       * @param iterable An iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  /**
       * Creates an array from an iterable object.
       * @param arrayLike An array-like object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from[T, U](iterable: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U], thisArg: js.Any): js.Array[U] = js.native
  /**
       * Creates an array from an iterable object.
       * @param iterable An iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): js.Array[U] = js.native
  /**
       * Creates an array from an iterable object.
       * @param iterable An iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from[T, U](iterable: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U], thisArg: js.Any): js.Array[U] = js.native
  def isArray(arg: js.Any): /* is Array */scala.Boolean = js.native
  /**
       * Returns a new array from a set of elements.
       * @param items A set of elements to include in the new array object.
       */
  def of[T](items: T*): js.Array[T] = js.native
}

