package typings
package ravenDashJsLib.ravenDashJsMod.RavenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoBreadcrumbOptions extends js.Object {
  var console: js.UndefOr[scala.Boolean] = js.undefined
  var dom: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[scala.Boolean] = js.undefined
  var sentry: js.UndefOr[scala.Boolean] = js.undefined
  var xhr: js.UndefOr[scala.Boolean] = js.undefined
}

object AutoBreadcrumbOptions {
  @scala.inline
  def apply(
    console: js.UndefOr[scala.Boolean] = js.undefined,
    dom: js.UndefOr[scala.Boolean] = js.undefined,
    location: js.UndefOr[scala.Boolean] = js.undefined,
    sentry: js.UndefOr[scala.Boolean] = js.undefined,
    xhr: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoBreadcrumbOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(console)) __obj.updateDynamic("console")(console)
    if (!js.isUndefined(dom)) __obj.updateDynamic("dom")(dom)
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(sentry)) __obj.updateDynamic("sentry")(sentry)
    if (!js.isUndefined(xhr)) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[AutoBreadcrumbOptions]
  }
}

