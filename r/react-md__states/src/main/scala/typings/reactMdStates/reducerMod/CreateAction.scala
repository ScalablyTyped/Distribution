package typings.reactMdStates.reducerMod

import typings.reactMdStates.typesMod.RippleEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAction[E /* <: HTMLElement */] extends RippleStateAction[E] {
  var disableSpacebarClick: Boolean = js.native
  var event: RippleEvent[E] = js.native
  var `type`: /* "CREATE" */ String = js.native
}

object CreateAction {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): CreateAction[E] = {
    val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAction[E]]
  }
  @scala.inline
  implicit class CreateActionOps[Self <: CreateAction[_], /* <: typings.std.HTMLElement */ E] (val x: Self with CreateAction[E]) extends AnyVal {
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
    def setDisableSpacebarClick(value: Boolean): Self = this.set("disableSpacebarClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: RippleEvent[E]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: /* "CREATE" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

