package typings
package atPulumiAwsLib.cloudwatchEventPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPermissionState extends js.Object {
  /**
    * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
    */
  val action: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
    */
  val condition: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyTypeValue]] = js.undefined
  /**
    * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
    */
  val principal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An identifier string for the external account that you are granting permissions to.
    */
  val statementId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EventPermissionState {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    condition: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyTypeValue] = null,
    principal: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statementId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): EventPermissionState = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (statementId != null) __obj.updateDynamic("statementId")(statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPermissionState]
  }
}

