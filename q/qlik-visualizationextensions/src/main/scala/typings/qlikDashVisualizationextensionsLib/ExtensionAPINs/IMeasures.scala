package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMeasures extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var uses: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.measures
}

object IMeasures {
  @scala.inline
  def apply(
    uses: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.measures,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): IMeasures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uses")(uses)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasures]
  }
}

