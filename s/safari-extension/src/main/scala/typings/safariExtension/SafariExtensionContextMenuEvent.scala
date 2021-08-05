package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariExtensionContextMenuEvent
  extends StObject
     with SafariEvent {
  
  /**
    * The context menu being built up.
    */
  var contextMenu: SafariExtensionContextMenu
  
  /**
    * The object that the event is currently being sent to.
    * This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
    */
  @JSName("currentTarget")
  var currentTarget_SafariExtensionContextMenuEvent: SafariExtensionContextMenuItem
  
  /**
    * The target of the event.
    * This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
    */
  @JSName("target")
  var target_SafariExtensionContextMenuEvent: SafariExtensionContextMenuItem
  
  /**
    * Information about the current context menu event.
    */
  var userInfo: js.Any
}
object SafariExtensionContextMenuEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    contextMenu: SafariExtensionContextMenu,
    currentTarget: SafariExtensionContextMenuItem,
    defaultPrevented: Boolean,
    eventPhase: Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariExtensionContextMenuItem,
    timestamp: Double,
    `type`: String,
    userInfo: js.Any
  ): SafariExtensionContextMenuEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionContextMenuEvent]
  }
  
  extension [Self <: SafariExtensionContextMenuEvent](x: Self) {
    
    inline def setContextMenu(value: SafariExtensionContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: SafariExtensionContextMenuItem): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: SafariExtensionContextMenuItem): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
