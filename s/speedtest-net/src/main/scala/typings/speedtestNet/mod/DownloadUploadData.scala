package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadUploadData extends StObject {
  
  /** Bytes per second. */
  var bandwidth: Double
  
  var bytes: Double
  
  var elapsed: Double
  
  /** Indicates the progress of the current test. */
  var progress: js.UndefOr[Double] = js.undefined
}
object DownloadUploadData {
  
  @scala.inline
  def apply(bandwidth: Double, bytes: Double, elapsed: Double): DownloadUploadData = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadUploadData]
  }
  
  @scala.inline
  implicit class DownloadUploadDataMutableBuilder[Self <: DownloadUploadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
