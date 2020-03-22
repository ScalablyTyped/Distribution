package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpec extends js.Object {
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[Input[RouteSpecHttpRoute]] = js.native
  /**
    * The priority for the route, between `0` and `1000`.
    * Routes are matched based on the specified value, where `0` is the highest priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[Input[RouteSpecTcpRoute]] = js.native
}

object RouteSpec {
  @scala.inline
  def apply(
    httpRoute: Input[RouteSpecHttpRoute] = null,
    priority: Input[Double] = null,
    tcpRoute: Input[RouteSpecTcpRoute] = null
  ): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpec]
  }
}

