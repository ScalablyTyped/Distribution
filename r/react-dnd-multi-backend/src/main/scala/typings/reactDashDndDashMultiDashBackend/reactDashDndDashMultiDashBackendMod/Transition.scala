package typings.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
    * ???
    */
  var _isMBTransition: Boolean
  /**
    * Check function to use for this transition.
    */
  var check: CheckFunction[_]
  /**
    * Event type that this transition should check against. This will be an HTML event, such as
    * "dragstart", "touchstart", etc.
    */
  var event: String
}

object Transition {
  @scala.inline
  def apply(_isMBTransition: Boolean, check: _ => Boolean, event: String): Transition = {
    val __obj = js.Dynamic.literal(_isMBTransition = _isMBTransition.asInstanceOf[js.Any], check = js.Any.fromFunction1(check), event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transition]
  }
}

