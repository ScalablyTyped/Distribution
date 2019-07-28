package typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidDisappearEvent extends ComponentEvent {
  var componentName: String
}

object ComponentDidDisappearEvent {
  @scala.inline
  def apply(componentId: String, componentName: String): ComponentDidDisappearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId, componentName = componentName)
  
    __obj.asInstanceOf[ComponentDidDisappearEvent]
  }
}

