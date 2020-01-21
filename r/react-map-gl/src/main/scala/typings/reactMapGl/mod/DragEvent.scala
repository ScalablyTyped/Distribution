package typings.reactMapGl.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEvent
  extends /* key */ StringDictionary[js.Any] {
  var lngLat: js.Tuple2[Double, Double]
}

object DragEvent {
  @scala.inline
  def apply(lngLat: js.Tuple2[Double, Double], StringDictionary: /* key */ StringDictionary[js.Any] = null): DragEvent = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DragEvent]
  }
}

