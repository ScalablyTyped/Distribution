package typings.speedtestNet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadUploadData extends js.Object {
  
  /** Bytes per second. */
  var bandwidth: Double = js.native
  
  var bytes: Double = js.native
  
  var elapsed: Double = js.native
  
  /** Indicates the progress of the current test. */
  var progress: js.UndefOr[Double] = js.native
}
object DownloadUploadData {
  
  @scala.inline
  def apply(bandwidth: Double, bytes: Double, elapsed: Double): DownloadUploadData = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadUploadData]
  }
  
  @scala.inline
  implicit class DownloadUploadDataOps[Self <: DownloadUploadData] (val x: Self) extends AnyVal {
    
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
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
