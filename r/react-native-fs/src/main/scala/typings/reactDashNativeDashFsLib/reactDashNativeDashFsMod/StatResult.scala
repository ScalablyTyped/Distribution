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

