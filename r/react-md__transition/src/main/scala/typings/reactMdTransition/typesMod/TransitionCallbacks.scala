package typings.reactMdTransition.typesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionCallbacks[E /* <: HTMLElement */] extends js.Object {
  /**
    * An optional enter handler that can be used to determine additional
    * transition styles if you need access to the DOM node to calculate those
    * styles. This will also be fired for `appear` transitions.
    *
    * This will be fired right after the `transitionIn` is set to `true`.
    */
  var onEnter: js.UndefOr[EnterHandler[E]] = js.native
  /**
    * An optional entered handler that can be used to determine additional
    * transition styles if you need access to the DOM node to calculate those
    * styles. This will also be fired for `appear` transitions.
    *
    * This will be fired once the transition has finished.
    */
  var onEntered: js.UndefOr[EnterHandler[E]] = js.native
  /**
    * An optional entering handler that can be used to determine additional
    * transition styles if you need access to the DOM node to calculate those
    * styles. This will also be fired for `appear` transitions.
    *
    * This will be fired almost immediately after the `onEnter` callback.
    * However, if the `repaint` option was enabled, it will ensure the DOM as
    * been repainted before firing to help with CSS transitions.
    */
  var onEntering: js.UndefOr[EnterHandler[E]] = js.native
  /**
    * An optional exit handler that can be used to determine additional
    * transition styles if you need access to the DOM node to calculate those
    * styles.
    *
    * This will be fired right after the `transitionIn` is set to `false`.
    */
  var onExit: js.UndefOr[ExitHandler[E]] = js.native
  /**
    * An optional entered handler that can be used to determine additional
    * transition styles if you need access to the DOM node to calculate those
    * styles. This will also be fired for `appear` transitions.
    *
    * This will be fired once the transition has finished.
    *
    * Note: If the `temporary` option was enabled, the `rendered` result will be
    * `false` and the node actually won't exist in the DOM anymore.
    */
  var onExited: js.UndefOr[ExitHandler[E]] = js.native
  /**
    * An optional exit handler that can be used to determine additional
    * transition styles if you need access to the DOM node to calculate those
    * styles.
    *
    * This will be fired almost immdiately after the `onExit` callback. However,
    * if the `repaint` option was enabled, it will ensure the DOM as been
    * repainted before firing to help with CSS transitions.
    */
  var onExiting: js.UndefOr[ExitHandler[E]] = js.native
}

object TransitionCallbacks {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](): TransitionCallbacks[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionCallbacks[E]]
  }
  @scala.inline
  implicit class TransitionCallbacksOps[Self <: TransitionCallbacks[_], /* <: typings.std.HTMLElement */ E] (val x: Self with TransitionCallbacks[E]) extends AnyVal {
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
    def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = this.set("onEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = this.set("onEntered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = this.set("onEntering", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: E => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: E => Unit): Self = this.set("onExited", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: E => Unit): Self = this.set("onExiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
  }
  
}

