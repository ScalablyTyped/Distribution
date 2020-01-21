package typings.resolveGlobal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-global", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  def apply(moduleId: String): String = js.native
  /**
  	Resolve the path of a globally installed module.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved path. Returns `undefined` instead of throwing if the module can't be found.
  	*/
  def silent(moduleId: String): js.UndefOr[String] = js.native
}

