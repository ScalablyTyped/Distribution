package typings
package reactDashNativeDashCustomDashTabsLib.reactDashNativeDashCustomDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTabsOptions extends js.Object {
  var animations: js.UndefOr[Animations] = js.undefined
  var enableDefaultShare: js.UndefOr[scala.Boolean] = js.undefined
  var enableUrlBarHiding: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var showPageTitle: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarColor: js.UndefOr[java.lang.String] = js.undefined
}

object CustomTabsOptions {
  @scala.inline
  def apply(
    animations: Animations = null,
    enableDefaultShare: js.UndefOr[scala.Boolean] = js.undefined,
    enableUrlBarHiding: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Any = null,
    showPageTitle: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarColor: java.lang.String = null
  ): CustomTabsOptions = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (!js.isUndefined(enableDefaultShare)) __obj.updateDynamic("enableDefaultShare")(enableDefaultShare)
    if (!js.isUndefined(enableUrlBarHiding)) __obj.updateDynamic("enableUrlBarHiding")(enableUrlBarHiding)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(showPageTitle)) __obj.updateDynamic("showPageTitle")(showPageTitle)
    if (toolbarColor != null) __obj.updateDynamic("toolbarColor")(toolbarColor)
    __obj.asInstanceOf[CustomTabsOptions]
  }
}

