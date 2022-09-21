package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPaneMod {
  
  @JSImport("react-bootstrap/lib/TabPane", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[TabPaneProps, js.Object, Any]
  
  type TabPane = Component[TabPaneProps, js.Object, Any]
  
  trait TabPaneProps
    extends StObject
       with TransitionCallbacks
       with HTMLProps[TabPane] {
    
    var animation: js.UndefOr[Boolean | (ComponentClass[Any, ComponentState])] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object TabPaneProps {
    
    inline def apply(): TabPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPaneProps]
    }
    
    extension [Self <: TabPaneProps](x: Self) {
      
      inline def setAnimation(value: Boolean | (ComponentClass[Any, ComponentState])): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
