package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimensions extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var uses: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.dimensions
}

object IDimensions {
  @scala.inline
  def apply(
    uses: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.dimensions,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): IDimensions = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensions]
  }
}

