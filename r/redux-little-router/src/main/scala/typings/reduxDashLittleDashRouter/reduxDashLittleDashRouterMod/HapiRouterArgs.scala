package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapiRouterArgs extends js.Object {
  var request: Anon_Path
  var routes: Routes
}

object HapiRouterArgs {
  @scala.inline
  def apply(request: Anon_Path, routes: Routes): HapiRouterArgs = {
    val __obj = js.Dynamic.literal(request = request, routes = routes)
  
    __obj.asInstanceOf[HapiRouterArgs]
  }
}

