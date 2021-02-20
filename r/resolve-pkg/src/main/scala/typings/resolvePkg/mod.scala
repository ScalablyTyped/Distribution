package typings.resolvePkg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Resolve the path of a package regardless of it having an entry point.
  @param moduleId - What you would use in `require()`.
  @example
  ```
  import resolvePkg = require('resolve-pkg');
  // $ npm install --save-dev grunt-svgmin
  resolvePkg('grunt-svgmin/tasks', {cwd: __dirname});
  //=> '/Users/sindresorhus/unicorn/node_modules/grunt-svgmin/tasks'
  // Fails here as Grunt tasks usually don't have a defined main entry point
  require.resolve('grunt-svgmin/tasks');
  //=> Error: Cannot find module 'grunt-svgmin'
  ```
  */
  @JSImport("resolve-pkg", JSImport.Namespace)
  @js.native
  def apply(moduleId: String): js.UndefOr[String] = js.native
  @JSImport("resolve-pkg", JSImport.Namespace)
  @js.native
  def apply(moduleId: String, options: Options): js.UndefOr[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Directory to resolve from.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
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
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
