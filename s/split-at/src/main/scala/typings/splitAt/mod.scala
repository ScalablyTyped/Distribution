package typings.splitAt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(string: String, index: js.Array[Double]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(string: String, index: js.Array[Double], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  /**
  Split a string at one or more indices.
  @param string - String to be split.
  @param index - One or more indices. A negative index is a 1-based position from the end of the string. For example, -1 is the index of the last place in the string. Duplicate indices are removed from the `index` array. A negative index and positive index that refer to the same position in the string are treated as duplicates.
  @example
  ```
  import splitAt = require('split-at');
  splitAt('unicorn', 2);
  //=> ['uni', 'corn']
  splitAt('unicorn', -2);
  //=> ['unico', 'rn']
  splitAt('unicorn&rainbow', [6, 7]);
  //=> ['unicorn', '&', 'rainbow']
  splitAt('unicorn&rainbow', 7, {remove: true});
  //=> ['unicorn', 'rainbow']
  ```
  */
  @scala.inline
  def apply(string: String, index: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(string: String, index: Double, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("split-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Remove the chosen indices.
    		Similar to the default `String#split` behaviour.
    		@default false
    		*/
    val remove: js.UndefOr[Boolean] = js.undefined
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
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
}
