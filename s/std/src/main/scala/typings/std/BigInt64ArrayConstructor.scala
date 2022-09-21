package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigInt64ArrayConstructor
  extends StObject
     with /* standard es2020.bigint */
Instantiable0[BigInt64Array]
     with /* standard es2020.bigint */
Instantiable1[
      (/* buffer */ ArrayBufferLike) | (/* length */ Double) | (/* array */ js.Iterable[js.BigInt]), 
      BigInt64Array
    ]
     with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, BigInt64Array]
     with Instantiable3[
      /* buffer */ ArrayBufferLike, 
      (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
      /* length */ Double, 
      BigInt64Array
    ] {
  
  /** The size in bytes of each element in the array. */
  /* standard es2020.bigint */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es2020.bigint */
  def from(arrayLike: ArrayLike[js.BigInt]): BigInt64Array = js.native
  /* standard es2020.bigint */
  def from[U](arrayLike: ArrayLike[U], mapfn: js.Function2[/* v */ U, /* k */ Double, js.BigInt]): BigInt64Array = js.native
  def from[U](arrayLike: ArrayLike[U], mapfn: js.Function2[/* v */ U, /* k */ Double, js.BigInt], thisArg: Any): BigInt64Array = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  /* standard es2020.bigint */
  def of(items: js.BigInt*): BigInt64Array = js.native
}
