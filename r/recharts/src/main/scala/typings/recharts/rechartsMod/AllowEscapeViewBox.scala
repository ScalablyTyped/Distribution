package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowEscapeViewBox extends js.Object {
  var x: js.UndefOr[Boolean] = js.undefined
  var y: js.UndefOr[Boolean] = js.undefined
}

object AllowEscapeViewBox {
  @scala.inline
  def apply(x: js.UndefOr[Boolean] = js.undefined, y: js.UndefOr[Boolean] = js.undefined): AllowEscapeViewBox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[AllowEscapeViewBox]
  }
}

