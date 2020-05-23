package typings.semanticUiReact.transitionablePortalTransitionablePortalMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.semanticUiReact.portalPortalMod.PortalProps
import typings.semanticUiReact.transitionTransitionMod.TransitionEventData
import typings.semanticUiReact.transitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionablePortalProps
  extends StrictTransitionablePortalProps
     with /* key */ StringDictionary[js.Any]

object TransitionablePortalProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactNode = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    transition: TransitionProps = null
  ): TransitionablePortalProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionablePortalProps]
  }
}

