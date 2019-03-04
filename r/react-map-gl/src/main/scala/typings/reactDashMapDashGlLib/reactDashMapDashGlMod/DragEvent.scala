package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEvent
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var lngLat: js.Tuple2[scala.Double, scala.Double]
}

object DragEvent {
  @scala.inline
  def apply(
    lngLat: js.Tuple2[scala.Double, scala.Double],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DragEvent = {
    val __obj = js.Dynamic.literal(lngLat = lngLat)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DragEvent]
  }
}

