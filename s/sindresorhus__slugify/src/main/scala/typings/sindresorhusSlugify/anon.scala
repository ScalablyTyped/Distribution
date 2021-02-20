package typings.sindresorhusSlugify

import typings.sindresorhusSlugify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(string: String): String = js.native
    def apply(string: String, options: Options): String = js.native
    
    /**
    		Reset the counter.
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
    		*/
    def reset(): Unit = js.native
  }
}
