package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** Percentage indicating the likelihood user is performing this activity. */
  var confidence: scala.Double
  /** IN_VEHICLE, ON_BICYCLE, ON_FOOT, RUNNING, STILL, TILTING, UNKNOWN, WALKING */
  var `type`: ActivityType
}

object Activity {
  @scala.inline
  def apply(confidence: scala.Double, `type`: ActivityType): Activity = {
    val __obj = js.Dynamic.literal(confidence = confidence)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Activity]
  }
}

