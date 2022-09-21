package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayTriggerMod {
  
  @JSImport("react-bootstrap/lib/OverlayTrigger", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[OverlayTriggerProps, js.Object, Any]
  
  type OverlayTrigger = Component[OverlayTriggerProps, js.Object, Any]
  
  trait OverlayTriggerProps extends StObject {
    
    // TODO: Add more specific type
    // Optional
    var animation: js.UndefOr[Any] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    // TODO: Add more specific type
    var container: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    var defaultOverlayShown: js.UndefOr[Boolean] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var delayHide: js.UndefOr[Double] = js.undefined
    
    var delayShow: js.UndefOr[Double] = js.undefined
    
    var onEnter: js.UndefOr[js.Function] = js.undefined
    
    var onEntered: js.UndefOr[js.Function] = js.undefined
    
    var onEntering: js.UndefOr[js.Function] = js.undefined
    
    var onExit: js.UndefOr[js.Function] = js.undefined
    
    var onExited: js.UndefOr[js.Function] = js.undefined
    
    var onExiting: js.UndefOr[js.Function] = js.undefined
    
    // Required
    var overlay: Any
    
    var placement: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[OverlayTrigger]] = js.undefined
    
    var rootClose: js.UndefOr[Boolean] = js.undefined
    
    var trigger: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object OverlayTriggerProps {
    
    inline def apply(overlay: Any): OverlayTriggerProps = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayTriggerProps]
    }
    
    extension [Self <: OverlayTriggerProps](x: Self) {
      
      inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDefaultOverlayShown(value: Boolean): Self = StObject.set(x, "defaultOverlayShown", value.asInstanceOf[js.Any])
      
      inline def setDefaultOverlayShownUndefined: Self = StObject.set(x, "defaultOverlayShown", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: js.Function): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: js.Function): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: js.Function): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: js.Function): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setOverlay(value: Any): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRef(value: LegacyRef[OverlayTrigger]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ OverlayTrigger | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      inline def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      inline def setTrigger(value: String | js.Array[String]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: String*): Self = StObject.set(x, "trigger", js.Array(value*))
    }
  }
}
