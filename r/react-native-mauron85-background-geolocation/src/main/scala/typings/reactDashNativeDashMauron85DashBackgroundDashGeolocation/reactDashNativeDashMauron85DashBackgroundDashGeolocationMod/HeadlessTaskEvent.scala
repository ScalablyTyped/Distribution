package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadlessTaskEvent extends js.Object {
  /** Name of the event [ "location", "stationary", "activity" ] */
  var name: HeadlessTaskEventName
  /** Event parameters. */
  var params: js.Any
}

object HeadlessTaskEvent {
  @scala.inline
  def apply(name: HeadlessTaskEventName, params: js.Any): HeadlessTaskEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeadlessTaskEvent]
  }
}

