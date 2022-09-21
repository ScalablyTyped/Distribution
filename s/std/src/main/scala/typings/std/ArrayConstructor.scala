package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayConstructor
  extends StObject
     with /* standard es5 */
Instantiable0[js.Array[Any]]
     with /* standard es5 */
Instantiable1[
      (/* arrayLength */ Double) | (/* items (repeated) */ js.Object), 
      js.Array[Any | js.Object]
    ] {
  
  /* standard es5 */
  def apply(): js.Array[Any] = js.native
  def apply(arrayLength: Double): js.Array[Any] = js.native
  /* standard es5 */
  def apply[T](items: T*): js.Array[T] = js.native
  
  /**
    * Creates an array from an array-like object.
    * @param arrayLike An array-like object to convert to an array.
    */
  /* standard es2015.core */
  def from[T](arrayLike: ArrayLike[T]): js.Array[T] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    */
  /* standard es2015.iterable */
  def from[T](iterable: js.Iterable[T]): js.Array[T] = js.native
  /**
    * Creates an array from an iterable object.
    * @param arrayLike An array-like object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es2015.core */
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = js.native
  /**
    * Creates an array from an iterable object.
    * @param iterable An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es2015.iterable */
  def from[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): js.Array[U] = js.native
  def from[T, U](iterable: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): js.Array[U] = js.native
  
  /* standard es5 */
  def isArray(arg: Any): /* is std.Array<any> */ scala.Boolean = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  /* standard es2015.core */
  def of[T](items: T*): js.Array[T] = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.species)
  val species: ArrayConstructor = js.native
}
