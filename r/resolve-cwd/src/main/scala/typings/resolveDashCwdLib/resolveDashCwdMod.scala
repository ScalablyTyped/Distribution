package typings
package resolveDashCwdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-cwd", JSImport.Namespace)
@js.native
object resolveDashCwdMod extends js.Object {
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from the current working directory.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved module path.
  	@throws When the module can't be found.
  	@example
  	```
  	import resolveCwd = require('resolve-cwd');
  	console.log(__dirname);
  	//=> '/Users/sindresorhus/rainbow'
  	console.log(process.cwd());
  	//=> '/Users/sindresorhus/unicorn'
  	console.log(resolveCwd('./foo'));
  	//=> '/Users/sindresorhus/unicorn/foo.js'
  	```
  	*/
  def apply(moduleId: java.lang.String): java.lang.String = js.native
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from the current working directory.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved module path. Returns `undefined` instead of throwing when the module can't be found.
  	@example
  	```
  	import resolveCwd = require('resolve-cwd');
  	console.log(__dirname);
  	//=> '/Users/sindresorhus/rainbow'
  	console.log(process.cwd());
  	//=> '/Users/sindresorhus/unicorn'
  	console.log(resolveCwd.silent('./foo'));
  	//=> '/Users/sindresorhus/unicorn/foo.js'
  	```
  	*/
  def silent(moduleId: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

