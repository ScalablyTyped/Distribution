package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsDataLayerEventMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLayerEvent
  extends /* key */ StringDictionary[js.Any] {
  var event: String
}

object DataLayerEvent {
  @scala.inline
  def apply(event: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): DataLayerEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DataLayerEvent]
  }
}

