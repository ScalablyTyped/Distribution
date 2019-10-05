package typings.reduxDashFirstDashRouter

import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.Nullable
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: Nullable[Params]
  var path: Nullable[String]
}

object Anon_Params {
  @scala.inline
  def apply(params: Nullable[Params] = null, path: Nullable[String] = null): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Params]
  }
}

