package typings.reactMapGl.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEvent extends MouseEvent {
  // backward compatibility: v3 interface
  var features: js.Array[_] = js.native
  var lngLat: js.Tuple2[Double, Double] = js.native
  var point: js.Tuple2[Double, Double] = js.native
  var srcEvent: js.Any = js.native
}

