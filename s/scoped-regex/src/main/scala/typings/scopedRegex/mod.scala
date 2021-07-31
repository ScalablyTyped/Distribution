package typings.scopedRegex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Regular expression for matching [scoped npm package names](https://docs.npmjs.com/misc/scope).
  	@returns A `RegExp` for matching scoped package names.
  	@example
  	```
  	import scopedRegex = require('scoped-regex');
  	scopedRegex({exact: true}).test('@sindresorhus/df');
  	//=> true
  	'foo @sindresorhus/df bar'.match(scopedRegex());
  	//=> ['@sindresorhus/df']
  	```
  	*/
  @scala.inline
  def apply(): RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RegExp]
  @scala.inline
  def apply(options: Options): RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  
  @JSImport("scoped-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function scopedRegex(options?: scopedRegex.Options): RegExp;
  // export = scopedRegex;
  @JSImport("scoped-regex", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof scopedRegex */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof scopedRegex */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Only match an exact string. By default, it matches any scoped package names in a string. Useful with `RegExp#test()` to check if a string is a scoped package name.
    		@default false
    		*/
    val exact: js.UndefOr[Boolean] = js.undefined
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
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
}
