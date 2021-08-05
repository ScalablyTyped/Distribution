package typings.reactNativeGoby.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadProgress extends StObject {
  
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
  
  inline def apply(receivedBytes: Double, totalBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(receivedBytes = receivedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgress]
  }
  
  extension [Self <: DownloadProgress](x: Self) {
    
    inline def setReceivedBytes(value: Double): Self = StObject.set(x, "receivedBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
  }
}
