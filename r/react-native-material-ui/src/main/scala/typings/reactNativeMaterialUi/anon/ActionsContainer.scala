package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsContainer extends js.Object {
  
  var actionsContainer: js.UndefOr[ViewStyle] = js.native
}
object ActionsContainer {
  
  @scala.inline
  def apply(): ActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsContainer]
  }
  
  @scala.inline
  implicit class ActionsContainerOps[Self <: ActionsContainer] (val x: Self) extends AnyVal {
    
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
    def setActionsContainer(value: ViewStyle): Self = this.set("actionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsContainer: Self = this.set("actionsContainer", js.undefined)
    
    @scala.inline
    def setActionsContainerNull: Self = this.set("actionsContainer", null)
  }
}
