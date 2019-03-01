package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatResult extends js.Object {
  // Created date
  var ctime: scala.Double
  // UNIX file mode
  var mode: scala.Double
  // Updated date
  var mtime: scala.Double
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

object StatResult {
  @scala.inline
  def apply(
    ctime: scala.Double,
    isDirectory: js.Function0[scala.Boolean],
    isFile: js.Function0[scala.Boolean],
    mode: scala.Double,
    mtime: scala.Double,
    name: java.lang.String,
    path: java.lang.String,
    size: java.lang.String
  ): StatResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctime")(ctime)
    __obj.updateDynamic("isDirectory")(isDirectory)
    __obj.updateDynamic("isFile")(isFile)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[StatResult]
  }
}

