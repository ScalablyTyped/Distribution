package typings.reactDashTransitionDashGroup.cSSTransitionMod

import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.reactDashTransitionDashGroup.transitionMod.EndHandler
import typings.reactDashTransitionDashGroup.transitionMod.EnterHandler
import typings.reactDashTransitionDashGroup.transitionMod.ExitHandler
import typings.reactDashTransitionDashGroup.transitionMod.TransitionChildren
import typings.reactDashTransitionDashGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransitionProps extends TransitionProps {
  /**
    * The animation `classNames` applied to the component as it enters or exits.
    * A single name can be provided and it will be suffixed for each stage: e.g.
    *
    * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
    * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
    *
    * Each individual classNames can also be specified independently like:
    *
    * ```js
    * classNames={{
    *   appear: 'my-appear',
    *   appearActive: 'my-appear-active',
    *   appearDone: 'my-appear-done',
    *   enter: 'my-enter',
    *   enterActive: 'my-enter-active',
    *   enterDone: 'my-enter-done',
    *   exit: 'my-exit',
    *   exitActive: 'my-exit-active',
    *   exitDone: 'my-exit-done'
    * }}
    * ```
    */
  var classNames: js.UndefOr[String | CSSTransitionClassNames] = js.undefined
}

object CSSTransitionProps {
  @scala.inline
  def apply(
    timeout: Double | Anon_Appear,
    addEndListener: EndHandler = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    children: TransitionChildren = null,
    classNames: String | CSSTransitionClassNames = null,
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
  ): CSSTransitionProps = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener)
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[CSSTransitionProps]
  }
}

