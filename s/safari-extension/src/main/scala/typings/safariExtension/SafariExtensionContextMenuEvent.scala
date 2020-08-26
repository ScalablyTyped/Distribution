package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionContextMenuEvent extends SafariEvent {
  /**
    * The context menu being built up.
    */
  var contextMenu: SafariExtensionContextMenu = js.native
  /**
    * The object that the event is currently being sent to.
    * This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
    */
  @JSName("currentTarget")
  var currentTarget_SafariExtensionContextMenuEvent: SafariExtensionContextMenuItem = js.native
  /**
    * The target of the event.
    * This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
    */
  @JSName("target")
  var target_SafariExtensionContextMenuEvent: SafariExtensionContextMenuItem = js.native
  /**
    * Information about the current context menu event.
    */
  var userInfo: js.Any = js.native
}

object SafariExtensionContextMenuEvent {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class SafariExtensionContextMenuEventOps[Self <: SafariExtensionContextMenuEvent] (val x: Self) extends AnyVal {
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
    def setContextMenu(value: SafariExtensionContextMenu): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: SafariExtensionContextMenuItem): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: SafariExtensionContextMenuItem): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
  }
  
}

