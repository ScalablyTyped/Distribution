package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FleetId extends js.Object {
  var fleetId: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_FleetId {
  @scala.inline
  def apply(`type`: java.lang.String, fleetId: java.lang.String = null, message: java.lang.String = null): Anon_FleetId = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_FleetId]
  }
}

