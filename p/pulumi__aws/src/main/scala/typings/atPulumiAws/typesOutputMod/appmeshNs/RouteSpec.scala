package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpec extends js.Object {
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[RouteSpecHttpRoute] = js.undefined
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[RouteSpecTcpRoute] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(httpRoute: RouteSpecHttpRoute = null, tcpRoute: RouteSpecTcpRoute = null): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute)
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute)
    __obj.asInstanceOf[RouteSpec]
  }
}

