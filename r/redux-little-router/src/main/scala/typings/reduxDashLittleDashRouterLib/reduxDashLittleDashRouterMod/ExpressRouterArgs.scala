package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressRouterArgs extends js.Object {
  var request: reduxDashLittleDashRouterLib.Anon_BaseUrl
  var routes: Routes
}

object ExpressRouterArgs {
  @scala.inline
  def apply(request: reduxDashLittleDashRouterLib.Anon_BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request, routes = routes)
  
    __obj.asInstanceOf[ExpressRouterArgs]
  }
}

