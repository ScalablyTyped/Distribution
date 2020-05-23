package typings.reactNativeCustomTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTabsOptions extends js.Object {
  var animations: js.UndefOr[Animations] = js.undefined
  var enableDefaultShare: js.UndefOr[Boolean] = js.undefined
  var enableUrlBarHiding: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var showPageTitle: js.UndefOr[Boolean] = js.undefined
  var toolbarColor: js.UndefOr[String] = js.undefined
}

object CustomTabsOptions {
  @scala.inline
  def apply(
    animations: Animations = null,
    enableDefaultShare: js.UndefOr[Boolean] = js.undefined,
    enableUrlBarHiding: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    showPageTitle: js.UndefOr[Boolean] = js.undefined,
    toolbarColor: String = null
  ): CustomTabsOptions = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDefaultShare)) __obj.updateDynamic("enableDefaultShare")(enableDefaultShare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUrlBarHiding)) __obj.updateDynamic("enableUrlBarHiding")(enableUrlBarHiding.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(showPageTitle)) __obj.updateDynamic("showPageTitle")(showPageTitle.get.asInstanceOf[js.Any])
    if (toolbarColor != null) __obj.updateDynamic("toolbarColor")(toolbarColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTabsOptions]
  }
}

