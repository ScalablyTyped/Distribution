package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ?Das selbe wie Appearance?
trait ISettings extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var uses: settings
}

object ISettings {
  @scala.inline
  def apply(uses: settings, max: Int | Double = null, min: Int | Double = null): ISettings = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
}

