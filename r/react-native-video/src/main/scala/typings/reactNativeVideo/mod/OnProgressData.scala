package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnProgressData extends StObject {
  
  var currentTime: Double = js.native
  
  var playableDuration: Double = js.native
  
  var seekableDuration: Double = js.native
}
object OnProgressData {
  
  @scala.inline
  def apply(currentTime: Double, playableDuration: Double, seekableDuration: Double): OnProgressData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], playableDuration = playableDuration.asInstanceOf[js.Any], seekableDuration = seekableDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressData]
  }
  
  @scala.inline
  implicit class OnProgressDataMutableBuilder[Self <: OnProgressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayableDuration(value: Double): Self = StObject.set(x, "playableDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekableDuration(value: Double): Self = StObject.set(x, "seekableDuration", value.asInstanceOf[js.Any])
  }
}
