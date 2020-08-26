package typings.reactMdStates.reducerMod

import typings.reactMdStates.typesMod.RippleEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseAction[E /* <: HTMLElement */] extends RippleStateAction[E] {
  var event: RippleEvent[E] = js.native
  var `type`: /* "RELEASE" */ String = js.native
}

object ReleaseAction {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](event: RippleEvent[E], `type`: /* "RELEASE" */ String): ReleaseAction[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseAction[E]]
  }
  @scala.inline
  implicit class ReleaseActionOps[Self <: ReleaseAction[_], /* <: typings.std.HTMLElement */ E] (val x: Self with ReleaseAction[E]) extends AnyVal {
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
    def setEvent(value: RippleEvent[E]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: /* "RELEASE" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

