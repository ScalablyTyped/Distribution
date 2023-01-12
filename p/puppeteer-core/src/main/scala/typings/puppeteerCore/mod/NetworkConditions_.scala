package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConditions_ extends StObject {
  
  var download: Double
  
  var latency: Double
  
  var upload: Double
}
object NetworkConditions_ {
  
  inline def apply(download: Double, latency: Double, upload: Double): NetworkConditions_ = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConditions_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkConditions_] (val x: Self) extends AnyVal {
    
    inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
