package typings.resolvePkg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(moduleId: String): js.UndefOr[String] = js.native
  def apply(moduleId: String, options: Options): js.UndefOr[String] = js.native
}
