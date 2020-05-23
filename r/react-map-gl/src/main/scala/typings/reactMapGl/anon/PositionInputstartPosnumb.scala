package typings.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-map-gl.react-map-gl.PositionInput & {  startPos ? :[number, number]} */
trait PositionInputstartPosnumb extends js.Object {
  var pos: js.Tuple2[Double, Double]
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object PositionInputstartPosnumb {
  @scala.inline
  def apply(pos: js.Tuple2[Double, Double], startPos: js.Tuple2[Double, Double] = null): PositionInputstartPosnumb = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    if (startPos != null) __obj.updateDynamic("startPos")(startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionInputstartPosnumb]
  }
}

