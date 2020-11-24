package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnExternalPlaybackChangeData extends js.Object {
  
  var isExternalPlaybackActive: Boolean = js.native
}
object OnExternalPlaybackChangeData {
  
  @scala.inline
  def apply(isExternalPlaybackActive: Boolean): OnExternalPlaybackChangeData = {
    val __obj = js.Dynamic.literal(isExternalPlaybackActive = isExternalPlaybackActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExternalPlaybackChangeData]
  }
  
  @scala.inline
  implicit class OnExternalPlaybackChangeDataOps[Self <: OnExternalPlaybackChangeData] (val x: Self) extends AnyVal {
    
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
    def setIsExternalPlaybackActive(value: Boolean): Self = this.set("isExternalPlaybackActive", value.asInstanceOf[js.Any])
  }
}
