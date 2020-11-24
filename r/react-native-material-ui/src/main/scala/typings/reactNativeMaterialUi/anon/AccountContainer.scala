package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountContainer extends js.Object {
  
  var accountContainer: js.UndefOr[ViewStyle] = js.native
  
  var activeAvatarContainer: js.UndefOr[ViewStyle] = js.native
  
  var avatarsContainer: js.UndefOr[ViewStyle] = js.native
  
  var container: js.UndefOr[ViewStyle] = js.native
  
  var inactiveAvatarContainer: js.UndefOr[ViewStyle] = js.native
  
  var topContainer: js.UndefOr[ViewStyle] = js.native
}
object AccountContainer {
  
  @scala.inline
  def apply(): AccountContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountContainer]
  }
  
  @scala.inline
  implicit class AccountContainerOps[Self <: AccountContainer] (val x: Self) extends AnyVal {
    
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
    def setAccountContainer(value: ViewStyle): Self = this.set("accountContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountContainer: Self = this.set("accountContainer", js.undefined)
    
    @scala.inline
    def setAccountContainerNull: Self = this.set("accountContainer", null)
    
    @scala.inline
    def setActiveAvatarContainer(value: ViewStyle): Self = this.set("activeAvatarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveAvatarContainer: Self = this.set("activeAvatarContainer", js.undefined)
    
    @scala.inline
    def setActiveAvatarContainerNull: Self = this.set("activeAvatarContainer", null)
    
    @scala.inline
    def setAvatarsContainer(value: ViewStyle): Self = this.set("avatarsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatarsContainer: Self = this.set("avatarsContainer", js.undefined)
    
    @scala.inline
    def setAvatarsContainerNull: Self = this.set("avatarsContainer", null)
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setInactiveAvatarContainer(value: ViewStyle): Self = this.set("inactiveAvatarContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveAvatarContainer: Self = this.set("inactiveAvatarContainer", js.undefined)
    
    @scala.inline
    def setInactiveAvatarContainerNull: Self = this.set("inactiveAvatarContainer", null)
    
    @scala.inline
    def setTopContainer(value: ViewStyle): Self = this.set("topContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopContainer: Self = this.set("topContainer", js.undefined)
    
    @scala.inline
    def setTopContainerNull: Self = this.set("topContainer", null)
  }
}
