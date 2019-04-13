package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionablePortalProps extends js.Object {
  /** Primary content. */
  var children: reactLib.reactMod.ReactNode
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* nothing */ scala.Null, 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.PortalProps with TransitionablePortalState, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[
    js.Function2[
      /* nothing */ scala.Null, 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionEventData with TransitionablePortalState, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onOpen: js.UndefOr[
    js.Function2[
      /* nothing */ scala.Null, 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.PortalProps with TransitionablePortalState, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[
    js.Function2[
      /* nothing */ scala.Null, 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionEventData with TransitionablePortalState, 
      scala.Unit
    ]
  ] = js.undefined
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /** Transition props. */
  var transition: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionProps
  ] = js.undefined
}

object StrictTransitionablePortalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    onClose: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.PortalProps with TransitionablePortalState) => scala.Unit = null,
    onHide: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionEventData with TransitionablePortalState) => scala.Unit = null,
    onOpen: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.PortalProps with TransitionablePortalState) => scala.Unit = null,
    onStart: (/* nothing */ scala.Null, /* data */ semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionEventData with TransitionablePortalState) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    transition: semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionProps = null
  ): StrictTransitionablePortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[StrictTransitionablePortalProps]
  }
}

