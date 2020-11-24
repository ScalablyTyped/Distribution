package typings.semanticUiReact.transitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionablePortalState extends js.Object {
  
  var portalOpen: Boolean = js.native
  
  var transitionVisible: Boolean = js.native
}
object TransitionablePortalState {
  
  @scala.inline
  def apply(portalOpen: Boolean, transitionVisible: Boolean): TransitionablePortalState = {
    val __obj = js.Dynamic.literal(portalOpen = portalOpen.asInstanceOf[js.Any], transitionVisible = transitionVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionablePortalState]
  }
  
  @scala.inline
  implicit class TransitionablePortalStateOps[Self <: TransitionablePortalState] (val x: Self) extends AnyVal {
    
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
    def setPortalOpen(value: Boolean): Self = this.set("portalOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionVisible(value: Boolean): Self = this.set("transitionVisible", value.asInstanceOf[js.Any])
  }
}
