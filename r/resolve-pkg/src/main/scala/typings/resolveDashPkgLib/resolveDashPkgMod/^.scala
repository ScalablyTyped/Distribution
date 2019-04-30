package typings
package resolveDashPkgLib.resolveDashPkgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-pkg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(moduleId: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def apply(moduleId: java.lang.String, options: Options): js.UndefOr[java.lang.String] = js.native
}

