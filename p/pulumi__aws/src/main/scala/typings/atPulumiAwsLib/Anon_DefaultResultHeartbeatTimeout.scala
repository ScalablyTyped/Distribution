package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultResultHeartbeatTimeout extends js.Object {
  var defaultResult: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var heartbeatTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var lifecycleTransition: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var notificationMetadata: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var notificationTargetArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DefaultResultHeartbeatTimeout {
  @scala.inline
  def apply(
    lifecycleTransition: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    defaultResult: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    heartbeatTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    notificationMetadata: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationTargetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DefaultResultHeartbeatTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lifecycleTransition")(lifecycleTransition.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (defaultResult != null) __obj.updateDynamic("defaultResult")(defaultResult.asInstanceOf[js.Any])
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    if (notificationMetadata != null) __obj.updateDynamic("notificationMetadata")(notificationMetadata.asInstanceOf[js.Any])
    if (notificationTargetArn != null) __obj.updateDynamic("notificationTargetArn")(notificationTargetArn.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultResultHeartbeatTimeout]
  }
}

