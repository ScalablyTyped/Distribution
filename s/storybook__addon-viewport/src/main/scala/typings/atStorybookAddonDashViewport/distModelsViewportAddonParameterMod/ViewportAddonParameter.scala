package typings.atStorybookAddonDashViewport.distModelsViewportAddonParameterMod

import typings.atStorybookAddonDashViewport.distModelsViewportMod.ViewportMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportAddonParameter extends js.Object {
  var defaultViewport: js.UndefOr[String] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var viewports: ViewportMap
}

object ViewportAddonParameter {
  @scala.inline
  def apply(
    viewports: ViewportMap,
    defaultViewport: String = null,
    disable: js.UndefOr[Boolean] = js.undefined
  ): ViewportAddonParameter = {
    val __obj = js.Dynamic.literal(viewports = viewports.asInstanceOf[js.Any])
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportAddonParameter]
  }
}

