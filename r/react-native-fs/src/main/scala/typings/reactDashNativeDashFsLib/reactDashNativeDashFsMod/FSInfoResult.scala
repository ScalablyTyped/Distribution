package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSInfoResult extends js.Object {
  // The amount of available storage space on the device (in bytes).
  var freeSpace: scala.Double
  // The total amount of storage space on the device (in bytes).
  var totalSpace: scala.Double
}

object FSInfoResult {
  @scala.inline
  def apply(freeSpace: scala.Double, totalSpace: scala.Double): FSInfoResult = {
    val __obj = js.Dynamic.literal(freeSpace = freeSpace, totalSpace = totalSpace)
  
    __obj.asInstanceOf[FSInfoResult]
  }
}

