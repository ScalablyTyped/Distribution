package typings.reactDashSelect

import typings.reactDashSelect.srcAnimatedTransitionsMod.fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_In extends js.Object {
  var in: Boolean
  var onExited: fn
}

object Anon_In {
  @scala.inline
  def apply(in: Boolean, onExited: () => Unit): Anon_In = {
    val __obj = js.Dynamic.literal(in = in, onExited = js.Any.fromFunction0(onExited))
  
    __obj.asInstanceOf[Anon_In]
  }
}

