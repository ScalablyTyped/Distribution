package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatResult extends js.Object {
  // UNIX file mode
  var ctime: Double
  // Size in bytes
  var mode: Double
  // Created date
  var mtime: Double
  var name: js.UndefOr[String] = js.undefined
  // Last modified date
  var originalFilepath: String
  // The name of the item TODO: why is this not documented?
  var path: String
  // The absolute path to the item
  var size: String
  // Is the file just a file?
  def isDirectory(): Boolean
  // In case of content uri this is the pointed file path, otherwise is the same as path
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
    originalFilepath: String,
    path: String,
    size: String,
    name: String = null
  ): StatResult = {
    val __obj = js.Dynamic.literal(ctime = ctime, isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), mode = mode, mtime = mtime, originalFilepath = originalFilepath, path = path, size = size)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StatResult]
  }
}

