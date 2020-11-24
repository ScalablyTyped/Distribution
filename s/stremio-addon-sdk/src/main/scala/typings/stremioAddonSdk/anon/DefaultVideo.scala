package typings.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultVideo extends js.Object {
  
  /**
    * Set to a Video Object id in order to open the Detail page directly to that video's streams.
    */
  var defaultVideo: js.UndefOr[Boolean | String] = js.native
}
object DefaultVideo {
  
  @scala.inline
  def apply(): DefaultVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultVideo]
  }
  
  @scala.inline
  implicit class DefaultVideoOps[Self <: DefaultVideo] (val x: Self) extends AnyVal {
    
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
    def setDefaultVideo(value: Boolean | String): Self = this.set("defaultVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVideo: Self = this.set("defaultVideo", js.undefined)
  }
}
