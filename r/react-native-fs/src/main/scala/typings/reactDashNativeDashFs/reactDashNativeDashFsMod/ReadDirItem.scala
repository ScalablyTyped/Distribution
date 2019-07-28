package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirItem extends js.Object {
  // The creation date of the file (iOS only)
  var ctime: js.UndefOr[Date] = js.undefined
  // The last modified date of the file
  var mtime: js.UndefOr[Date] = js.undefined
  // The name of the item
  var name: String
  // The absolute path to the item
  var path: String
  // Size in bytes
  var size: String
  // Is the file a directory?
  def isDirectory(): Boolean
  // Is the file just a file?
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
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name, path = path, size = size)
    if (ctime != null) __obj.updateDynamic("ctime")(ctime)
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    __obj.asInstanceOf[ReadDirItem]
  }
}

