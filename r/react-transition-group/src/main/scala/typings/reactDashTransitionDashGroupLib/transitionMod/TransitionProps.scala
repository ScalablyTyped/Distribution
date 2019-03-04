package typings
package reactDashTransitionDashGroupLib.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps
  extends TransitionActions
     with /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var addEndListener: js.UndefOr[EndHandler] = js.undefined
  var children: js.UndefOr[TransitionChildren] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var onEnter: js.UndefOr[EnterHandler] = js.undefined
  var onEntered: js.UndefOr[EnterHandler] = js.undefined
  var onEntering: js.UndefOr[EnterHandler] = js.undefined
  var onExit: js.UndefOr[ExitHandler] = js.undefined
  var onExited: js.UndefOr[ExitHandler] = js.undefined
  var onExiting: js.UndefOr[ExitHandler] = js.undefined
  var timeout: scala.Double | reactDashTransitionDashGroupLib.Anon_Enter
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    timeout: scala.Double | reactDashTransitionDashGroupLib.Anon_Enter,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addEndListener: EndHandler = null,
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    children: TransitionChildren = null,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: EnterHandler = null,
    onEntered: EnterHandler = null,
    onEntering: EnterHandler = null,
    onExit: ExitHandler = null,
    onExited: ExitHandler = null,
    onExiting: ExitHandler = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
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

