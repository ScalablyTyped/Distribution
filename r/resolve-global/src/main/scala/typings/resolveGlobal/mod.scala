package typings.resolveGlobal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(moduleId: String): String = ^.asInstanceOf[js.Dynamic].apply(moduleId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("resolve-global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Resolve the path of a globally installed module.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved path. Returns `undefined` instead of throwing if the module can't be found.
  	*/
  @scala.inline
  def silent(moduleId: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("silent")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
