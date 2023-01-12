package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnProgressData extends StObject {
  
  var currentTime: Double
  
  var playableDuration: Double
  
  var seekableDuration: Double
}
object OnProgressData {
  
  inline def apply(currentTime: Double, playableDuration: Double, seekableDuration: Double): OnProgressData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], playableDuration = playableDuration.asInstanceOf[js.Any], seekableDuration = seekableDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnProgressData] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setPlayableDuration(value: Double): Self = StObject.set(x, "playableDuration", value.asInstanceOf[js.Any])
    
    inline def setSeekableDuration(value: Double): Self = StObject.set(x, "seekableDuration", value.asInstanceOf[js.Any])
  }
}
