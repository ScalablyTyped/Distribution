package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionablePortalProps extends js.Object {
  /** Primary content. */
  var children: reactLib.reactMod.ReactNs.ReactNode
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

