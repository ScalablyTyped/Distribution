package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimensions extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var uses: dimensions
}

object IDimensions {
  @scala.inline
  def apply(uses: dimensions, max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): IDimensions = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensions]
  }
}

