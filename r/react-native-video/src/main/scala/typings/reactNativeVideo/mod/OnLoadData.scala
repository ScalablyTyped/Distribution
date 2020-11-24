package typings.reactNativeVideo.mod

import typings.reactNativeVideo.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnLoadData extends js.Object {
  
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
  implicit class OnLoadDataOps[Self <: OnLoadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanPlayFastForward(value: Boolean): Self = this.set("canPlayFastForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPlayReverse(value: Boolean): Self = this.set("canPlayReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPlaySlowForward(value: Boolean): Self = this.set("canPlaySlowForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPlaySlowReverse(value: Boolean): Self = this.set("canPlaySlowReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanStepBackward(value: Boolean): Self = this.set("canStepBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanStepForward(value: Boolean): Self = this.set("canStepForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalSize(value: Height): Self = this.set("naturalSize", value.asInstanceOf[js.Any])
  }
}
