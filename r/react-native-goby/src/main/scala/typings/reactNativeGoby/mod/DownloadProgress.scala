package typings.reactNativeGoby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgress extends js.Object {
  /**
    * The number of bytes downloaded thus far.
    */
  var receivedBytes: Double
  /**
    * The total number of bytes expected to be received for this update.
    */
  var totalBytes: Double
}

object DownloadProgress {
  @scala.inline
  def apply(receivedBytes: Double, totalBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(receivedBytes = receivedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadProgress]
  }
}

