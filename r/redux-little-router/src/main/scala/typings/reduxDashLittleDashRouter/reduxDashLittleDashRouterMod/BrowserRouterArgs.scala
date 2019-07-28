package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserRouterArgs extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[History] = js.undefined
  var routes: Routes
}

object BrowserRouterArgs {
  @scala.inline
  def apply(routes: Routes, basename: String = null, history: History = null): BrowserRouterArgs = {
    val __obj = js.Dynamic.literal(routes = routes)
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (history != null) __obj.updateDynamic("history")(history)
    __obj.asInstanceOf[BrowserRouterArgs]
  }
}

