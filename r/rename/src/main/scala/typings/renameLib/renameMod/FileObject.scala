package typings
package renameLib.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  // using package's terminology
  var dirname: js.UndefOr[java.lang.String] = js.undefined
  var extname: js.UndefOr[java.lang.String] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object FileObject {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    dirname: java.lang.String = null,
    extname: java.lang.String = null,
    hash: java.lang.String = null,
    path: java.lang.String = null
  ): FileObject = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[FileObject]
  }
}

