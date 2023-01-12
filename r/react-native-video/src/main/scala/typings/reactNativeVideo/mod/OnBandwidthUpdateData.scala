package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBandwidthUpdateData extends StObject {
  
  var bitrate: Double
}
object OnBandwidthUpdateData {
  
  inline def apply(bitrate: Double): OnBandwidthUpdateData = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBandwidthUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBandwidthUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
  }
}
