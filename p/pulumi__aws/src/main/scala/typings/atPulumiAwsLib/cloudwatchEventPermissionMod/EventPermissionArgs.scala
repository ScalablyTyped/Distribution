package typings
package atPulumiAwsLib.cloudwatchEventPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPermissionArgs extends js.Object {
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
  val principal: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * An identifier string for the external account that you are granting permissions to.
    */
  val statementId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object EventPermissionArgs {
  @scala.inline
  def apply(
    principal: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    statementId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    action: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    condition: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyTypeValue] = null
  ): EventPermissionArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPermissionArgs]
  }
}

