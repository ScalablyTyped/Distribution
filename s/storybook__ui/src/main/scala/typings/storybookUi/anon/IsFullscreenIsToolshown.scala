package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFullscreenIsToolshown extends js.Object {
  
  var isFullscreen: Boolean = js.native
  
  var isToolshown: Boolean = js.native
}
object IsFullscreenIsToolshown {
  
  @scala.inline
  def apply(isFullscreen: Boolean, isToolshown: Boolean): IsFullscreenIsToolshown = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFullscreenIsToolshown]
  }
  
  @scala.inline
  implicit class IsFullscreenIsToolshownOps[Self <: IsFullscreenIsToolshown] (val x: Self) extends AnyVal {
    
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
    def setIsFullscreen(value: Boolean): Self = this.set("isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolshown(value: Boolean): Self = this.set("isToolshown", value.asInstanceOf[js.Any])
  }
}
