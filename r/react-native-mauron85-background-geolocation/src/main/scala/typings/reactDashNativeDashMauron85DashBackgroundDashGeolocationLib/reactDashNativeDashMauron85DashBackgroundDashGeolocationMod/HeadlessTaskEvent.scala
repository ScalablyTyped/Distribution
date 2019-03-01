package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadlessTaskEvent extends js.Object {
  /** Name of the event [ "location", "stationary", "activity" ] */
  var name: HeadlessTaskEventName
  /**
    * Event parameters.
    * @see {@link https://github.com/mauron85/react-native-background-geolocation#events|Events}
    */
  var params: js.Any
}

object HeadlessTaskEvent {
  @scala.inline
  def apply(name: HeadlessTaskEventName, params: js.Any): HeadlessTaskEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[HeadlessTaskEvent]
  }
}

