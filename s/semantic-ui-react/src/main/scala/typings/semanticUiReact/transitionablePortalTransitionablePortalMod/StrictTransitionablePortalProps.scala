package typings.semanticUiReact.transitionablePortalTransitionablePortalMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.portalPortalMod.PortalProps
import typings.semanticUiReact.transitionTransitionMod.TransitionEventData
import typings.semanticUiReact.transitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTransitionablePortalProps extends js.Object {
  /** Primary content. */
  var children: ReactNode = js.native
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onClose: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.native
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
  ] = js.native
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.native
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
  ] = js.native
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /** Transition props. */
  var transition: js.UndefOr[TransitionProps] = js.native
}

object StrictTransitionablePortalProps {
  @scala.inline
  def apply(): StrictTransitionablePortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTransitionablePortalProps]
  }
  @scala.inline
  implicit class StrictTransitionablePortalPropsOps[Self <: StrictTransitionablePortalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnClose(value: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit): Self = this.set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnOpen(value: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setTransition(value: TransitionProps): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

