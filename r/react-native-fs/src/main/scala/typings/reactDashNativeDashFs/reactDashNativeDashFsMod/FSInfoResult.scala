package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSInfoResult extends js.Object {
  // The total amount of storage space on the device (in bytes).
  var freeSpace: Double
  var totalSpace: Double
}

object FSInfoResult {
  @scala.inline
  def apply(freeSpace: Double, totalSpace: Double): FSInfoResult = {
    val __obj = js.Dynamic.literal(freeSpace = freeSpace, totalSpace = totalSpace)
  
    __obj.asInstanceOf[FSInfoResult]
  }
}

