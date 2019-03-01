package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgress extends js.Object {
  /**
    * The number of bytes downloaded thus far.
    */
  var receivedBytes: scala.Double
  /**
    * The total number of bytes expected to be received for this update.
    */
  var totalBytes: scala.Double
}

object DownloadProgress {
  @scala.inline
  def apply(receivedBytes: scala.Double, totalBytes: scala.Double): DownloadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("receivedBytes")(receivedBytes)
    __obj.updateDynamic("totalBytes")(totalBytes)
    __obj.asInstanceOf[DownloadProgress]
  }
}

