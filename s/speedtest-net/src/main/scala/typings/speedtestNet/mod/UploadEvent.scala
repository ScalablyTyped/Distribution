package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sent when the test is in the upload phase. */
trait UploadEvent
  extends StObject
     with BaseEvent
     with SpeedTestEvent {
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double
  
  var timestamp: js.Date
  
  @JSName("type")
  var type_UploadEvent: upload
  
  var upload: DownloadUploadData
}
object UploadEvent {
  
  inline def apply(progress: Double, timestamp: js.Date, upload: DownloadUploadData): UploadEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("upload")
    __obj.asInstanceOf[UploadEvent]
  }
  
  extension [Self <: UploadEvent](x: Self) {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: upload): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: DownloadUploadData): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
