package typings
package reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidAppearEvent extends ComponentEvent {
  var componentName: java.lang.String
}

object ComponentDidAppearEvent {
  @scala.inline
  def apply(componentId: java.lang.String, componentName: java.lang.String): ComponentDidAppearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId, componentName = componentName)
  
    __obj.asInstanceOf[ComponentDidAppearEvent]
  }
}

