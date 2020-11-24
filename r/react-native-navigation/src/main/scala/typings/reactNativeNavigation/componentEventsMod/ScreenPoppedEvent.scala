package typings.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenPoppedEvent extends ComponentEvent
object ScreenPoppedEvent {
  
  @scala.inline
  def apply(componentId: String): ScreenPoppedEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenPoppedEvent]
  }
}
