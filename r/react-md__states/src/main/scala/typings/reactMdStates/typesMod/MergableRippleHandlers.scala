package typings.reactMdStates.typesMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react.react.HTMLAttributes<E>, 'onKeyDown' | 'onKeyUp' | 'onMouseDown' | 'onMouseUp' | 'onMouseLeave' | 'onClick' | 'onTouchStart' | 'onTouchMove' | 'onTouchEnd'> */
@js.native
trait MergableRippleHandlers[E /* <: HTMLElement */] extends js.Object {
  var onClick: js.UndefOr[MouseEventHandler[E]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[E]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[E]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[E]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[E]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[E]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[E]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[E]] = js.native
}

object MergableRippleHandlers {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](): MergableRippleHandlers[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergableRippleHandlers[E]]
  }
  @scala.inline
  implicit class MergableRippleHandlersOps[Self <: MergableRippleHandlers[_], /* <: typings.std.HTMLElement */ E] (val x: Self with MergableRippleHandlers[E]) extends AnyVal {
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
    def setOnClick(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[E] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[E, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[E] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[E] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[E] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
  
}

