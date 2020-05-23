package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[scala.Nothing] = js.undefined
}

object Size {
  @scala.inline
  def apply(highWaterMark: js.UndefOr[Double] = js.undefined): Size = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

