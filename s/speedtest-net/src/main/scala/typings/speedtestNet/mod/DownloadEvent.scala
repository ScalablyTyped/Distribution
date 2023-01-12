package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.download
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
  
  var timestamp: js.Date
  
  @JSName("type")
  var type_DownloadEvent: download
}
object DownloadEvent {
  
  inline def apply(download: DownloadUploadData, progress: Double, timestamp: js.Date): DownloadEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("download")
    __obj.asInstanceOf[DownloadEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadEvent] (val x: Self) extends AnyVal {
    
    inline def setDownload(value: DownloadUploadData): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: download): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
