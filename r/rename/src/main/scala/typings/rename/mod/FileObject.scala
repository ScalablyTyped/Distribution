package typings.rename.mod

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
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (extname != null) __obj.updateDynamic("extname")(extname.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObject]
  }
}

