package typings.resolve.resolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /** package.json data applicable to the module being loaded */
  @JSName("package")
  var _package: js.UndefOr[js.Any] = js.undefined
  /** directory to begin resolving from (defaults to __dirname) */
  var basedir: js.UndefOr[String] = js.undefined
  /** array of file extensions to search in order (defaults to ['.js']) */
  var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
  /** directory (or directories) in which to recursively look for modules. (default to 'node_modules') */
  var moduleDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
  /** transform the parsed package.json contents before looking at the "main" field */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ js.Any, /* pkgfile */ String, _]] = js.undefined
  /** transform a path within a package */
  var pathFilter: js.UndefOr[
    js.Function3[/* pkg */ js.Any, /* path */ String, /* relativePath */ String, String]
  ] = js.undefined
  /** require.paths array to use if nothing is found on the normal node_modules recursive walk (probably don't use this) */
  var paths: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * if true, doesn't resolve `basedir` to real path before resolving.
    * This is the way Node resolves dependencies when executed with the --preserve-symlinks flag.
    *
    * Note: this property is currently true by default but it will be changed to false in the next major version because Node's resolution
    * algorithm does not preserve symlinks by default.
    */
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    _package: js.Any = null,
    basedir: String = null,
    extensions: String | js.Array[String] = null,
    moduleDirectory: String | js.Array[String] = null,
    packageFilter: (/* pkg */ js.Any, /* pkgfile */ String) => _ = null,
    pathFilter: (/* pkg */ js.Any, /* path */ String, /* relativePath */ String) => String = null,
    paths: String | js.Array[String] = null,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2(packageFilter))
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(js.Any.fromFunction3(pathFilter))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

