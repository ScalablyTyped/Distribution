package typings.reactTransitionGroup.transitionMod

import typings.react.mod.Ref
import typings.reactTransitionGroup.anon.Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]
  - typings.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]
*/
trait TransitionProps[RefElement /* <: js.UndefOr[HTMLElement] */] extends js.Object

object TransitionProps {
  @scala.inline
  def TimeoutProps[/* <: js.UndefOr[typings.std.HTMLElement] */ RefElement](
    timeout: Double | Appear,
    addEndListener: EndHandler[RefElement] = null,
    children: TransitionChildren = null,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    nodeRef: js.UndefOr[Null | Ref[RefElement]] = js.undefined,
    onEnter: EnterHandler[RefElement] = null,
    onEntered: EnterHandler[RefElement] = null,
    onEntering: EnterHandler[RefElement] = null,
    onExit: ExitHandler[RefElement] = null,
    onExited: ExitHandler[RefElement] = null,
    onExiting: ExitHandler[RefElement] = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener.asInstanceOf[js.Any])
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
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps[RefElement]]
  }
  @scala.inline
  def EndListenerProps[/* <: js.UndefOr[typings.std.HTMLElement] */ RefElement](
    addEndListener: EndHandler[RefElement],
    children: TransitionChildren = null,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    nodeRef: js.UndefOr[Null | Ref[RefElement]] = js.undefined,
    onEnter: EnterHandler[RefElement] = null,
    onEntered: EnterHandler[RefElement] = null,
    onEntering: EnterHandler[RefElement] = null,
    onExit: ExitHandler[RefElement] = null,
    onExited: ExitHandler[RefElement] = null,
    onExiting: ExitHandler[RefElement] = null,
    timeout: Double | Appear = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TransitionProps[RefElement] = {
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
    __obj.asInstanceOf[TransitionProps[RefElement]]
  }
}

