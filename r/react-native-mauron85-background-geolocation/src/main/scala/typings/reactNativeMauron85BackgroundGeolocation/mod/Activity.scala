package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** Percentage indicating the likelihood user is performing this activity. */
  var confidence: Double
  /**
    * Type of the activity.
    *
    * Possible values:
    * IN_VEHICLE, ON_BICYCLE, ON_FOOT, RUNNING, STILL, TILTING, UNKNOWN, WALKING
    */
  var `type`: ActivityType
}

object Activity {
  @scala.inline
  def apply(confidence: Double, `type`: ActivityType): Activity = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

