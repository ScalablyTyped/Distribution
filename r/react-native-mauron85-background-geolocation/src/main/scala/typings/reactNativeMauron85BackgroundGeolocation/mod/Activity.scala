package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /** Percentage indicating the likelihood user is performing this activity. */
  var confidence: Double = js.native
  /**
    * Type of the activity.
    *
    * Possible values:
    * IN_VEHICLE, ON_BICYCLE, ON_FOOT, RUNNING, STILL, TILTING, UNKNOWN, WALKING
    */
  var `type`: ActivityType = js.native
}

object Activity {
  @scala.inline
  def apply(confidence: Double, `type`: ActivityType): Activity = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ActivityType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

