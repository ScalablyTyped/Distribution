package typings.reactTransitionGroup.transitionMod

import typings.reactTransitionGroup.anon.Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndListenerProps[Ref /* <: js.UndefOr[HTMLElement] */]
  extends BaseTransitionProps[Ref]
     with TransitionProps[Ref] {
  /**
    * Add a custom transition end trigger. Called with the transitioning DOM
    * node and a done callback. Allows for more fine grained transition end
    * logic. Note: Timeouts are still used as a fallback if provided.
    */
  var addEndListener: EndHandler[Ref]
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
  var timeout: js.UndefOr[Double | Appear] = js.undefined
}

object EndListenerProps {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.std.HTMLElement] */ Ref](
    addEndListener: EndHandler[Ref],
    children: TransitionChildren = null,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    nodeRef: js.UndefOr[Null | typings.react.mod.Ref[Ref]] = js.undefined,
    onEnter: EnterHandler[Ref] = null,
    onEntered: EnterHandler[Ref] = null,
    onEntering: EnterHandler[Ref] = null,
    onExit: ExitHandler[Ref] = null,
    onExited: ExitHandler[Ref] = null,
    onExiting: ExitHandler[Ref] = null,
    timeout: Double | Appear = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): EndListenerProps[Ref] = {
    val __obj = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeRef)) __obj.updateDynamic("nodeRef")(nodeRef.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndListenerProps[Ref]]
  }
}

