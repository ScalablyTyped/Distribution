package typings.simpleSwizzle

import typings.std.ArrayLike
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * [Swizzle](https://en.wikipedia.org/wiki/Swizzling_(computer_graphics)) your function arguments.
    *
    * @example
    * import swizzle = require('simple-swizzle');
    *
    * function myFunc(...args: Array<number | number[]>): number[] {
    *     const argsArr = swizzle(args);
    *     // ...
    *     return argsArr;
    * }
    *
    * myFunc(1, [2, 3], 4); // [1, 2, 3, 4]
    * myFunc(1, 2, 3, 4);   // [1, 2, 3, 4]
    * myFunc([1, 2, 3, 4]); // [1, 2, 3, 4]
    */
  inline def apply[TElement /* <: Any */](arguments: ArrayLike[TElement | ArrayLike[TElement]]): js.Array[TElement] = ^.asInstanceOf[js.Dynamic].apply(arguments.asInstanceOf[js.Any]).asInstanceOf[js.Array[TElement]]
  
  @JSImport("simple-swizzle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Functions can also be wrapped to automatically swizzle arguments and be passed the resulting array.
    *
    * @example
    * import swizzle = require('simple-swizzle');
    *
    * const swizzledFn = swizzle.wrap((args: number[]): number[] {
    *     // ...
    *     return args;
    * });
    *
    * swizzledFn(1, [2, 3], 4); // [1, 2, 3, 4]
    * swizzledFn(1, 2, 3, 4);   // [1, 2, 3, 4]
    * swizzledFn([1, 2, 3, 4]); // [1, 2, 3, 4]
    */
  inline def wrap[TFn /* <: js.Function1[/* arguments */ js.Array[Any], Any] */](fn: TFn): js.Function1[/* args */ js.Array[Any | js.Array[Any]], ReturnType[TFn]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ js.Array[Any | js.Array[Any]], ReturnType[TFn]]]
}
