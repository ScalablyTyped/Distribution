package typings.replaceString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Replace all substring matches in a string.
  @param input - String to work on.
  @param needle - String to match in `input`.
  @param replacement - Replacement for `needle` matches.
  @returns A new string with all `needle` matches replaced with `replacement`.
  @example
  ```
  import replaceString = require('replace-string');
  const string = 'My friend has a 🐑. I want a 🐑 too!';
  replaceString(string, '🐑', '🦄');
  //=> 'My friend has a 🦄. I want a 🦄 too!'
  replaceString('Foo 🐑 Bar', '🐑', (matchedSubstring, matchCount, input, matchIndex) => `${matchedSubstring}❤️`);
  //=> 'Foo 🐑❤️ Bar'
  ```
  */
  @JSImport("replace-string", JSImport.Namespace)
  @js.native
  def apply(input: String, needle: String, replacement: String): String = js.native
  @JSImport("replace-string", JSImport.Namespace)
  @js.native
  def apply(input: String, needle: String, replacement: String, options: Options): String = js.native
  @JSImport("replace-string", JSImport.Namespace)
  @js.native
  def apply(input: String, needle: String, replacement: ReplacementFunction): String = js.native
  @JSImport("replace-string", JSImport.Namespace)
  @js.native
  def apply(input: String, needle: String, replacement: ReplacementFunction, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Whether or not substring matching should be case-insensitive.
    		@default false
    		*/
    val caseInsensitive: js.UndefOr[Boolean] = js.native
    
    /**
    		Index at which to start replacing.
    		@default 0
    		*/
    val fromIndex: js.UndefOr[Double] = js.native
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
      def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      @scala.inline
      def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
    }
  }
  
  type ReplacementFunction = js.Function4[
    /* matchedSubstring */ String, 
    /* matchCount */ Double, 
    /* input */ String, 
    /* matchIndex */ Double, 
    String
  ]
}
