package typings.reactNativeVideo.mod

import typings.reactNativeVideo.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnLoadData extends StObject {
  
  var canPlayFastForward: Boolean = js.native
  
  var canPlayReverse: Boolean = js.native
  
  var canPlaySlowForward: Boolean = js.native
  
  var canPlaySlowReverse: Boolean = js.native
  
  var canStepBackward: Boolean = js.native
  
  var canStepForward: Boolean = js.native
  
  var currentTime: Double = js.native
  
  var duration: Double = js.native
  
  var naturalSize: Height = js.native
}
object OnLoadData {
  
  @scala.inline
  def apply(
    canPlayFastForward: Boolean,
    canPlayReverse: Boolean,
    canPlaySlowForward: Boolean,
    canPlaySlowReverse: Boolean,
    canStepBackward: Boolean,
    canStepForward: Boolean,
    currentTime: Double,
    duration: Double,
    naturalSize: Height
  ): OnLoadData = {
    val __obj = js.Dynamic.literal(canPlayFastForward = canPlayFastForward.asInstanceOf[js.Any], canPlayReverse = canPlayReverse.asInstanceOf[js.Any], canPlaySlowForward = canPlaySlowForward.asInstanceOf[js.Any], canPlaySlowReverse = canPlaySlowReverse.asInstanceOf[js.Any], canStepBackward = canStepBackward.asInstanceOf[js.Any], canStepForward = canStepForward.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], naturalSize = naturalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoadData]
  }
  
  @scala.inline
  implicit class OnLoadDataMutableBuilder[Self <: OnLoadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPlayFastForward(value: Boolean): Self = StObject.set(x, "canPlayFastForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPlayReverse(value: Boolean): Self = StObject.set(x, "canPlayReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPlaySlowForward(value: Boolean): Self = StObject.set(x, "canPlaySlowForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPlaySlowReverse(value: Boolean): Self = StObject.set(x, "canPlaySlowReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanStepBackward(value: Boolean): Self = StObject.set(x, "canStepBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanStepForward(value: Boolean): Self = StObject.set(x, "canStepForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalSize(value: Height): Self = StObject.set(x, "naturalSize", value.asInstanceOf[js.Any])
  }
}
