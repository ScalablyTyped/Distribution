package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackNavigationEventMap extends js.Object {
  /**
    * Event which fires when a transition animation ends.
    */
  var transitionEnd: Data
  /**
    * Event which fires when a transition animation starts.
    */
  var transitionStart: Data
}

object StackNavigationEventMap {
  @scala.inline
  def apply(transitionEnd: Data, transitionStart: Data): StackNavigationEventMap = {
    val __obj = js.Dynamic.literal(transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationEventMap]
  }
}

