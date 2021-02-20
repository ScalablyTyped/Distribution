package typings.resolveGlobal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Resolve the path of a globally installed module.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved path. Throws if the module can't be found.
  	@example
  	```
  	// $ npm install --global cat-names
  	import resolveGlobal = require('resolve-global');
  	console.log(resolveGlobal('cat-names'));
  	//=> '/usr/local/lib/node_modules/cat-names'
  	```
  	*/
  @JSImport("resolve-global", JSImport.Namespace)
  @js.native
  def apply(moduleId: String): String = js.native
  
  /**
  	Resolve the path of a globally installed module.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved path. Returns `undefined` instead of throwing if the module can't be found.
  	*/
  @JSImport("resolve-global", "silent")
  @js.native
  def silent(moduleId: String): js.UndefOr[String] = js.native
}
