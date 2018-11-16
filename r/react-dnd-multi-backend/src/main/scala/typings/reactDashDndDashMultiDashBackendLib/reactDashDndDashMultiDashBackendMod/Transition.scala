package typings
package reactDashDndDashMultiDashBackendLib.reactDashDndDashMultiDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  /**
       * ???
       */
  var _isMBTransition: scala.Boolean = js.native
  /**
       * Check function to use for this transition.
       */
  @JSName("check")
  var check_Original: CheckFunction[_] = js.native
  /**
       * Event type that this transition should check against. This will be an HTML event, such as
       * "dragstart", "touchstart", etc.
       */
  var event: java.lang.String = js.native
  /**
       * Check function to use for this transition.
       */
  def check(event: js.Any): scala.Boolean = js.native
}

