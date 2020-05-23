package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpec extends js.Object {
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[RouteSpecHttpRoute] = js.native
  /**
    * The priority for the route, between `0` and `1000`.
    * Routes are matched based on the specified value, where `0` is the highest priority.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[RouteSpecTcpRoute] = js.native
}

object RouteSpec {
  @scala.inline
  def apply(
    httpRoute: RouteSpecHttpRoute = null,
    priority: js.UndefOr[Double] = js.undefined,
    tcpRoute: RouteSpecTcpRoute = null
  ): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpec]
  }
}

