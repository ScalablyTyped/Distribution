package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapiRouterArgs extends js.Object {
  var request: AnonPath
  var routes: Routes
}

object HapiRouterArgs {
  @scala.inline
  def apply(request: AnonPath, routes: Routes): HapiRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HapiRouterArgs]
  }
}

