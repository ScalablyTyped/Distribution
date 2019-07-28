package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashRouterArgs extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var hashType: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[History] = js.undefined
  var routes: Routes
}

object HashRouterArgs {
  @scala.inline
  def apply(routes: Routes, basename: String = null, hashType: String = null, history: History = null): HashRouterArgs = {
    val __obj = js.Dynamic.literal(routes = routes)
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (hashType != null) __obj.updateDynamic("hashType")(hashType)
    if (history != null) __obj.updateDynamic("history")(history)
    __obj.asInstanceOf[HashRouterArgs]
  }
}

