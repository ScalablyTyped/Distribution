package typings.srcset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrcSetDefinition extends js.Object {
  var density: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var url: String
  var width: js.UndefOr[Double] = js.undefined
}

object SrcSetDefinition {
  @scala.inline
  def apply(
    url: String,
    density: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SrcSetDefinition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(density)) __obj.updateDynamic("density")(density.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcSetDefinition]
  }
}

