package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpec extends js.Object {
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[Input[RouteSpecHttpRoute]] = js.undefined
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[Input[RouteSpecTcpRoute]] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(httpRoute: Input[RouteSpecHttpRoute] = null, tcpRoute: Input[RouteSpecTcpRoute] = null): RouteSpec = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute.asInstanceOf[js.Any])
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpec]
  }
}

