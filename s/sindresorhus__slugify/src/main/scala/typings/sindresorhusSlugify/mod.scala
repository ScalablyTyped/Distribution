package typings.sindresorhusSlugify

import typings.sindresorhusSlugify.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Slugify a string.
  	@param string - String to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	slugify('I ♥ Dogs');
  	//=> 'i-love-dogs'
  	slugify('  Déjà Vu!  ');
  	//=> 'deja-vu'
  	slugify('fooBar 123 $#%');
  	//=> 'foo-bar-123'
  	slugify('я люблю единорогов');
  	//=> 'ya-lyublyu-edinorogov'
  	```
  	*/
  @scala.inline
  def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@sindresorhus/slugify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Returns a new instance of `slugify(string, options?)` with a counter to handle multiple occurences of the same string.
  	@param string - String to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	const countableSlugify = slugify.counter();
  	countableSlugify('foo bar');
  	//=> 'foo-bar'
  	countableSlugify('foo bar');
  	//=> 'foo-bar-2'
  	countableSlugify.reset();
  	countableSlugify('foo bar');
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
  	You can then use `slugify.counter()` to generate unique HTML `id`'s to ensure anchors will link to the right headline.
  	*/
  @scala.inline
  def counter(): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("counter")().asInstanceOf[Call]
  
  trait Options extends StObject {
    
    /**
    		Add your own custom replacements.
    		The replacements are run on the original string before any other transformations.
    		This only overrides a default replacement if you set an item with the same key, like `&`.
    		Add a leading and trailing space to the replacement to have it separated by dashes.
    		@default [ ['&', ' and '], ['🦄', ' unicorn '], ['♥', ' love '] ]
    		@example
    		```
    		import slugify = require('@sindresorhus/slugify');
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
    		import slugify = require('@sindresorhus/slugify');
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
    		import slugify = require('@sindresorhus/slugify');
    		slugify('Déjà Vu!');
    		//=> 'deja-vu'
    		slugify('Déjà Vu!', {lowercase: false});
    		//=> 'Deja-Vu'
    		```
    		*/
    val lowercase: js.UndefOr[Boolean] = js.undefined
    
    /**
    		If your string starts with an underscore, it will be preserved in the slugified string.
    		Sometimes leading underscores are intentional, for example, filenames representing hidden paths on a website.
    		@default false
    		@example
    		```
    		import slugify = require('@sindresorhus/slugify');
    		slugify('_foo_bar');
    		//=> 'foo-bar'
    		slugify('_foo_bar', {preserveLeadingUnderscore: true});
    		//=> '_foo-bar'
    		```
    		*/
    val preserveLeadingUnderscore: js.UndefOr[Boolean] = js.undefined
    
    /**
    		@default '-'
    		@example
    		```
    		import slugify = require('@sindresorhus/slugify');
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
      
      @scala.inline
      def setDecamelize(value: Boolean): Self = StObject.set(x, "decamelize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecamelizeUndefined: Self = StObject.set(x, "decamelize", js.undefined)
      
      @scala.inline
      def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      @scala.inline
      def setPreserveLeadingUnderscore(value: Boolean): Self = StObject.set(x, "preserveLeadingUnderscore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLeadingUnderscoreUndefined: Self = StObject.set(x, "preserveLeadingUnderscore", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
