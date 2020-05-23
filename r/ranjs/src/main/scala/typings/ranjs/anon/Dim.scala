package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dim extends js.Object {
  var dim: js.UndefOr[Double] = js.undefined
  var maxHistory: js.UndefOr[Double] = js.undefined
}

object Dim {
  @scala.inline
  def apply(dim: js.UndefOr[Double] = js.undefined, maxHistory: js.UndefOr[Double] = js.undefined): Dim = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dim)) __obj.updateDynamic("dim")(dim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHistory)) __obj.updateDynamic("maxHistory")(maxHistory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dim]
  }
}

