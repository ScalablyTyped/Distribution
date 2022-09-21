package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariExtensionContextMenuItemValidateEvent extends StObject {
  
  /**
    * The object that the event is currently being sent to.
    * This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
    */
  var currentTarget: SafariExtensionContextMenuItem
  
  /**
    * The target of the event.
    * This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
    */
  var target: SafariExtensionContextMenuItem
  
  /**
    * Information about the current context menu event.
    */
  var userInfo: Any
}
object SafariExtensionContextMenuItemValidateEvent {
  
  inline def apply(
    currentTarget: SafariExtensionContextMenuItem,
    target: SafariExtensionContextMenuItem,
    userInfo: Any
  ): SafariExtensionContextMenuItemValidateEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionContextMenuItemValidateEvent]
  }
  
  extension [Self <: SafariExtensionContextMenuItemValidateEvent](x: Self) {
    
    inline def setCurrentTarget(value: SafariExtensionContextMenuItem): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: SafariExtensionContextMenuItem): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
