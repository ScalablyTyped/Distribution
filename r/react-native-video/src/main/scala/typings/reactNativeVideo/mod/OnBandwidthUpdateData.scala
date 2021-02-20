package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBandwidthUpdateData extends StObject {
  
  var bitrate: Double = js.native
}
object OnBandwidthUpdateData {
  
  @scala.inline
  def apply(bitrate: Double): OnBandwidthUpdateData = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBandwidthUpdateData]
  }
  
  @scala.inline
  implicit class OnBandwidthUpdateDataMutableBuilder[Self <: OnBandwidthUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
  }
}
