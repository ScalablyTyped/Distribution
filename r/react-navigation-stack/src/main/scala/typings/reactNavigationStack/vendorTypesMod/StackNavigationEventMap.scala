package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackNavigationEventMap extends js.Object {
  /**
    * Event which fires when a transition animation ends.
    */
  var transitionEnd: Data = js.native
  /**
    * Event which fires when a transition animation starts.
    */
  var transitionStart: Data = js.native
}

object StackNavigationEventMap {
  @scala.inline
  def apply(transitionEnd: Data, transitionStart: Data): StackNavigationEventMap = {
    val __obj = js.Dynamic.literal(transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationEventMap]
  }
  @scala.inline
  implicit class StackNavigationEventMapOps[Self <: StackNavigationEventMap] (val x: Self) extends AnyVal {
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
    def setTransitionEnd(value: Data): Self = this.set("transitionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionStart(value: Data): Self = this.set("transitionStart", value.asInstanceOf[js.Any])
  }
  
}

