package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionContextMenuItemValidateEvent extends js.Object {
  
  /**
    * The object that the event is currently being sent to.
    * This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
    */
  var currentTarget: SafariExtensionContextMenuItem = js.native
  
  /**
    * The target of the event.
    * This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
    */
  var target: SafariExtensionContextMenuItem = js.native
  
  /**
    * Information about the current context menu event.
    */
  var userInfo: js.Any = js.native
}
object SafariExtensionContextMenuItemValidateEvent {
  
  @scala.inline
  def apply(
    currentTarget: SafariExtensionContextMenuItem,
    target: SafariExtensionContextMenuItem,
    userInfo: js.Any
  ): SafariExtensionContextMenuItemValidateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionContextMenuItemValidateEvent]
  }
  
  @scala.inline
  implicit class SafariExtensionContextMenuItemValidateEventOps[Self <: SafariExtensionContextMenuItemValidateEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentTarget(value: SafariExtensionContextMenuItem): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: SafariExtensionContextMenuItem): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
}
