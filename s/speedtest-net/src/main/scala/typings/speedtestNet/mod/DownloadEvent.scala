package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.download
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadEvent
  extends StObject
     with BaseEvent
     with SpeedTestEvent {
  
  var download: DownloadUploadData
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double
  
  var timestamp: Date
  
  @JSName("type")
  var type_DownloadEvent: download
}
object DownloadEvent {
  
  @scala.inline
  def apply(download: DownloadUploadData, progress: Double, timestamp: Date): DownloadEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("download")
    __obj.asInstanceOf[DownloadEvent]
  }
  
  @scala.inline
  implicit class DownloadEventMutableBuilder[Self <: DownloadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: DownloadUploadData): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: download): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
