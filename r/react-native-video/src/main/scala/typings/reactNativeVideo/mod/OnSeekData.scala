package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSeekData extends StObject {
  
  var currentTime: Double
  
  var seekTime: Double
  
  var target: js.UndefOr[Double] = js.undefined
}
object OnSeekData {
  
  @scala.inline
  def apply(currentTime: Double, seekTime: Double): OnSeekData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], seekTime = seekTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSeekData]
  }
  
  @scala.inline
  implicit class OnSeekDataMutableBuilder[Self <: OnSeekData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
