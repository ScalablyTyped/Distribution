package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalPortalMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/Portal", JSImport.Default)
  @js.native
  class default ()
    extends Component[PortalProps, js.Object, js.Any]
  object default {
    
    /* was `typeof PortalInner` */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Portal/Portal", "default.Inner")
    @js.native
    class Inner ()
      extends typings.semanticUiReact.portalInnerMod.default
  }
  
  object Portal {
    
    /* was `typeof PortalInner` */
    type Inner = typings.semanticUiReact.portalInnerMod.default
  }
  type Portal = Component[PortalProps, js.Object, js.Any]
  
  trait PortalProps
    extends StObject
       with StrictPortalProps
       with /* key */ StringDictionary[js.Any]
  object PortalProps {
    
    @scala.inline
    def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
  }
  
  trait StrictPortalProps extends StObject {
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Controls whether or not the portal should close on a click outside. */
    var closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close when escape is pressed is displayed. */
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether or not the portal should close when mousing out of the portal.
      * NOTE: This will prevent `closeOnTriggerMouseLeave` when mousing over the
      * gap from the trigger to the portal.
      */
    var closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close on blur of the trigger. */
    var closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close on click of the trigger. */
    var closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should close when mousing out of the trigger. */
    var closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Event pool namespace that is used to handle component events. */
    var eventPool: js.UndefOr[String] = js.undefined
    
    /** The node where the portal should mount. */
    var mountNode: js.UndefOr[js.Any] = js.undefined
    
    /** Milliseconds to wait before opening on mouse over */
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    /** Milliseconds to wait before closing on mouse leave */
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Called when a close event happens
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClose: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is mounted on the DOM
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.undefined
    
    /**
      * Called when an open event happens
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the portal is unmounted from the DOM
      *
      * @param {null}
      * @param {object} data - All props.
      */
    var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.undefined
    
    /** Controls whether or not the portal is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should open when the trigger is clicked. */
    var openOnTriggerClick: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should open on focus of the trigger. */
    var openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether or not the portal should open when mousing over the trigger. */
    var openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined
    
    /** Element to be rendered in-place where the portal is defined. */
    var trigger: js.UndefOr[ReactNode] = js.undefined
    
    /** Called with a ref to the trigger node. */
    var triggerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  }
  object StrictPortalProps {
    
    @scala.inline
    def apply(): StrictPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPortalProps]
    }
    
    @scala.inline
    implicit class StrictPortalPropsMutableBuilder[Self <: StrictPortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseOnDocumentClick(value: Boolean): Self = StObject.set(x, "closeOnDocumentClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnDocumentClickUndefined: Self = StObject.set(x, "closeOnDocumentClick", js.undefined)
      
      @scala.inline
      def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      @scala.inline
      def setCloseOnPortalMouseLeave(value: Boolean): Self = StObject.set(x, "closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnPortalMouseLeaveUndefined: Self = StObject.set(x, "closeOnPortalMouseLeave", js.undefined)
      
      @scala.inline
      def setCloseOnTriggerBlur(value: Boolean): Self = StObject.set(x, "closeOnTriggerBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnTriggerBlurUndefined: Self = StObject.set(x, "closeOnTriggerBlur", js.undefined)
      
      @scala.inline
      def setCloseOnTriggerClick(value: Boolean): Self = StObject.set(x, "closeOnTriggerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnTriggerClickUndefined: Self = StObject.set(x, "closeOnTriggerClick", js.undefined)
      
      @scala.inline
      def setCloseOnTriggerMouseLeave(value: Boolean): Self = StObject.set(x, "closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnTriggerMouseLeaveUndefined: Self = StObject.set(x, "closeOnTriggerMouseLeave", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setEventPool(value: String): Self = StObject.set(x, "eventPool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPoolUndefined: Self = StObject.set(x, "eventPool", js.undefined)
      
      @scala.inline
      def setMountNode(value: js.Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): Self = StObject.set(x, "onMount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): Self = StObject.set(x, "onUnmount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTriggerClick(value: Boolean): Self = StObject.set(x, "openOnTriggerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTriggerClickUndefined: Self = StObject.set(x, "openOnTriggerClick", js.undefined)
      
      @scala.inline
      def setOpenOnTriggerFocus(value: Boolean): Self = StObject.set(x, "openOnTriggerFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTriggerFocusUndefined: Self = StObject.set(x, "openOnTriggerFocus", js.undefined)
      
      @scala.inline
      def setOpenOnTriggerMouseEnter(value: Boolean): Self = StObject.set(x, "openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTriggerMouseEnterUndefined: Self = StObject.set(x, "openOnTriggerMouseEnter", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerRef(value: Ref[js.Any]): Self = StObject.set(x, "triggerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "triggerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTriggerRefNull: Self = StObject.set(x, "triggerRef", null)
      
      @scala.inline
      def setTriggerRefUndefined: Self = StObject.set(x, "triggerRef", js.undefined)
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
