package typings.secureShuffle

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Shuffle an array using `secure-random-uniform` as the RNG.
    *
    * Takes an array-like structure (eg. `Buffer`) and shuffles it. Note that the
    * original will be mutated for performance reasons. You might want to copy
    * the structure before passing it, depending on your use-case.
    *
    * As a convenience, the passed structure will be returned.
    *
    * @example
    * import secureShuffle = require('secure-shuffle')
    *
    * const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    *
    * const sarr = secureShuffle(arr.slice(0)) // sarr is now a shuffled copy of arr
    *
    * secureShuffle(arr) // arr is now shuffled
    */
  inline def apply[TArr /* <: ArrayLike[Double] */](arr: TArr): TArr = ^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any]).asInstanceOf[TArr]
  
  @JSImport("secure-shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
