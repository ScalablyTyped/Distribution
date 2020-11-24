package typings.storybookComponents.buttonButtonMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var containsIcon: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var gray: js.UndefOr[Boolean] = js.native
  
  var inForm: js.UndefOr[Boolean] = js.native
  
  var isLink: js.UndefOr[Boolean] = js.native
  
  var outline: js.UndefOr[Boolean] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var secondary: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  var tertiary: js.UndefOr[Boolean] = js.native
}
object ButtonProps {
  
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainsIcon(value: Boolean): Self = this.set("containsIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsIcon: Self = this.set("containsIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setGray(value: Boolean): Self = this.set("gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGray: Self = this.set("gray", js.undefined)
    
    @scala.inline
    def setInForm(value: Boolean): Self = this.set("inForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInForm: Self = this.set("inForm", js.undefined)
    
    @scala.inline
    def setIsLink(value: Boolean): Self = this.set("isLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLink: Self = this.set("isLink", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setTertiary(value: Boolean): Self = this.set("tertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTertiary: Self = this.set("tertiary", js.undefined)
  }
}
