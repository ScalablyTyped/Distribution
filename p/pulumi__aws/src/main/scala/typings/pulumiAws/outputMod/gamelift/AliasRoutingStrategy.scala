package typings.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingStrategy extends js.Object {
  /**
    * ID of the Gamelift Fleet to point the alias to.
    */
  var fleetId: js.UndefOr[String] = js.native
  /**
    * Message text to be used with the `TERMINAL` routing strategy.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
    */
  var `type`: String = js.native
}

object AliasRoutingStrategy {
  @scala.inline
  def apply(`type`: String, fleetId: String = null, message: String = null): AliasRoutingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasRoutingStrategy]
  }
}

