package typings
package reactDashTransitionDashGroupLib.cSSTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The animation classNames applied to the component as it enters or exits.
  * A single name can be provided and it will be suffixed for each stage: e.g.
  *
  * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
  * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
  * Each individual classNames can also be specified independently like:
  *
  * ```js
  * classNames={{
  *  appear: 'my-appear',
  *  appearActive: 'my-active-appear',
  *  enter: 'my-enter',
  *  enterActive: 'my-active-enter',
  *  exit: 'my-exit',
  *  exitActive: 'my-active-exit',
  * }}
  * ```
  */
trait CSSTransitionProps
  extends reactDashTransitionDashGroupLib.transitionMod.TransitionProps {
  var classNames: js.UndefOr[java.lang.String | CSSTransitionClassNames] = js.undefined
}

object CSSTransitionProps {
  @scala.inline
  def apply(
    timeout: scala.Double | reactDashTransitionDashGroupLib.Anon_Enter,
    addEndListener: reactDashTransitionDashGroupLib.transitionMod.EndHandler = null,
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactDashTransitionDashGroupLib.transitionMod.TransitionChildren = null,
    classNames: java.lang.String | CSSTransitionClassNames = null,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntered: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntering: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onExit: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExited: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExiting: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
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

