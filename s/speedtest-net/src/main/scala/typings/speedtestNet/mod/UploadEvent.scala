package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.upload
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sent when the test is in the upload phase. */
@js.native
trait UploadEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double = js.native
  
  var timestamp: Date = js.native
  
  @JSName("type")
  var type_UploadEvent: upload = js.native
  
  var upload: DownloadUploadData = js.native
}
object UploadEvent {
  
  @scala.inline
  def apply(progress: Double, timestamp: Date, `type`: upload, upload: DownloadUploadData): UploadEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadEvent]
  }
  
  @scala.inline
  implicit class UploadEventOps[Self <: UploadEvent] (val x: Self) extends AnyVal {
    
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: upload): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: DownloadUploadData): Self = this.set("upload", value.asInstanceOf[js.Any])
  }
}
