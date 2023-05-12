package typings.sindresorhusSlugify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sindresorhus/slugify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def slugifyWithCounter(): CountableSlugify = ^.asInstanceOf[js.Dynamic].applyDynamic("slugifyWithCounter")().asInstanceOf[CountableSlugify]
  
  @js.native
  trait CountableSlugify extends StObject {
    
    /**
    	Returns a new instance of `slugify(string, options?)` with a counter to handle multiple occurrences of the same string.
    	@param string - String to slugify.
    	@example
    	```
    	import {slugifyWithCounter} from '@sindresorhus/slugify';
    	const slugify = slugifyWithCounter();
    	slugify('foo bar');
    	//=> 'foo-bar'
    	slugify('foo bar');
    	//=> 'foo-bar-2'
    	slugify.reset();
    	slugify('foo bar');
    	//=> 'foo-bar'
    	```
    	__Use case example of counter__
    	If, for example, you have a document with multiple sections where each subsection has an example.
    	```
    	## Section 1
    	### Example
    	## Section 2
    	### Example
    	```
    	You can then use `slugifyWithCounter()` to generate unique HTML `id`'s to ensure anchors will link to the right headline.
    	*/
    def apply(string: String): String = js.native
    def apply(string: String, options: Options): String = js.native
    
    /**
    	Reset the counter.
    	@example
    	```
    	import {slugifyWithCounter} from '@sindresorhus/slugify';
    	const slugify = slugifyWithCounter();
    	slugify('foo bar');
    	//=> 'foo-bar'
    	slugify('foo bar');
    	//=> 'foo-bar-2'
    	slugify.reset();
    	slugify('foo bar');
    	//=> 'foo-bar'
    	```
    	*/
    def reset(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
    	Add your own custom replacements.
    	The replacements are run on the original string before any other transformations.
    	This only overrides a default replacement if you set an item with the same key, like `&`.
    	Add a leading and trailing space to the replacement to have it separated by dashes.
    	@default [ ['&', ' and '], ['🦄', ' unicorn '], ['♥', ' love '] ]
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('Foo@unicorn', {
    		customReplacements: [
    			['@', 'at']
    		]
    	});
    	//=> 'fooatunicorn'
    	slugify('foo@unicorn', {
    		customReplacements: [
    			['@', ' at ']
    		]
    	});
    	//=> 'foo-at-unicorn'
    	slugify('I love 🐶', {
    		customReplacements: [
    			['🐶', 'dogs']
    		]
    	});
    	//=> 'i-love-dogs'
    	```
    	*/
    val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /**
    	Convert camelcase to separate words. Internally it does `fooBar` → `foo bar`.
    	@default true
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('fooBar');
    	//=> 'foo-bar'
    	slugify('fooBar', {decamelize: false});
    	//=> 'foobar'
    	```
    	*/
    val decamelize: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Make the slug lowercase.
    	@default true
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('Déjà Vu!');
    	//=> 'deja-vu'
    	slugify('Déjà Vu!', {lowercase: false});
    	//=> 'Deja-Vu'
    	```
    	*/
    val lowercase: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Preserve certain characters.
    	It cannot contain the `separator`.
    	For example, if you want to slugify URLs, but preserve the HTML fragment `#` character, you could set `preserveCharacters: ['#']`.
    	@default []
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('foo_bar#baz', {preserveCharacters: ['#']});
    	//=> 'foo-bar#baz'
    	```
    	*/
    val preserveCharacters: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	If your string starts with an underscore, it will be preserved in the slugified string.
    	Sometimes leading underscores are intentional, for example, filenames representing hidden paths on a website.
    	@default false
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('_foo_bar');
    	//=> 'foo-bar'
    	slugify('_foo_bar', {preserveLeadingUnderscore: true});
    	//=> '_foo-bar'
    	```
    	*/
    val preserveLeadingUnderscore: js.UndefOr[Boolean] = js.undefined
    
    /**
    	If your string ends with a dash, it will be preserved in the slugified string.
    	For example, using slugify on an input field would allow for validation while not preventing the user from writing a slug.
    	@default false
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('foo-bar-');
    	//=> 'foo-bar'
    	slugify('foo-bar-', {preserveTrailingDash: true});
    	//=> 'foo-bar-'
    	```
    	 */
    val preserveTrailingDash: js.UndefOr[Boolean] = js.undefined
    
    /**
    	@default '-'
    	@example
    	```
    	import slugify from '@sindresorhus/slugify';
    	slugify('BAR and baz');
    	//=> 'bar-and-baz'
    	slugify('BAR and baz', {separator: '_'});
    	//=> 'bar_and_baz'
    	slugify('BAR and baz', {separator: ''});
    	//=> 'barandbaz'
    	```
    	*/
    val separator: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCustomReplacements(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "customReplacements", value.asInstanceOf[js.Any])
      
      inline def setCustomReplacementsUndefined: Self = StObject.set(x, "customReplacements", js.undefined)
      
      inline def setCustomReplacementsVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "customReplacements", js.Array(value*))
      
      inline def setDecamelize(value: Boolean): Self = StObject.set(x, "decamelize", value.asInstanceOf[js.Any])
      
      inline def setDecamelizeUndefined: Self = StObject.set(x, "decamelize", js.undefined)
      
      inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      inline def setPreserveCharacters(value: js.Array[String]): Self = StObject.set(x, "preserveCharacters", value.asInstanceOf[js.Any])
      
      inline def setPreserveCharactersUndefined: Self = StObject.set(x, "preserveCharacters", js.undefined)
      
      inline def setPreserveCharactersVarargs(value: String*): Self = StObject.set(x, "preserveCharacters", js.Array(value*))
      
      inline def setPreserveLeadingUnderscore(value: Boolean): Self = StObject.set(x, "preserveLeadingUnderscore", value.asInstanceOf[js.Any])
      
      inline def setPreserveLeadingUnderscoreUndefined: Self = StObject.set(x, "preserveLeadingUnderscore", js.undefined)
      
      inline def setPreserveTrailingDash(value: Boolean): Self = StObject.set(x, "preserveTrailingDash", value.asInstanceOf[js.Any])
      
      inline def setPreserveTrailingDashUndefined: Self = StObject.set(x, "preserveTrailingDash", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
