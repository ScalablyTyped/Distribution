package typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var defaultPrevented: Boolean
  def preventDefault(): Unit
}

object Event {
  @scala.inline
  def apply(defaultPrevented: Boolean, preventDefault: () => Unit): Event = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[Event]
  }
}

