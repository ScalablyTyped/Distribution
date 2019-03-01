package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapiRouterArgs extends js.Object {
  var request: reduxDashLittleDashRouterLib.Anon_Path
  var routes: Routes
}

object HapiRouterArgs {
  @scala.inline
  def apply(request: reduxDashLittleDashRouterLib.Anon_Path, routes: Routes): HapiRouterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[HapiRouterArgs]
  }
}

