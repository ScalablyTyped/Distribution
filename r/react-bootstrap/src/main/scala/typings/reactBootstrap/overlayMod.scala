package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("react-bootstrap/lib/Overlay", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[OverlayProps, js.Object, Any]
  
  type Overlay = Component[OverlayProps, js.Object, Any]
  
  trait OverlayProps
    extends StObject
       with TransitionCallbacks {
    
    // Optional
    var animation: js.UndefOr[Any] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    // TODO: Add more specific type
    var container: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    // TODO: Add more specific type
    var onHide: js.UndefOr[js.Function] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var rootClose: js.UndefOr[Boolean] = js.undefined
    
    var shouldUpdatePosition: js.UndefOr[Boolean] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Function | ReactInstance] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(): OverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      inline def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      inline def setShouldUpdatePosition(value: Boolean): Self = StObject.set(x, "shouldUpdatePosition", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdatePositionUndefined: Self = StObject.set(x, "shouldUpdatePosition", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTarget(value: js.Function | ReactInstance): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
