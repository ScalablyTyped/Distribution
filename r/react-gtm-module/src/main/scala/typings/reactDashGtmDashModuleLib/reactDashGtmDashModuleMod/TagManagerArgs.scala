package typings
package reactDashGtmDashModuleLib.reactDashGtmDashModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagManagerArgs extends DataLayerArgs {
  /**
    * Used to set environments.
    */
  var auth: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional events such as 'gtm.start': new Date().getTime(),event:'gtm.js'.
    */
  var events: js.UndefOr[js.Object] = js.undefined
  /**
    * GTM id, must be something like GTM-000000.
    */
  var gtmId: java.lang.String
  /**
    * Used to set environments, something like env-00.
    */
  var preview: js.UndefOr[java.lang.String] = js.undefined
}

object TagManagerArgs {
  @scala.inline
  def apply(
    gtmId: java.lang.String,
    auth: java.lang.String = null,
    dataLayer: js.Object = null,
    dataLayerName: java.lang.String = null,
    events: js.Object = null,
    preview: java.lang.String = null
  ): TagManagerArgs = {
    val __obj = js.Dynamic.literal(gtmId = gtmId)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (dataLayer != null) __obj.updateDynamic("dataLayer")(dataLayer)
    if (dataLayerName != null) __obj.updateDynamic("dataLayerName")(dataLayerName)
    if (events != null) __obj.updateDynamic("events")(events)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    __obj.asInstanceOf[TagManagerArgs]
  }
}

