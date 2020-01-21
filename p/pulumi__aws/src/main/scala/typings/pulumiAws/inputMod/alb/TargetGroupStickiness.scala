package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupStickiness extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
    */
  var cookieDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates whether  health checks are enabled. Defaults to true.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of sticky sessions. The only current possible value is `lbCookie`.
    */
  var `type`: Input[String] = js.native
}

object TargetGroupStickiness {
  @scala.inline
  def apply(`type`: Input[String], cookieDuration: Input[Double] = null, enabled: Input[Boolean] = null): TargetGroupStickiness = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cookieDuration != null) __obj.updateDynamic("cookieDuration")(cookieDuration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupStickiness]
  }
}

