package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDim extends js.Object {
  var dim: js.UndefOr[Double] = js.undefined
  var maxHistory: js.UndefOr[Double] = js.undefined
}

object AnonDim {
  @scala.inline
  def apply(dim: Int | Double = null, maxHistory: Int | Double = null): AnonDim = {
    val __obj = js.Dynamic.literal()
    if (dim != null) __obj.updateDynamic("dim")(dim.asInstanceOf[js.Any])
    if (maxHistory != null) __obj.updateDynamic("maxHistory")(maxHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDim]
  }
}

