package typings.semanticUiReact.portalPortalMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictPortalProps extends js.Object {
  
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  
  /** Controls whether or not the portal should close on a click outside. */
  var closeOnDocumentClick: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should close when escape is pressed is displayed. */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether or not the portal should close when mousing out of the portal.
    * NOTE: This will prevent `closeOnTriggerMouseLeave` when mousing over the
    * gap from the trigger to the portal.
    */
  var closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should close on blur of the trigger. */
  var closeOnTriggerBlur: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should close on click of the trigger. */
  var closeOnTriggerClick: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should close when mousing out of the trigger. */
  var closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.native
  
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  /** Event pool namespace that is used to handle component events. */
  var eventPool: js.UndefOr[String] = js.native
  
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.native
  
  /** Milliseconds to wait before opening on mouse over */
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  
  /** Milliseconds to wait before closing on mouse leave */
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  
  /**
    * Called when a close event happens
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps, Unit]
  ] = js.native
  
  /**
    * Called when the portal is mounted on the DOM
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.native
  
  /**
    * Called when an open event happens
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps, Unit]
  ] = js.native
  
  /**
    * Called when the portal is unmounted from the DOM
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.native
  
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should open when the trigger is clicked. */
  var openOnTriggerClick: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should open on focus of the trigger. */
  var openOnTriggerFocus: js.UndefOr[Boolean] = js.native
  
  /** Controls whether or not the portal should open when mousing over the trigger. */
  var openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.native
  
  /** Element to be rendered in-place where the portal is defined. */
  var trigger: js.UndefOr[ReactNode] = js.native
  
  /** Called with a ref to the trigger node. */
  var triggerRef: js.UndefOr[Ref[_]] = js.native
}
object StrictPortalProps {
  
  @scala.inline
  def apply(): StrictPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPortalProps]
  }
  
  @scala.inline
  implicit class StrictPortalPropsOps[Self <: StrictPortalProps] (val x: Self) extends AnyVal {
    
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
    def setCloseOnDocumentClick(value: Boolean): Self = this.set("closeOnDocumentClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnDocumentClick: Self = this.set("closeOnDocumentClick", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    
    @scala.inline
    def setCloseOnPortalMouseLeave(value: Boolean): Self = this.set("closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnPortalMouseLeave: Self = this.set("closeOnPortalMouseLeave", js.undefined)
    
    @scala.inline
    def setCloseOnTriggerBlur(value: Boolean): Self = this.set("closeOnTriggerBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnTriggerBlur: Self = this.set("closeOnTriggerBlur", js.undefined)
    
    @scala.inline
    def setCloseOnTriggerClick(value: Boolean): Self = this.set("closeOnTriggerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnTriggerClick: Self = this.set("closeOnTriggerClick", js.undefined)
    
    @scala.inline
    def setCloseOnTriggerMouseLeave(value: Boolean): Self = this.set("closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnTriggerMouseLeave: Self = this.set("closeOnTriggerMouseLeave", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    
    @scala.inline
    def setEventPool(value: String): Self = this.set("eventPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPool: Self = this.set("eventPool", js.undefined)
    
    @scala.inline
    def setMountNode(value: js.Any): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setMouseEnterDelay(value: Double): Self = this.set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseEnterDelay: Self = this.set("mouseEnterDelay", js.undefined)
    
    @scala.inline
    def setMouseLeaveDelay(value: Double): Self = this.set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseLeaveDelay: Self = this.set("mouseLeaveDelay", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnMount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): Self = this.set("onMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMount: Self = this.set("onMount", js.undefined)
    
    @scala.inline
    def setOnOpen(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): Self = this.set("onUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenOnTriggerClick(value: Boolean): Self = this.set("openOnTriggerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnTriggerClick: Self = this.set("openOnTriggerClick", js.undefined)
    
    @scala.inline
    def setOpenOnTriggerFocus(value: Boolean): Self = this.set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnTriggerFocus: Self = this.set("openOnTriggerFocus", js.undefined)
    
    @scala.inline
    def setOpenOnTriggerMouseEnter(value: Boolean): Self = this.set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnTriggerMouseEnter: Self = this.set("openOnTriggerMouseEnter", js.undefined)
    
    @scala.inline
    def setTrigger(value: ReactNode): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setTriggerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("triggerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerRef(value: Ref[_]): Self = this.set("triggerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerRef: Self = this.set("triggerRef", js.undefined)
    
    @scala.inline
    def setTriggerRefNull: Self = this.set("triggerRef", null)
  }
}
