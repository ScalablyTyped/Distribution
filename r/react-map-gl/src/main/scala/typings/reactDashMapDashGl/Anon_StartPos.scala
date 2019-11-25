package typings.reactDashMapDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartPos extends js.Object {
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Anon_StartPos {
  @scala.inline
  def apply(startPos: js.Tuple2[Double, Double] = null): Anon_StartPos = {
    val __obj = js.Dynamic.literal()
    if (startPos != null) __obj.updateDynamic("startPos")(startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StartPos]
  }
}

