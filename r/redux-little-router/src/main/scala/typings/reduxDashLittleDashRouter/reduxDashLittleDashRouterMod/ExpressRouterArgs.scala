package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.Anon_BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressRouterArgs extends js.Object {
  var request: Anon_BaseUrl
  var routes: Routes
}

object ExpressRouterArgs {
  @scala.inline
  def apply(request: Anon_BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request, routes = routes)
  
    __obj.asInstanceOf[ExpressRouterArgs]
  }
}

