package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultResult extends js.Object {
  var defaultResult: String
  var heartbeatTimeout: js.UndefOr[Double] = js.undefined
  var lifecycleTransition: String
  var name: String
  var notificationMetadata: js.UndefOr[String] = js.undefined
  var notificationTargetArn: js.UndefOr[String] = js.undefined
  var roleArn: js.UndefOr[String] = js.undefined
}

object Anon_DefaultResult {
  @scala.inline
  def apply(
    defaultResult: String,
    lifecycleTransition: String,
    name: String,
    heartbeatTimeout: Int | Double = null,
    notificationMetadata: String = null,
    notificationTargetArn: String = null,
    roleArn: String = null
  ): Anon_DefaultResult = {
    val __obj = js.Dynamic.literal(defaultResult = defaultResult, lifecycleTransition = lifecycleTransition, name = name)
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    if (notificationMetadata != null) __obj.updateDynamic("notificationMetadata")(notificationMetadata)
    if (notificationTargetArn != null) __obj.updateDynamic("notificationTargetArn")(notificationTargetArn)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_DefaultResult]
  }
}

