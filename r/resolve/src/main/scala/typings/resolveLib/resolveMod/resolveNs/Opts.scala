package typings
package resolveLib.resolveMod.resolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /** directory to begin resolving from (defaults to __dirname) */
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  /** array of file extensions to search in order (defaults to ['.js']) */
  var extensions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** directory (or directories) in which to recursively look for modules. (default to 'node_modules') */
  var moduleDirectory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** package.json data applicable to the module being loaded */
  var `package`: js.UndefOr[js.Any] = js.undefined
  /** transform the parsed package.json contents before looking at the "main" field */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ js.Any, /* pkgfile */ java.lang.String, _]] = js.undefined
  /** transform a path within a package */
  var pathFilter: js.UndefOr[
    js.Function3[
      /* pkg */ js.Any, 
      /* path */ java.lang.String, 
      /* relativePath */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  /** require.paths array to use if nothing is found on the normal node_modules recursive walk (probably don't use this) */
  var paths: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * if true, doesn't resolve `basedir` to real path before resolving.
    * This is the way Node resolves dependencies when executed with the --preserve-symlinks flag.
    *
    * Note: this property is currently true by default but it will be changed to false in the next major version because Node's resolution
    * algorithm does not preserve symlinks by default.
    */
  var preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
}

