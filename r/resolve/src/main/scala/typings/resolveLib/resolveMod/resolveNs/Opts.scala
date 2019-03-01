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

object Opts {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    extensions: java.lang.String | js.Array[java.lang.String] = null,
    moduleDirectory: java.lang.String | js.Array[java.lang.String] = null,
    `package`: js.Any = null,
    packageFilter: js.Function2[/* pkg */ js.Any, /* pkgfile */ java.lang.String, _] = null,
    pathFilter: js.Function3[
      /* pkg */ js.Any, 
      /* path */ java.lang.String, 
      /* relativePath */ java.lang.String, 
      java.lang.String
    ] = null,
    paths: java.lang.String | js.Array[java.lang.String] = null,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(packageFilter)
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(pathFilter)
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    __obj.asInstanceOf[Opts]
  }
}

