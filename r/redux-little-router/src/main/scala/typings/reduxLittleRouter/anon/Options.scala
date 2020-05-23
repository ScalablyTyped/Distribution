package typings.reduxLittleRouter.anon

import typings.reduxLittleRouter.mod.Routes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: UpdateRoutes
  var routes: Routes
}

object Options {
  @scala.inline
  def apply(options: UpdateRoutes, routes: Routes): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

