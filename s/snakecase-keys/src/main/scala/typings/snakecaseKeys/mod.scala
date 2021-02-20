package typings.snakecaseKeys

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snakecase-keys", JSImport.Namespace)
  @js.native
  def apply[T /* <: StringDictionary[js.Any] */](input: T): T = js.native
  @JSImport("snakecase-keys", JSImport.Namespace)
  @js.native
  def apply[T /* <: StringDictionary[js.Any] */](input: T, options: Options): T = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Recurse nested objects and objects in arrays.
    		@default true
    		*/
    val deep: js.UndefOr[Boolean] = js.native
    
    /**
    		Exclude keys from being snakeCased.
    		@default []
    		*/
    val exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
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
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
}
