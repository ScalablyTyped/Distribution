package typings.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloaterProps extends js.Object {
  
  var disableAnimation: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[GenericObject] = js.native
  
  var styles: js.UndefOr[GenericObject] = js.native
  
  var wrapperOptions: js.UndefOr[GenericObject] = js.native
}
object FloaterProps {
  
  @scala.inline
  def apply(): FloaterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloaterProps]
  }
  
  @scala.inline
  implicit class FloaterPropsOps[Self <: FloaterProps] (val x: Self) extends AnyVal {
    
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
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    
    @scala.inline
    def setOptions(value: GenericObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setStyles(value: GenericObject): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setWrapperOptions(value: GenericObject): Self = this.set("wrapperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperOptions: Self = this.set("wrapperOptions", js.undefined)
  }
}
