package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FleetIdMessage extends js.Object {
  var fleetId: js.UndefOr[Input[String]] = js.undefined
  var message: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_FleetIdMessage {
  @scala.inline
  def apply(`type`: Input[String], fleetId: Input[String] = null, message: Input[String] = null): Anon_FleetIdMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FleetIdMessage]
  }
}

