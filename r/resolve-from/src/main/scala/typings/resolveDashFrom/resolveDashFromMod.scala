package typings.resolveDashFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-from", JSImport.Namespace)
@js.native
object resolveDashFromMod extends js.Object {
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from a given path.
  	@param fromDirectory - Directory to resolve from.
  	@param moduleId - What you would use in `require()`.
  	@returns Resolved module path. Throws when the module can't be found.
  	@example
  	```
  	import resolveFrom = require('resolve-from');
  	// There is a file at `./foo/bar.js`
  	resolveFrom('foo', './bar');
  	//=> '/Users/sindresorhus/dev/test/foo/bar.js'
  	```
  	*/
  def apply(fromDirectory: String, moduleId: String): String = js.native
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from a given path.
  	@param fromDirectory - Directory to resolve from.
  	@param moduleId - What you would use in `require()`.
  	@returns Resolved module path or `undefined` when the module can't be found.
  	*/
  def silent(fromDirectory: String, moduleId: String): js.UndefOr[String] = js.native
}

