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

