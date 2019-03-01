package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpRouteAnonActionMatch extends js.Object {
  var httpRoute: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ActionMatch]] = js.undefined
}

object Anon_HttpRouteAnonActionMatch {
  @scala.inline
  def apply(httpRoute: atPulumiPulumiLib.outputMod.Input[Anon_ActionMatch] = null): Anon_HttpRouteAnonActionMatch = {
    val __obj = js.Dynamic.literal()
    if (httpRoute != null) __obj.updateDynamic("httpRoute")(httpRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpRouteAnonActionMatch]
  }
}

