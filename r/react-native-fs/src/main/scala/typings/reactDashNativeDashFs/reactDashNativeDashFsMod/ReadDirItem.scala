package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirItem extends js.Object {
  var ctime: js.UndefOr[Date] = js.undefined
  // The creation date of the file (iOS only)
  var mtime: js.UndefOr[Date] = js.undefined
  // The last modified date of the file
  var name: String
  // The name of the item
  var path: String
  // The absolute path to the item
  var size: String
  // Is the file just a file?
  def isDirectory(): Boolean
  // Size in bytes
  def isFile(): Boolean
}

object ReadDirItem {
  @scala.inline
  def apply(
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    name: String,
    path: String,
    size: String,
    ctime: Date = null,
    mtime: Date = null
  ): ReadDirItem = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirItem]
  }
}

