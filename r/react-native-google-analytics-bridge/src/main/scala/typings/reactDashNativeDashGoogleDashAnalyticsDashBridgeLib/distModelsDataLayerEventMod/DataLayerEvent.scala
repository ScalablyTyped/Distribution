package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsDataLayerEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLayerEvent
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var event: java.lang.String
}

object DataLayerEvent {
  @scala.inline
  def apply(
    event: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DataLayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DataLayerEvent]
  }
}

