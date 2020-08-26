package typings.reactMdTransition.useTransitionMod

import typings.react.mod.Dispatch
import typings.react.mod.RefCallback
import typings.reactMdTransition.constantsMod.TransitionAction
import typings.reactMdTransition.constantsMod.TransitionStage
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionReturnValue[E /* <: HTMLElement */] extends TransitionState {
  /**
    * A dispatch function that cna update the transition state manually. This
    * should really not be used too much unless your transition is for appear
    * only transitions. For those cases, you can watch for a value change and
    * just trigger the ENTER transition again:
    *
    * ```ts
    * const prevThing = useRef(thing);
    * if (thing !== prevThing.current) {
    *   prevThing.current = thing;
    *   dispatch(ENTER);
    * }
    * ```
    *
    * Note: This **should be dispatched during the render** to get the correct
    * timing.
    */
  var dispatch: Dispatch[TransitionAction] = js.native
  /**
    * A ref that must be passed to a DOM node for the transition to work. This
    * _technically_ should not need to be passed to a DOM node for non-css
    * transitions or transitions that do not require access to a DOM node, but it
    * it seems like too much work to make it conditional for those types for
    * transitions.
    */
  var ref: RefCallback[E] = js.native
}

object TransitionReturnValue {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](
    appearing: Boolean,
    dispatch: TransitionAction => Unit,
    ref: /* instance */ E | Null => Unit,
    rendered: Boolean,
    stage: TransitionStage
  ): TransitionReturnValue[E] = {
    val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), ref = js.Any.fromFunction1(ref), rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionReturnValue[E]]
  }
  @scala.inline
  implicit class TransitionReturnValueOps[Self <: TransitionReturnValue[_], /* <: typings.std.HTMLElement */ E] (val x: Self with TransitionReturnValue[E]) extends AnyVal {
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
    def setDispatch(value: TransitionAction => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: /* instance */ E | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
  }
  
}

