package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  /**
    * Transition configuration when removing a screen.
    */
  var close: TransitionSpec
  /**
    * Transition configuration when adding a screen.
    */
  var open: TransitionSpec
}

object Close {
  @scala.inline
  def apply(close: TransitionSpec, open: TransitionSpec): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
}

