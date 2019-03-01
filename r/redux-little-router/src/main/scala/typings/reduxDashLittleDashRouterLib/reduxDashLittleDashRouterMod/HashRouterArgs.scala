package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashRouterArgs extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var hashType: js.UndefOr[java.lang.String] = js.undefined
  var history: js.UndefOr[History] = js.undefined
  var routes: Routes
}

object HashRouterArgs {
  @scala.inline
  def apply(
    routes: Routes,
    basename: java.lang.String = null,
    hashType: java.lang.String = null,
    history: History = null
  ): HashRouterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routes")(routes)
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (hashType != null) __obj.updateDynamic("hashType")(hashType)
    if (history != null) __obj.updateDynamic("history")(history)
    __obj.asInstanceOf[HashRouterArgs]
  }
}

