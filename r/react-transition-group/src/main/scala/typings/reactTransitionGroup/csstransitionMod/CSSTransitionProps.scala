package typings.reactTransitionGroup.csstransitionMod

import typings.reactTransitionGroup.AnonAppear
import typings.reactTransitionGroup.transitionMod.TransitionChildren
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.std.HTMLElement
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
    timeout: Double | AnonAppear,
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    children: TransitionChildren = null,
    classNames: String | CSSTransitionClassNames = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): CSSTransitionProps = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2(addEndListener))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionProps]
  }
}

