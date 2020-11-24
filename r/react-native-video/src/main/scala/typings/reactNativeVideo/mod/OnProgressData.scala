package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnProgressData extends js.Object {
  
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
  implicit class OnProgressDataOps[Self <: OnProgressData] (val x: Self) extends AnyVal {
    
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayableDuration(value: Double): Self = this.set("playableDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekableDuration(value: Double): Self = this.set("seekableDuration", value.asInstanceOf[js.Any])
  }
}
