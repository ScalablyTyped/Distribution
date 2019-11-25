package typings.reactDashGtmDashModule.reactDashGtmDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLayerArgs extends js.Object {
  /**
    * Object that contains all of the information that you want to pass to Google Tag Manager.
    */
  var dataLayer: js.UndefOr[js.Object] = js.undefined
  /**
    * Custom name for dataLayer object.
    */
  var dataLayerName: js.UndefOr[String] = js.undefined
}

object DataLayerArgs {
  @scala.inline
  def apply(dataLayer: js.Object = null, dataLayerName: String = null): DataLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (dataLayer != null) __obj.updateDynamic("dataLayer")(dataLayer.asInstanceOf[js.Any])
    if (dataLayerName != null) __obj.updateDynamic("dataLayerName")(dataLayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLayerArgs]
  }
}

