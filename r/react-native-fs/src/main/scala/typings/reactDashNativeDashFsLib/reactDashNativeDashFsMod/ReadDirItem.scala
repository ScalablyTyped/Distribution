package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirItem extends js.Object {
  // The creation date of the file (iOS only)
  var ctime: js.UndefOr[stdLib.Date] = js.undefined
  // The last modified date of the file
  var mtime: js.UndefOr[stdLib.Date] = js.undefined
  // The name of the item
  var name: java.lang.String
  // The absolute path to the item
  var path: java.lang.String
  // Size in bytes
  var size: java.lang.String
  // Is the file a directory?
  def isDirectory(): scala.Boolean
  // Is the file just a file?
  def isFile(): scala.Boolean
}

object ReadDirItem {
  @scala.inline
  def apply(
    isDirectory: () => scala.Boolean,
    isFile: () => scala.Boolean,
    name: java.lang.String,
    path: java.lang.String,
    size: java.lang.String,
    ctime: stdLib.Date = null,
    mtime: stdLib.Date = null
  ): ReadDirItem = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name, path = path, size = size)
    if (ctime != null) __obj.updateDynamic("ctime")(ctime)
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    __obj.asInstanceOf[ReadDirItem]
  }
}

