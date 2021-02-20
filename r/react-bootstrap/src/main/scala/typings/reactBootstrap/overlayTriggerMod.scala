package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayTriggerMod {
  
  @JSImport("react-bootstrap/lib/OverlayTrigger", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[OverlayTriggerProps, js.Object, js.Any]
  
  @js.native
  trait OverlayTrigger
    extends Component[OverlayTriggerProps, js.Object, js.Any]
  
  @js.native
  trait OverlayTriggerProps extends Props[OverlayTrigger] {
    
    // TODO: Add more specific type
    // Optional
    var animation: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var container: js.UndefOr[js.Any] = js.native
    
    // TODO: Add more specific type
    var containerPadding: js.UndefOr[Double] = js.native
    
    var defaultOverlayShown: js.UndefOr[Boolean] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var delayHide: js.UndefOr[Double] = js.native
    
    var delayShow: js.UndefOr[Double] = js.native
    
    var onEnter: js.UndefOr[js.Function] = js.native
    
    var onEntered: js.UndefOr[js.Function] = js.native
    
    var onEntering: js.UndefOr[js.Function] = js.native
    
    var onExit: js.UndefOr[js.Function] = js.native
    
    var onExited: js.UndefOr[js.Function] = js.native
    
    var onExiting: js.UndefOr[js.Function] = js.native
    
    // Required
    var overlay: js.Any = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var rootClose: js.UndefOr[Boolean] = js.native
    
    var trigger: js.UndefOr[String | js.Array[String]] = js.native
  }
  object OverlayTriggerProps {
    
    @scala.inline
    def apply(overlay: js.Any): OverlayTriggerProps = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayTriggerProps]
    }
    
    @scala.inline
    implicit class OverlayTriggerPropsMutableBuilder[Self <: OverlayTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDefaultOverlayShown(value: Boolean): Self = StObject.set(x, "defaultOverlayShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOverlayShownUndefined: Self = StObject.set(x, "defaultOverlayShown", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      @scala.inline
      def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Function): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Function): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Function): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Function): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setOverlay(value: js.Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      @scala.inline
      def setTrigger(value: String | js.Array[String]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: String*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    }
  }
}
