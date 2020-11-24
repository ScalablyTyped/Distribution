package typings.reactTracking.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingProp[P] extends js.Object {
  
  /**
    * This method returns all of the contextual tracking data up until this point in the component hierarchy.
    */
  def getTrackingData(): js.Object = js.native
  
  def trackEvent(data: Partial[P]): Unit = js.native
}
object TrackingProp {
  
  @scala.inline
  def apply[P](getTrackingData: () => js.Object, trackEvent: Partial[P] => Unit): TrackingProp[P] = {
    val __obj = js.Dynamic.literal(getTrackingData = js.Any.fromFunction0(getTrackingData), trackEvent = js.Any.fromFunction1(trackEvent))
    __obj.asInstanceOf[TrackingProp[P]]
  }
  
  @scala.inline
  implicit class TrackingPropOps[Self <: TrackingProp[_], P] (val x: Self with TrackingProp[P]) extends AnyVal {
    
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
    def setGetTrackingData(value: () => js.Object): Self = this.set("getTrackingData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrackEvent(value: Partial[P] => Unit): Self = this.set("trackEvent", js.Any.fromFunction1(value))
  }
}
