package typings
package reactDashDndDashMultiDashBackendLib.reactDashDndDashMultiDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
    * ???
    */
  var _isMBTransition: scala.Boolean
  /**
    * Check function to use for this transition.
    */
  var check: CheckFunction[_]
  /**
    * Event type that this transition should check against. This will be an HTML event, such as
    * "dragstart", "touchstart", etc.
    */
  var event: java.lang.String
}

object Transition {
  @scala.inline
  def apply(_isMBTransition: scala.Boolean, check: CheckFunction[_], event: java.lang.String): Transition = {
    val __obj = js.Dynamic.literal(_isMBTransition = _isMBTransition, check = check, event = event)
  
    __obj.asInstanceOf[Transition]
  }
}

