package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationButtonPressedEvent extends ComponentEvent {
  
  var buttonId: String = js.native
}
object NavigationButtonPressedEvent {
  
  @scala.inline
  def apply(buttonId: String, componentId: String): NavigationButtonPressedEvent = {
    val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationButtonPressedEvent]
  }
  
  @scala.inline
  implicit class NavigationButtonPressedEventOps[Self <: NavigationButtonPressedEvent] (val x: Self) extends AnyVal {
    
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
    def setButtonId(value: String): Self = this.set("buttonId", value.asInstanceOf[js.Any])
  }
}
