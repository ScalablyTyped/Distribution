package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent extends js.Object {
  // backward compatibility: v3 interface
  var features: js.Array[_]
  var lngLat: js.Tuple2[scala.Double, scala.Double]
  var point: js.Tuple2[scala.Double, scala.Double]
  var srcEvent: js.Any
  var target: js.Any
  var `type`: java.lang.String
}

object PointerEvent {
  @scala.inline
  def apply(
    features: js.Array[_],
    lngLat: js.Tuple2[scala.Double, scala.Double],
    point: js.Tuple2[scala.Double, scala.Double],
    srcEvent: js.Any,
    target: js.Any,
    `type`: java.lang.String
  ): PointerEvent = {
    val __obj = js.Dynamic.literal(features = features, lngLat = lngLat, point = point, srcEvent = srcEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointerEvent]
  }
}

