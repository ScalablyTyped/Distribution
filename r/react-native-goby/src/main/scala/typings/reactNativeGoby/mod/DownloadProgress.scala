package typings.reactNativeGoby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadProgress extends js.Object {
  /**
    * The number of bytes downloaded thus far.
    */
  var receivedBytes: Double = js.native
  /**
    * The total number of bytes expected to be received for this update.
    */
  var totalBytes: Double = js.native
}

object DownloadProgress {
  @scala.inline
  def apply(receivedBytes: Double, totalBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(receivedBytes = receivedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgress]
  }
  @scala.inline
  implicit class DownloadProgressOps[Self <: DownloadProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReceivedBytes(value: Double): Self = this.set("receivedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
  }
  
}

