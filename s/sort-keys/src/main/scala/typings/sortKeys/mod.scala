package typings.sortKeys

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Sort the keys of an object.
  @returns A new object with sorted keys.
  @example
  ```
  import sortKeys = require('sort-keys');
  sortKeys({c: 0, a: 0, b: 0});
  //=> {a: 0, b: 0, c: 0}
  sortKeys({b: {b: 0, a: 0}, a: 0}, {deep: true});
  //=> {a: 0, b: {a: 0, b: 0}}
  sortKeys({b: [{b: 0, a: 0}], a: 0}, {deep: true});
  //=> {a: 0, b: [{a: 0, b: 0}]}
  sortKeys({c: 0, a: 0, b: 0}, {
  	compare: (a, b) => -a.localeCompare(b)
  });
  //=> {c: 0, b: 0, a: 0}
  sortKeys([{b: 0, a:2}], {deep: true});
  //=> [{a: 2, b: 0}]
  ```
  */
  @JSImport("sort-keys", JSImport.Namespace)
  @js.native
  def apply[T /* <: StringDictionary[js.Any] */](`object`: T): T = js.native
  @JSImport("sort-keys", JSImport.Namespace)
  @js.native
  def apply[T /* <: StringDictionary[js.Any] */](`object`: T, options: Options): T = js.native
  @JSImport("sort-keys", JSImport.Namespace)
  @js.native
  def apply[T](`object`: js.Array[T]): js.Array[T] = js.native
  @JSImport("sort-keys", JSImport.Namespace)
  @js.native
  def apply[T](`object`: js.Array[T], options: Options): js.Array[T] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		[Compare function.](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort)
    		*/
    val compare: js.UndefOr[js.Function2[/* left */ String, /* right */ String, Double]] = js.native
    
    /**
    		Recursively sort keys, including keys of objects inside arrays.
    		@default false
    		*/
    val deep: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: (/* left */ String, /* right */ String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
}
