package typings.reactMdStates.useInteractionStatesMod

import typings.react.mod.ReactNode
import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValue[E /* <: HTMLElement */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var handlers: MergableRippleHandlers[E] = js.native
  var ripples: ReactNode = js.native
}

object ReturnValue {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](handlers: MergableRippleHandlers[E]): ReturnValue[E] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue[E]]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue[_], /* <: typings.std.HTMLElement */ E] (val x: Self with ReturnValue[E]) extends AnyVal {
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
    def setHandlers(value: MergableRippleHandlers[E]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setRipples(value: ReactNode): Self = this.set("ripples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipples: Self = this.set("ripples", js.undefined)
  }
  
}

