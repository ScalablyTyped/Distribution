package typings.reduxLittleRouter

import typings.reduxLittleRouter.mod.Routes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: AnonUpdateRoutes
  var routes: Routes
}

object AnonOptions {
  @scala.inline
  def apply(options: AnonUpdateRoutes, routes: Routes): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

