package typings.storybookAddonViewport.viewportAddonParameterMod

import typings.storybookAddonViewport.viewportMod.ViewportMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportAddonParameter extends js.Object {
  var defaultViewport: js.UndefOr[String] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var viewports: js.UndefOr[ViewportMap] = js.undefined
}

object ViewportAddonParameter {
  @scala.inline
  def apply(
    defaultViewport: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    viewports: ViewportMap = null
  ): ViewportAddonParameter = {
    val __obj = js.Dynamic.literal()
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.get.asInstanceOf[js.Any])
    if (viewports != null) __obj.updateDynamic("viewports")(viewports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportAddonParameter]
  }
}

