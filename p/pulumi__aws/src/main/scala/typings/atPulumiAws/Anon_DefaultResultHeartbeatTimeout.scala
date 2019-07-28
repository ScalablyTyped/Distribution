package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultResultHeartbeatTimeout extends js.Object {
  var defaultResult: js.UndefOr[Input[String]] = js.undefined
  var heartbeatTimeout: js.UndefOr[Input[Double]] = js.undefined
  var lifecycleTransition: Input[String]
  var name: Input[String]
  var notificationMetadata: js.UndefOr[Input[String]] = js.undefined
  var notificationTargetArn: js.UndefOr[Input[String]] = js.undefined
  var roleArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DefaultResultHeartbeatTimeout {
  @scala.inline
  def apply(
    lifecycleTransition: Input[String],
    name: Input[String],
    defaultResult: Input[String] = null,
    heartbeatTimeout: Input[Double] = null,
    notificationMetadata: Input[String] = null,
    notificationTargetArn: Input[String] = null,
    roleArn: Input[String] = null
  ): Anon_DefaultResultHeartbeatTimeout = {
    val __obj = js.Dynamic.literal(lifecycleTransition = lifecycleTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (defaultResult != null) __obj.updateDynamic("defaultResult")(defaultResult.asInstanceOf[js.Any])
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    if (notificationMetadata != null) __obj.updateDynamic("notificationMetadata")(notificationMetadata.asInstanceOf[js.Any])
    if (notificationTargetArn != null) __obj.updateDynamic("notificationTargetArn")(notificationTargetArn.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultResultHeartbeatTimeout]
  }
}

