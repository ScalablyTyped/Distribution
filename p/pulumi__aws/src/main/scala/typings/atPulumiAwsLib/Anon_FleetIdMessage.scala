package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FleetIdMessage extends js.Object {
  var fleetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var message: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_FleetIdMessage {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fleetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    message: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_FleetIdMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FleetIdMessage]
  }
}

