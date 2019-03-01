package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ?Das selbe wie Appearance?
trait ISettings extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var uses: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.settings
}

object ISettings {
  @scala.inline
  def apply(
    uses: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.settings,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): ISettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uses")(uses)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
}

