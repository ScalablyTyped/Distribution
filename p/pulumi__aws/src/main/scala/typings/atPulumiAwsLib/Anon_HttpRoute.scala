package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpRoute extends js.Object {
  var httpRoute: js.UndefOr[Anon_Action] = js.undefined
  var tcpRoute: js.UndefOr[Anon_ActionAnonWeightedTargets] = js.undefined
}

object Anon_HttpRoute {
  @scala.inline
  def apply(httpRoute: Anon_Action = null, tcpRoute: Anon_ActionAnonWeightedTargets = null): Anon_HttpRoute = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute)
    if (tcpRoute != null) __obj.updateDynamic("tcpRoute")(tcpRoute)
    __obj.asInstanceOf[Anon_HttpRoute]
  }
}

