package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPlaybackRateData extends StObject {
  
  var playbackRate: Double
}
object OnPlaybackRateData {
  
  inline def apply(playbackRate: Double): OnPlaybackRateData = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackRateData]
  }
  
  extension [Self <: OnPlaybackRateData](x: Self) {
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
