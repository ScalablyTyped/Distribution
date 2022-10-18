package typings.reactPopperTooltip

import typings.react.mod.Component
import typings.reactPopperTooltip.distTypesMod.TooltipTriggerProps
import typings.reactPopperTooltip.distTypesMod.TooltipTriggerState
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTooltipTriggerMod {
  
  @JSImport("react-popper-tooltip/dist/TooltipTrigger", JSImport.Default)
  @js.native
  open class default () extends TooltipTrigger
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.closeOnOutOfBoundaries")
      @js.native
      def closeOnOutOfBoundaries: Boolean = js.native
      inline def closeOnOutOfBoundaries_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutOfBoundaries")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.defaultTooltipShown")
      @js.native
      def defaultTooltipShown: Boolean = js.native
      inline def defaultTooltipShown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTooltipShown")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.delayHide")
      @js.native
      def delayHide: Double = js.native
      inline def delayHide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.delayShow")
      @js.native
      def delayShow: Double = js.native
      inline def delayShow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.followCursor")
      @js.native
      def followCursor: Boolean = js.native
      inline def followCursor_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("followCursor")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.mutationObserverOptions")
      @js.native
      def mutationObserverOptions: MutationObserverInit = js.native
      inline def mutationObserverOptions_=(x: MutationObserverInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutationObserverOptions")(x.asInstanceOf[js.Any])
      
      inline def onVisibilityChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVisibilityChange")().asInstanceOf[Unit]
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.portalContainer")
      @js.native
      def portalContainer: HTMLElement | Null = js.native
      inline def portalContainer_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.trigger")
      @js.native
      def trigger: String = js.native
      inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip/dist/TooltipTrigger", "default.defaultProps.usePortal")
      @js.native
      def usePortal: Boolean = js.native
      inline def usePortal_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipTrigger extends Component[TooltipTriggerProps, TooltipTriggerState, Any] {
    
    /* private */ var clearScheduled: Any = js.native
    
    /* private */ var clickToggle: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltipTrigger(): Unit = js.native
    
    /* private */ var contextMenuToggle: Any = js.native
    
    /* private */ var getState: Any = js.native
    
    /* private */ var getTriggerProps: Any = js.native
    
    /* private */ var hideTimeout: Any = js.native
    
    /* private */ var hideTooltip: Any = js.native
    
    /* private */ var isControlled: Any = js.native
    
    /* private */ var isTriggeredBy: Any = js.native
    
    /* private */ var popperOffset: Any = js.native
    
    /* private */ var setTooltipState: Any = js.native
    
    /* private */ var showTimeout: Any = js.native
    
    /* private */ var showTooltip: Any = js.native
    
    /* private */ var toggleTooltip: Any = js.native
  }
}
