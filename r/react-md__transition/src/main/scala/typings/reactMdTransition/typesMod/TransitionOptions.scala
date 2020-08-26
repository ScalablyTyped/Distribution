package typings.reactMdTransition.typesMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions[E /* <: HTMLElement */] extends TransitionCallbacks[E] {
  /**
    * Boolean if the transition should also be triggered immediately once the
    * component mounts. This is generally not recommended for server side
    * rendering/initial page load so it is set to `false` by default.
    */
  var appear: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the transition should allow for an enter animation once the
    * `transitionIn` booleanis set to `true`.
    */
  var enter: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the transition should allow for an exit animation once the
    * `transitionIn` booleanis set to `false`.
    */
  var exit: js.UndefOr[Boolean] = js.native
  /**
    * An optional ref that will get merged with the required ref for the
    * transition to work.
    */
  var ref: js.UndefOr[Ref[E]] = js.native
  /**
    * Boolean if the transition should force a DOM repaint before triggering the
    * next stage. Defaults to `false` since it's only really recommended for DOM
    * and CSS transitions.
    */
  var repaint: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the component should mount and unmount based on the current
    * `transitionIn` stage with a default value of `false`. When this is
    * `false`, the first result (`rendered`) in the return value array will
    * always be `true`.
    *
    * When this is set to `true`, the first result (`rendered`) in the return
    * value array will be `true` only while the `transitionIn` option is `true`
    * or the transition is still happening.
    *
    * Note: **Changing this option while the hook/component is mounted will not
    * do anything**. If you want to dynamically change the component's temporary
    * state, you will need to also change the `key` to get the component to
    * re-mount.
    */
  var temporary: js.UndefOr[Boolean] = js.native
  /**
    * The transition timeout to use for each stage. Just like in
    * `react-transition-group`, this can either be a `number` which will a static
    * duration to use for each stage. Otherwise, this can be an object of
    * timeouts for the `appear`, `enter`, and `exit` stages which default to `0`
    * if omitted.
    *
    * Note: If any of the timeout values are set to `0`, the transition will be
    * considered disabled and skip the `ENTERING`/`EXITING` stages.
    *
    * Note: If the `appear` stage is omitted in the timeout object but the
    * `appear` option was enabled for the transition, it will instead default to
    * the `enter` duration.
    */
  var timeout: TransitionTimeout = js.native
  /**
    * Changing this boolean will trigger a transition between the six stagees:
    *
    * - `ENTER`
    * - `ENTERING`
    * - `ENTERED`
    * - `EXIT`
    * - `EXITING`
    * - `EXITED`
    *
    * Changing from `false` to `true`, the stagees will change in this order:
    * `EXITED` -> `ENTER` -> `ENTERING` -> `ENTERED`
    *
    * Changing from `true` to `false`, the stagees will change in this order:
    * `ENTERED` -> `EXIT` -> `EXITING` -> `EXITED`
    */
  var transitionIn: Boolean = js.native
}

object TransitionOptions {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](timeout: TransitionTimeout, transitionIn: Boolean): TransitionOptions[E] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions[E]]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions[_], /* <: typings.std.HTMLElement */ E] (val x: Self with TransitionOptions[E]) extends AnyVal {
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
    def setTimeout(value: TransitionTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionIn(value: Boolean): Self = this.set("transitionIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppear(value: Boolean): Self = this.set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    @scala.inline
    def setEnter(value: Boolean): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: Boolean): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ E | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[E]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setRepaint(value: Boolean): Self = this.set("repaint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepaint: Self = this.set("repaint", js.undefined)
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporary: Self = this.set("temporary", js.undefined)
  }
  
}

