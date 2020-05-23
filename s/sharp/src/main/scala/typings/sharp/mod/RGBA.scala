package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var b: js.UndefOr[Double] = js.undefined
  var g: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
}

object RGBA {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    b: js.UndefOr[Double] = js.undefined,
    g: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined
  ): RGBA = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (!js.isUndefined(g)) __obj.updateDynamic("g")(g.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

