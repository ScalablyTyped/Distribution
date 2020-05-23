package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressRouterArgs extends js.Object {
  var request: BaseUrl
  var routes: Routes
}

object ExpressRouterArgs {
  @scala.inline
  def apply(request: BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressRouterArgs]
  }
}

