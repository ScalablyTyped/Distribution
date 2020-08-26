package typings.reactMdTransition.typesMod

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSTransitionProvidedProps[E /* <: HTMLElement */] extends js.Object {
  /**
    * The current class name based on the provided `className` options and the
    * state in the transition.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * A ref that **must** be passed to the element that is triggering a CSS
    * transition change. An error will be thrown if the transition starts, but
    * the ref is still `null` or the `ref` was passed to a component instance
    * instead of a DOM node.
    */
  var ref: RefCallback[E] = js.native
}

object CSSTransitionProvidedProps {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](ref: /* instance */ E | Null => Unit): CSSTransitionProvidedProps[E] = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[CSSTransitionProvidedProps[E]]
  }
  @scala.inline
  implicit class CSSTransitionProvidedPropsOps[Self <: CSSTransitionProvidedProps[_], /* <: typings.std.HTMLElement */ E] (val x: Self with CSSTransitionProvidedProps[E]) extends AnyVal {
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
    def setRef(value: /* instance */ E | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

