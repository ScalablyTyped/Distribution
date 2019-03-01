package typings
package reactDashTrackingLib.reactDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingProp extends js.Object {
  /**
    * This method returns all of the contextual tracking data up until this point in the component hierarchy.
    */
  def getTrackingData(): js.Object
  def trackEvent(has: js.Any): js.Any
}

object TrackingProp {
  @scala.inline
  def apply(getTrackingData: js.Function0[js.Object], trackEvent: js.Function1[js.Any, js.Any]): TrackingProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTrackingData")(getTrackingData)
    __obj.updateDynamic("trackEvent")(trackEvent)
    __obj.asInstanceOf[TrackingProp]
  }
}

