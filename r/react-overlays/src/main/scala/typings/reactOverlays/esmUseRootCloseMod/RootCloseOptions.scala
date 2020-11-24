package typings.reactOverlays.esmUseRootCloseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootCloseOptions extends js.Object {
  
  var clickTrigger: js.UndefOr[MouseEvents] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
}
object RootCloseOptions {
  
  @scala.inline
  def apply(): RootCloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCloseOptions]
  }
  
  @scala.inline
  implicit class RootCloseOptionsOps[Self <: RootCloseOptions] (val x: Self) extends AnyVal {
    
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
    def setClickTrigger(value: MouseEvents): Self = this.set("clickTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTrigger: Self = this.set("clickTrigger", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
