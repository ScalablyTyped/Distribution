package typings.reduxLittleRouter.mod

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
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterArgs]
  }
}

