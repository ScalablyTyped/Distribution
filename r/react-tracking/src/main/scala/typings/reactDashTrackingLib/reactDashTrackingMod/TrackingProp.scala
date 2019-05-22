package typings
package reactDashTrackingLib.reactDashTrackingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingProp[P] extends js.Object {
  /**
    * This method returns all of the contextual tracking data up until this point in the component hierarchy.
    */
  def getTrackingData(): js.Object
  def trackEvent(data: stdLib.Partial[P]): js.Any
}

object TrackingProp {
  @scala.inline
  def apply[P](getTrackingData: () => js.Object, trackEvent: stdLib.Partial[P] => js.Any): TrackingProp[P] = {
    val __obj = js.Dynamic.literal(getTrackingData = js.Any.fromFunction0(getTrackingData), trackEvent = js.Any.fromFunction1(trackEvent))
  
    __obj.asInstanceOf[TrackingProp[P]]
  }
}

