package typings.resolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  /** package.json data applicable to the module being loaded */
  @JSName("package")
  var _package: js.UndefOr[js.Any] = js.native
  /** directory to begin resolving from (defaults to __dirname) */
  var basedir: js.UndefOr[String] = js.native
  /** array of file extensions to search in order (defaults to ['.js']) */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  /** directory (or directories) in which to recursively look for modules. (default to 'node_modules') */
  var moduleDirectory: js.UndefOr[String | js.Array[String]] = js.native
  /** transform the parsed package.json contents before looking at the "main" field */
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ js.Any, /* pkgfile */ String, _]] = js.native
  /** return the list of candidate paths where the packages sources may be found (probably don't use this) */
  var packageIterator: js.UndefOr[
    js.Function4[
      /* request */ String, 
      /* start */ String, 
      /* getPackageCandidates */ js.Function0[js.Array[String]], 
      /* opts */ this.type, 
      js.Array[String]
    ]
  ] = js.native
  /** transform a path within a package */
  var pathFilter: js.UndefOr[
    js.Function3[/* pkg */ js.Any, /* path */ String, /* relativePath */ String, String]
  ] = js.native
  /** require.paths array to use if nothing is found on the normal node_modules recursive walk (probably don't use this) */
  var paths: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * if true, doesn't resolve `basedir` to real path before resolving.
    * This is the way Node resolves dependencies when executed with the --preserve-symlinks flag.
    *
    * Note: this property is currently true by default but it will be changed to false in the next major version because Node's resolution
    * algorithm does not preserve symlinks by default.
    */
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
}

object Opts {
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_package(value: js.Any): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: String | js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setModuleDirectoryVarargs(value: String*): Self = this.set("moduleDirectory", js.Array(value :_*))
    @scala.inline
    def setModuleDirectory(value: String | js.Array[String]): Self = this.set("moduleDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleDirectory: Self = this.set("moduleDirectory", js.undefined)
    @scala.inline
    def setPackageFilter(value: (/* pkg */ js.Any, /* pkgfile */ String) => _): Self = this.set("packageFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deletePackageFilter: Self = this.set("packageFilter", js.undefined)
    @scala.inline
    def setPackageIterator(
      value: (/* request */ String, /* start */ String, /* getPackageCandidates */ js.Function0[js.Array[String]], Opts) => js.Array[String]
    ): Self = this.set("packageIterator", js.Any.fromFunction4(value))
    @scala.inline
    def deletePackageIterator: Self = this.set("packageIterator", js.undefined)
    @scala.inline
    def setPathFilter(value: (/* pkg */ js.Any, /* path */ String, /* relativePath */ String) => String): Self = this.set("pathFilter", js.Any.fromFunction3(value))
    @scala.inline
    def deletePathFilter: Self = this.set("pathFilter", js.undefined)
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: String | js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setPreserveSymlinks(value: Boolean): Self = this.set("preserveSymlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveSymlinks: Self = this.set("preserveSymlinks", js.undefined)
  }
  
}

