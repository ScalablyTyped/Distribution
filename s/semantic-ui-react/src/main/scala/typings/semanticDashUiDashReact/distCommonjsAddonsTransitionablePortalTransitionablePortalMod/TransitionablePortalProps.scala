package typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionablePortalProps
  extends StrictTransitionablePortalProps
     with /* key */ StringDictionary[js.Any]

object TransitionablePortalProps {
  @scala.inline
  def apply(
    children: ReactNode,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    transition: TransitionProps = null
  ): TransitionablePortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[TransitionablePortalProps]
  }
}

