package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FleetId extends js.Object {
  var fleetId: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_FleetId {
  @scala.inline
  def apply(`type`: String, fleetId: String = null, message: String = null): Anon_FleetId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_FleetId]
  }
}

