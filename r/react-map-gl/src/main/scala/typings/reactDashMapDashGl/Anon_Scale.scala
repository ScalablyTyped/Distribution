package typings.reactDashMapDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scale extends js.Object {
  var scale: Double
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Anon_Scale {
  @scala.inline
  def apply(scale: Double, startPos: js.Tuple2[Double, Double] = null): Anon_Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (startPos != null) __obj.updateDynamic("startPos")(startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scale]
  }
}

