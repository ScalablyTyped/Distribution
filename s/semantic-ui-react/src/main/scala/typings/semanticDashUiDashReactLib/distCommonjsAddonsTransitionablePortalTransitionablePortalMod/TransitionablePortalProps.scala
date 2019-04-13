package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionablePortalProps
  extends StrictTransitionablePortalProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TransitionablePortalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onClose: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.PortalProps with TransitionablePortalState) => scala.Unit = null,
    onHide: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionEventData with TransitionablePortalState) => scala.Unit = null,
    onOpen: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.PortalProps with TransitionablePortalState) => scala.Unit = null,
    onStart: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionEventData with TransitionablePortalState) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    transition: semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionProps = null
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

