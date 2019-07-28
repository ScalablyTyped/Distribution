package typings.reactDashTransitionDashGroup.transitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashTransitionDashGroup.Anon_Appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps
  extends TransitionActions
     with /* prop */ StringDictionary[js.Any] {
  /**
    * Add a custom transition end trigger. Called with the transitioning DOM
    * node and a done callback. Allows for more fine grained transition end
    * logic. Note: Timeouts are still used as a fallback if provided.
    */
  var addEndListener: js.UndefOr[EndHandler] = js.undefined
  /**
    * A function child can be used instead of a React element. This function is
    * called with the current transition status ('entering', 'entered',
    * 'exiting',  'exited', 'unmounted'), which can be used to apply context
    * specific props to a component.
    * ```jsx
    *    <Transition in={this.state.in} timeout={150}>
    *        {state => (
    *            <MyComponent className={`fade fade-${state}`} />
    *        )}
    *    </Transition>
    * ```
    */
  var children: js.UndefOr[TransitionChildren] = js.undefined
  /**
    * Show the component; triggers the enter or exit states
    */
  var in: js.UndefOr[Boolean] = js.undefined
  /**
    * By default the child component is mounted immediately along with the
    * parent Transition component. If you want to "lazy mount" the component on
    * the first `in={true}` you can set `mountOnEnter`. After the first enter
    * transition the component will stay mounted, even on "exited", unless you
    * also specify `unmountOnExit`.
    */
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback fired before the "entering" status is applied. An extra
    * parameter `isAppearing` is supplied to indicate if the enter stage is
    * occurring on the initial mount
    */
  var onEnter: js.UndefOr[EnterHandler] = js.undefined
  /**
    * Callback fired after the "entered" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntered: js.UndefOr[EnterHandler] = js.undefined
  /**
    * Callback fired after the "entering" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntering: js.UndefOr[EnterHandler] = js.undefined
  /**
    * Callback fired before the "exiting" status is applied.
    */
  var onExit: js.UndefOr[ExitHandler] = js.undefined
  /**
    * Callback fired after the "exited" status is applied.
    */
  var onExited: js.UndefOr[ExitHandler] = js.undefined
  /**
    * Callback fired after the "exiting" status is applied.
    */
  var onExiting: js.UndefOr[ExitHandler] = js.undefined
  /**
    * The duration of the transition, in milliseconds. Required unless addEndListener is provided.
    *
    * You may specify a single timeout for all transitions:
    * ```js
    *   timeout={500}
    * ```
    * or individually:
    * ```js
    * timeout={{
    *  appear: 500,
    *  enter: 300,
    *  exit: 500,
    * }}
    * ```
    * - appear defaults to the value of `enter`
    * - enter defaults to `0`
    * - exit defaults to `0`
    */
  var timeout: Double | Anon_Appear
  /**
    * By default the child component stays mounted after it reaches the
    * 'exited' state. Set `unmountOnExit` if you'd prefer to unmount the
    * component after it finishes exiting.
    */
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    timeout: Double | Anon_Appear,
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    addEndListener: EndHandler = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    children: TransitionChildren = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: EnterHandler = null,
    onEntered: EnterHandler = null,
    onEntering: EnterHandler = null,
    onExit: ExitHandler = null,
    onExited: ExitHandler = null,
    onExiting: ExitHandler = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TransitionProps = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener)
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[TransitionProps]
  }
}

