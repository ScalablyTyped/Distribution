package typings.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-map-gl.react-map-gl.PositionInput & {  scale  :number,   startPos ? :[number, number]} */
trait PositionInputscalenumbers extends js.Object {
  var pos: js.Tuple2[Double, Double]
  var scale: Double
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object PositionInputscalenumbers {
  @scala.inline
  def apply(pos: js.Tuple2[Double, Double], scale: Double, startPos: js.Tuple2[Double, Double] = null): PositionInputscalenumbers = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    if (startPos != null) __obj.updateDynamic("startPos")(startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionInputscalenumbers]
  }
}

