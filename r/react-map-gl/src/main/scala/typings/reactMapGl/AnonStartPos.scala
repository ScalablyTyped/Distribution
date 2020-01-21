package typings.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartPos extends js.Object {
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object AnonStartPos {
  @scala.inline
  def apply(startPos: js.Tuple2[Double, Double] = null): AnonStartPos = {
    val __obj = js.Dynamic.literal()
    if (startPos != null) __obj.updateDynamic("startPos")(startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartPos]
  }
}

