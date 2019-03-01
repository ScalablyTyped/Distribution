package typings
package atStorybookAddonDashViewportLib.atStorybookAddonDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportConfiguration extends js.Object {
  var defaultViewport: js.UndefOr[ViewportName] = js.undefined
  var viewports: js.UndefOr[ViewportDefinitions] = js.undefined
}

object ViewportConfiguration {
  @scala.inline
  def apply(defaultViewport: ViewportName = null, viewports: ViewportDefinitions = null): ViewportConfiguration = {
    val __obj = js.Dynamic.literal()
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport)
    if (viewports != null) __obj.updateDynamic("viewports")(viewports)
    __obj.asInstanceOf[ViewportConfiguration]
  }
}

