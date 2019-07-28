package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpRouteTcpRoute extends js.Object {
  var httpRoute: js.UndefOr[Input[Anon_ActionMatch]] = js.undefined
  var tcpRoute: js.UndefOr[Input[Anon_ActionAnonWeightedTargetsAnonVirtualNodeWeight]] = js.undefined
}

object Anon_HttpRouteTcpRoute {
  @scala.inline
  def apply(
    httpRoute: Input[Anon_ActionMatch] = null,
    tcpRoute: Input[Anon_ActionAnonWeightedTargetsAnonVirtualNodeWeight] = null
  ): Anon_HttpRouteTcpRoute = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute.asInstanceOf[js.Any])
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpRouteTcpRoute]
  }
}

