package typings.sindresorhusTransliterate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Convert Unicode characters to Latin characters using [transliteration](https://en.wikipedia.org/wiki/Transliteration).
  @param string - String to transliterate.
  @example
  ```
  import transliterate = require('@sindresorhus/transliterate');
  transliterate('Fußgängerübergänge');
  //=> 'Fussgaengeruebergaenge'
  transliterate('Я люблю единорогов');
  //=> 'Ya lyublyu edinorogov'
  transliterate('أنا أحب حيدات');
  //=> 'ana ahb hydat'
  transliterate('tôi yêu những chú kỳ lân');
  //=> 'toi yeu nhung chu ky lan'
  ```
  */
  @JSImport("@sindresorhus/transliterate", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("@sindresorhus/transliterate", JSImport.Namespace)
  @js.native
  def apply(string: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Add your own custom replacements.
    		The replacements are run on the original string before any other transformations.
    		This only overrides a default replacement if you set an item with the same key.
    		@default []
    		@example
    		```
    		import transliterate = require('@sindresorhus/transliterate');
    		transliterate('Я люблю единорогов', {
    			customReplacements: [
    				['единорогов', '🦄']
    			]
    		})
    		//=> 'Ya lyublyu 🦄'
    		```
    		*/
    val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
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
      def setCustomReplacements(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "customReplacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomReplacementsUndefined: Self = StObject.set(x, "customReplacements", js.undefined)
      
      @scala.inline
      def setCustomReplacementsVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "customReplacements", js.Array(value :_*))
    }
  }
}
