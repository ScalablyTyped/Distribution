package typings
package resolveLib.resolveMod.resolveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOpts extends Opts {
  /** function to synchronously test whether a file exists */
  var isFile: js.UndefOr[js.Function1[/* file */ java.lang.String, scala.Boolean]] = js.undefined
  /** how to read files synchronously (defaults to fs.readFileSync) */
  var readFileSync: js.UndefOr[
    js.Function2[
      /* file */ java.lang.String, 
      /* charset */ java.lang.String, 
      java.lang.String | nodeLib.Buffer
    ]
  ] = js.undefined
}

object SyncOpts {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    extensions: java.lang.String | js.Array[java.lang.String] = null,
    isFile: /* file */ java.lang.String => scala.Boolean = null,
    moduleDirectory: java.lang.String | js.Array[java.lang.String] = null,
    `package`: js.Any = null,
    packageFilter: (/* pkg */ js.Any, /* pkgfile */ java.lang.String) => _ = null,
    pathFilter: (/* pkg */ js.Any, /* path */ java.lang.String, /* relativePath */ java.lang.String) => java.lang.String = null,
    paths: java.lang.String | js.Array[java.lang.String] = null,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    readFileSync: (/* file */ java.lang.String, /* charset */ java.lang.String) => java.lang.String | nodeLib.Buffer = null
  ): SyncOpts = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (isFile != null) __obj.updateDynamic("isFile")(js.Any.fromFunction1(isFile))
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2(packageFilter))
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(js.Any.fromFunction3(pathFilter))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(js.Any.fromFunction2(readFileSync))
    __obj.asInstanceOf[SyncOpts]
  }
}

