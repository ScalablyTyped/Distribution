package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatResult extends js.Object {
  // Created date
  var ctime: Double
  // UNIX file mode
  var mode: Double
  // Updated date
  var mtime: Double
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

object StatResult {
  @scala.inline
  def apply(
    ctime: Double,
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    mode: Double,
    mtime: Double,
    name: String,
    path: String,
    size: String
  ): StatResult = {
    val __obj = js.Dynamic.literal(ctime = ctime, isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), mode = mode, mtime = mtime, name = name, path = path, size = size)
  
    __obj.asInstanceOf[StatResult]
  }
}

