package typings.reactNotificationsComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DismissOptions extends js.Object {
  
  var click: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var onScreen: js.UndefOr[Boolean] = js.native
  
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var touch: js.UndefOr[Boolean] = js.native
  
  var waitForAnimation: js.UndefOr[Boolean] = js.native
}
object DismissOptions {
  
  @scala.inline
  def apply(): DismissOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DismissOptions]
  }
  
  @scala.inline
  implicit class DismissOptionsOps[Self <: DismissOptions] (val x: Self) extends AnyVal {
    
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
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setOnScreen(value: Boolean): Self = this.set("onScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScreen: Self = this.set("onScreen", js.undefined)
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setWaitForAnimation(value: Boolean): Self = this.set("waitForAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForAnimation: Self = this.set("waitForAnimation", js.undefined)
  }
}
