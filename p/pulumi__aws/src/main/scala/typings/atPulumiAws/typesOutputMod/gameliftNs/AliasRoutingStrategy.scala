package typings.atPulumiAws.typesOutputMod.gameliftNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasRoutingStrategy extends js.Object {
  /**
    * ID of the Gamelift Fleet to point the alias to.
    */
  var fleetId: js.UndefOr[String] = js.undefined
  /**
    * Message text to be used with the `TERMINAL` routing strategy.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
    */
  var `type`: String
}

object AliasRoutingStrategy {
  @scala.inline
  def apply(`type`: String, fleetId: String = null, message: String = null): AliasRoutingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[AliasRoutingStrategy]
  }
}

