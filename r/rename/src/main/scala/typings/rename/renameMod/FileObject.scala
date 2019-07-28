package typings.rename.renameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObject extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  // using package's terminology
  var dirname: js.UndefOr[String] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object FileObject {
  @scala.inline
  def apply(
    basename: String = null,
    dirname: String = null,
    extname: String = null,
    hash: String = null,
    path: String = null
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

