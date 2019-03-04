package typings
package reduxDashLittleDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Location
  var `type`: java.lang.String
}

object Anon_Payload {
  @scala.inline
  def apply(
    payload: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Location,
    `type`: java.lang.String
  ): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Payload]
  }
}

