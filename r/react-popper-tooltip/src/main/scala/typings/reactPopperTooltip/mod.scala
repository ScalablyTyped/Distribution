package typings.reactPopperTooltip

import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popper-tooltip", JSImport.Default)
  @js.native
  class default ()
    extends typings.reactPopperTooltip.tooltipTriggerMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-popper-tooltip", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-popper-tooltip", "default.defaultProps.closeOnReferenceHidden")
      @js.native
      def closeOnReferenceHidden: Boolean = js.native
      @scala.inline
      def closeOnReferenceHidden_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnReferenceHidden")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.defaultTooltipShown")
      @js.native
      def defaultTooltipShown: Boolean = js.native
      @scala.inline
      def defaultTooltipShown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTooltipShown")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.delayHide")
      @js.native
      def delayHide: Double = js.native
      @scala.inline
      def delayHide_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.delayShow")
      @js.native
      def delayShow: Double = js.native
      @scala.inline
      def delayShow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.followCursor")
      @js.native
      def followCursor: Boolean = js.native
      @scala.inline
      def followCursor_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("followCursor")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.modifiers")
      @js.native
      def modifiers: js.Array[scala.Nothing] = js.native
      @scala.inline
      def modifiers_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.mutationObserverOptions")
      @js.native
      def mutationObserverOptions: MutationObserverInit = js.native
      @scala.inline
      def mutationObserverOptions_=(x: MutationObserverInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutationObserverOptions")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def onVisibilityChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVisibilityChange")().asInstanceOf[Unit]
      
      @JSImport("react-popper-tooltip", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      @scala.inline
      def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.portalContainer")
      @js.native
      def portalContainer: HTMLElement | Null = js.native
      @scala.inline
      def portalContainer_=(x: HTMLElement | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.trigger")
      @js.native
      def trigger: String = js.native
      @scala.inline
      def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
      
      @JSImport("react-popper-tooltip", "default.defaultProps.usePortal")
      @js.native
      def usePortal: Boolean = js.native
      @scala.inline
      def usePortal_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(x.asInstanceOf[js.Any])
    }
  }
}
