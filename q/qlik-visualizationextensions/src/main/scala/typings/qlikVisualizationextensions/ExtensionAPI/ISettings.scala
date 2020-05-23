package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.settings
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
  def apply(uses: settings, max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): ISettings = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
}

