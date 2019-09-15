package typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionablePortalProps extends js.Object {
  /** Primary content. */
  var children: ReactNode
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onClose: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.undefined
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[
    js.Function2[
      /* nothing */ Null, 
      /* data */ TransitionEventData with TransitionablePortalState, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.undefined
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[
    js.Function2[
      /* nothing */ Null, 
      /* data */ TransitionEventData with TransitionablePortalState, 
      Unit
    ]
  ] = js.undefined
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[Boolean] = js.undefined
  /** Transition props. */
  var transition: js.UndefOr[TransitionProps] = js.undefined
}

object StrictTransitionablePortalProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    transition: TransitionProps = null
  ): StrictTransitionablePortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[StrictTransitionablePortalProps]
  }
}

