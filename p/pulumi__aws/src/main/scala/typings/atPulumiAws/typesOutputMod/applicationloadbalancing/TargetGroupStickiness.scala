package typings.atPulumiAws.typesOutputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupStickiness extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
    */
  var cookieDuration: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether  health checks are enabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of sticky sessions. The only current possible value is `lbCookie`.
    */
  var `type`: String
}

object TargetGroupStickiness {
  @scala.inline
  def apply(`type`: String, cookieDuration: Int | Double = null, enabled: js.UndefOr[Boolean] = js.undefined): TargetGroupStickiness = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (cookieDuration != null) __obj.updateDynamic("cookieDuration")(cookieDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[TargetGroupStickiness]
  }
}

