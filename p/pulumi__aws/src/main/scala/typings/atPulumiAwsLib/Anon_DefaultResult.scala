package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultResult extends js.Object {
  var defaultResult: java.lang.String
  var heartbeatTimeout: js.UndefOr[scala.Double] = js.undefined
  var lifecycleTransition: java.lang.String
  var name: java.lang.String
  var notificationMetadata: js.UndefOr[java.lang.String] = js.undefined
  var notificationTargetArn: js.UndefOr[java.lang.String] = js.undefined
  var roleArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DefaultResult {
  @scala.inline
  def apply(
    defaultResult: java.lang.String,
    lifecycleTransition: java.lang.String,
    name: java.lang.String,
    heartbeatTimeout: scala.Int | scala.Double = null,
    notificationMetadata: java.lang.String = null,
    notificationTargetArn: java.lang.String = null,
    roleArn: java.lang.String = null
  ): Anon_DefaultResult = {
    val __obj = js.Dynamic.literal(defaultResult = defaultResult, lifecycleTransition = lifecycleTransition, name = name)
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    if (notificationMetadata != null) __obj.updateDynamic("notificationMetadata")(notificationMetadata)
    if (notificationTargetArn != null) __obj.updateDynamic("notificationTargetArn")(notificationTargetArn)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_DefaultResult]
  }
}

