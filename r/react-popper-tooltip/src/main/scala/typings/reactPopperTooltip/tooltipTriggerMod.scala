package typings.reactPopperTooltip

import typings.react.mod.Component
import typings.reactPopperTooltip.typesMod.TooltipTriggerProps
import typings.reactPopperTooltip.typesMod.TooltipTriggerState
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTriggerMod {
  
  @JSImport("react-popper-tooltip/dist/TooltipTrigger", JSImport.Default)
  @js.native
  class default () extends TooltipTrigger
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.closeOnReferenceHidden")
      @js.native
      def closeOnReferenceHidden: Boolean = js.native
      @scala.inline
      def closeOnReferenceHidden_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnReferenceHidden")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.defaultTooltipShown")
      @js.native
      def defaultTooltipShown: Boolean = js.native
      @scala.inline
      def defaultTooltipShown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTooltipShown")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.delayHide")
      @js.native
      def delayHide: Double = js.native
      @scala.inline
      def delayHide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.delayShow")
      @js.native
      def delayShow: Double = js.native
      @scala.inline
      def delayShow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.followCursor")
      @js.native
      def followCursor: Boolean = js.native
      @scala.inline
      def followCursor_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("followCursor")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.modifiers")
      @js.native
      def modifiers: js.Array[scala.Nothing] = js.native
      @scala.inline
      def modifiers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.mutationObserverOptions")
      @js.native
      def mutationObserverOptions: MutationObserverInit = js.native
      @scala.inline
      def mutationObserverOptions_=(x: MutationObserverInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutationObserverOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.onVisibilityChange")
      @js.native
      def onVisibilityChange(): Unit = js.native
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      @scala.inline
      def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.portalContainer")
      @js.native
      def portalContainer: HTMLElement | Null = js.native
      @scala.inline
      def portalContainer_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.trigger")
      @js.native
      def trigger: String = js.native
      @scala.inline
      def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.usePortal")
      @js.native
      def usePortal: Boolean = js.native
      @scala.inline
      def usePortal_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipTrigger
    extends Component[TooltipTriggerProps, TooltipTriggerState, js.Any] {
    
    var clearScheduled: js.Any = js.native
    
    var clickToggle: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltipTrigger(): Unit = js.native
    
    var contextMenuToggle: js.Any = js.native
    
    var getState: js.Any = js.native
    
    var getTriggerProps: js.Any = js.native
    
    var hideTimeout: js.Any = js.native
    
    var hideTooltip: js.Any = js.native
    
    var isControlled: js.Any = js.native
    
    var isTriggeredBy: js.Any = js.native
    
    var popperOffset: js.Any = js.native
    
    var setTooltipState: js.Any = js.native
    
    var showTimeout: js.Any = js.native
    
    var showTooltip: js.Any = js.native
    
    var toggleTooltip: js.Any = js.native
  }
}
