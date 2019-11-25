package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent extends js.Object {
  // backward compatibility: v3 interface
  var features: js.Array[_]
  var lngLat: js.Tuple2[Double, Double]
  var point: js.Tuple2[Double, Double]
  var srcEvent: js.Any
  var target: js.Any
  var `type`: String
}

object PointerEvent {
  @scala.inline
  def apply(
    features: js.Array[_],
    lngLat: js.Tuple2[Double, Double],
    point: js.Tuple2[Double, Double],
    srcEvent: js.Any,
    target: js.Any,
    `type`: String
  ): PointerEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent]
  }
}

